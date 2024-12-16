package testCases;


import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import commonActions.CommonFunctions;
import pageObject.Careers_Page_Page_Objects;

public class Click_Careers_Page_Input extends CommonFunctions{


	static Logger logger = Logger.getLogger(Click_Careers_Page_Input.class);
	

	@Test
	public void clickCareers() throws InterruptedException {

		testcase = extentReport.createTest("On Click Careers Tap all functions");

		PageFactory.initElements(driver,Careers_Page_Page_Objects.class);
		logger.info("Click Careers Page");
		
		Careers_Page_Page_Objects.careersPageObjects.click();

		Thread.sleep(2000);
		logger.info("Click Joinus Button");
//		Careers_Page_Page_Objects.clickContactUs.click();
//		Thread.sleep(2000);
//		
		

	}
}
