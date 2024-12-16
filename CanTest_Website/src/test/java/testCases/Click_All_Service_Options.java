package testCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import commonActions.CommonFunctions;
import pageObject.Services_Page_Page_Objects;


public class Click_All_Service_Options extends CommonFunctions {


	static Logger logger = Logger.getLogger(Click_All_Service_Options.class);
	@Test
	public void serviceOptions() throws InterruptedException {

		PageFactory.initElements(driver,Services_Page_Page_Objects.class);
	
		
		logger.info("Click Service Page Tap");
		testcase = extentReport.createTest("Click All Service Page functions");
		Thread.sleep(2000);
		Services_Page_Page_Objects.servicesPageObjects.click();
		Thread.sleep(2000);
		logger.info("Click AimlSolutions Page");
		Services_Page_Page_Objects.clickAimlSolutions.click();
		
		Thread.sleep(2000);
		Services_Page_Page_Objects.servicesPageObjects.click();
		Services_Page_Page_Objects.clickApplicationEng.click();
		
		Thread.sleep(2000);
		logger.info("Click Services Page Tap");
		Services_Page_Page_Objects.servicesPageObjects.click();
		Services_Page_Page_Objects.servicesPageObjects.click();
		
		Thread.sleep(2000);
		logger.info("Click CloudSolutions Page");
		Services_Page_Page_Objects.servicesPageObjects.click();
		Services_Page_Page_Objects.clickCloudSolutions.click();
		Thread.sleep(2000);
		
		logger.info("Click DigitalService Page");
		Services_Page_Page_Objects.servicesPageObjects.click();
		Services_Page_Page_Objects.clickDigitalService.click();
		Thread.sleep(2000);
		
		logger.info("Click Services Page Tap");
		Services_Page_Page_Objects.servicesPageObjects.click();
		Services_Page_Page_Objects.servicesPageObjects.click();
		Thread.sleep(2000);
		
		logger.info("Click Services Page Tap");
		
	
		
		logger.info("Click servicesPage Page Tap");
		Services_Page_Page_Objects.servicesPageObjects.click();
		Thread.sleep(2000);
		logger.info("Click EnterprisesSolUTIONS Page Tap");
		Services_Page_Page_Objects.clickEnterprisesSolUTIONS.click();
		Thread.sleep(2000);
		
		Services_Page_Page_Objects.servicesPageObjects.click();
		logger.info("Click ItConsulting Page Tap");
		Services_Page_Page_Objects.clickItConsulting.click();
		Thread.sleep(2000);


	}

}
