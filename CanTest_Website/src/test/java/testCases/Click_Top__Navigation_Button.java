package testCases;



import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import commonActions.CommonFunctions;
import pageObject.About_Page_Page_Objects;
import pageObject.Careers_Page_Page_Objects;
import pageObject.Contact_Page_Page_Objects;
import pageObject.Home_Page_Page_Objects;
import pageObject.Industries_Page_Page_Objects;
import pageObject.Services_Page_Page_Objects;
public class Click_Top__Navigation_Button extends CommonFunctions {
	
	

	Logger logger = Logger.getLogger(Click_Top__Navigation_Button.class);
	@Test
	public void clickTopBtn() throws InterruptedException  {
		
		
		PageFactory.initElements(driver,About_Page_Page_Objects.class);
		logger.info("ClickThe About Button");
		testcase = extentReport.createTest("Click All Top Naviation Pages");

		About_Page_Page_Objects.aboutPageObjects.click();
		
		Thread.sleep(2000);
		PageFactory.initElements(driver,Home_Page_Page_Objects.class);
		logger.info("Click The Home Page");
		Home_Page_Page_Objects.homePageObjects.click();
		Thread.sleep(2000);

		PageFactory.initElements(driver,Services_Page_Page_Objects.class);
		logger.info("Click Service Page");
		Services_Page_Page_Objects.servicesPageObjects.click();
		Thread.sleep(2000);
		PageFactory.initElements(driver,Industries_Page_Page_Objects.class);
		logger.info("Click Industries Page");
		Industries_Page_Page_Objects.ClickIndustries.click();
		Thread.sleep(2000);
		PageFactory.initElements(driver,Contact_Page_Page_Objects.class);
		logger.info("Click contact Page");
		Contact_Page_Page_Objects.contactPageObjects.click();
		Thread.sleep(2000);
		PageFactory.initElements(driver,Careers_Page_Page_Objects.class);
		logger.info("Click Careers Page");
		Careers_Page_Page_Objects.careersPageObjects.click();
			

	}

}
