	package testCases;
	
	import org.apache.log4j.Logger;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.annotations.Test;
	
	import com.aventstack.extentreports.ExtentReports;
	import com.aventstack.extentreports.ExtentTest;
	import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
	
	import commonActions.CommonFunctions;
	import pageObject.Industries_Page_Page_Objects;
	
	public class Click_All_Industries_Options extends CommonFunctions {
	
	
		Logger logger = Logger.getLogger(Click_All_Industries_Options.class);
		@Test
		public void clickIndustriesBtn() throws InterruptedException {
	
			PageFactory.initElements(driver,Industries_Page_Page_Objects.class);
			
			testcase = extentReport.createTest("Click All Induestries Page functions");
			logger.info("Click Industries Page Tap");
			Industries_Page_Page_Objects.ClickIndustries.click();
			Thread.sleep(2000);
			
			
		
			logger.info("Click Automotive Page Tap");
			Industries_Page_Page_Objects.clickAutomotive.click();
			Thread.sleep(2000);
			
			Industries_Page_Page_Objects.ClickIndustries.click();
			logger.info("Click Industries Page Tap");
			Industries_Page_Page_Objects.ClickIndustries.click();
			Thread.sleep(2000);
			
			Industries_Page_Page_Objects.ClickIndustries.click();
			logger.info("Click Banking Page Tap");
			Industries_Page_Page_Objects.clickBanking.click();
			Thread.sleep(2000);
			
			logger.info("Click Industries Page Tap");
			Industries_Page_Page_Objects.ClickIndustries.click();
			logger.info("Click Industries Page Tap");
	//		
			Industries_Page_Page_Objects.ClickIndustries.click();
			Thread.sleep(2000);
			logger.info("Click HealthCare Page Tap");
			Industries_Page_Page_Objects.clickHealthCare.click();
			logger.info("Click Industries Page Tap");
			Industries_Page_Page_Objects.ClickIndustries.click();
			Thread.sleep(2000);
	
			logger.info("Click Insurance Page Tap");
			Industries_Page_Page_Objects.clickInsurance.click();
	//		System.out.println("Industries options are clicked");
			Thread.sleep(2000);
			
			
			Industries_Page_Page_Objects.ClickIndustries.click();
			logger.info("Click Manufacturing Page Tap");
			Industries_Page_Page_Objects.clickManufacturing.click();
		}
	
	}
