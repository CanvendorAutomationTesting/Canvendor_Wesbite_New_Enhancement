package commonActions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class CommonFunctions { 	
	public static Properties properties;
	public static WebDriver driver;
	public static ExtentReports extentReport;
	public static ExtentHtmlReporter htmlReporter;
	public static ExtentTest testcase;

	Logger logger = Logger.getLogger(CommonFunctions.class);

	public void loadPropertyFile() throws IOException {
		try (FileInputStream fileInputStream = new FileInputStream("config.properties")) {
			properties = new Properties();
			properties.load(fileInputStream);
		}
	}

	@BeforeSuite
	public void launchBrowser() throws IOException {
		// Initialize ExtentReports and attach the reporter before creating a test
		extentReport = new ExtentReports();
		htmlReporter = new ExtentHtmlReporter("ExtentReport.html");
		extentReport.attachReporter(htmlReporter);

		// Create a test case for configuring the property file
		testcase = extentReport.createTest("Configure the property file");

		PropertyConfigurator.configure("log4j.properties");
		logger.info("Canvendor Website Test Begins");
		logger.info("Loading property file");

		loadPropertyFile();
		String browser = properties.getProperty("browser");
		String url = properties.getProperty("url");

		switch (browser.toLowerCase()) {
		case "chrome":
			logger.info("Launching Chrome browser");
			driver = new ChromeDriver();
			break;
		case "firefox":
			logger.info("Launching Firefox browser");
			driver = new FirefoxDriver();
			break;
		default:
			throw new IllegalArgumentException("Unsupported browser: " + browser);
		}
		
		driver.manage().window().maximize();
		logger.info("Navigating to Application");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		verifyTitle("Canvendor");
	}

	private void verifyTitle(String expectedTitle) {
		String actualTitle = driver.getTitle();
		testcase.log(Status.INFO, "Actual title: " + actualTitle);
		testcase.log(Status.INFO, "Expected title: " + expectedTitle);
		testcase.log(Status.INFO, "Verification of Actual and Expected title");

		if (actualTitle.equals(expectedTitle)) {
			testcase.log(Status.PASS, "Expected title and Actual title are equal");
		} else {
			testcase.log(Status.FAIL, "Expected title and Actual title are NOT equal");
			takeScreenshot("Title_Mismatch.png");
		}
	} 

	private void takeScreenshot(String fileName) {
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile = new File(fileName);
		try {
			FileHandler.copy(sourceFile, destinationFile);
			testcase.addScreenCaptureFromPath(fileName);
		} catch (IOException e) {
			logger.error("Error while taking screenshot: " + e.getMessage());
		}
	}

	@AfterSuite(alwaysRun = true)
	public void closeBrowser() {
		logger.info("Execution done. Closing the browser.");
		if (driver != null) {
			driver.quit();
			logger.info("Browser closed successfully.");
		} else {
			logger.warn("Driver was null, browser was not opened.");
		}
		extentReport.flush();
	}
}
