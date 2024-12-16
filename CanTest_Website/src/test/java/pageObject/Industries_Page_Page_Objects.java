package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Industries_Page_Page_Objects {
	@FindBy(xpath = "//a[@class=\"nav-link scrollto\"]")
	public static WebElement ClickIndustries;

	

	@FindBy(xpath = "//a[text()='AUTOMOTIVE']")	
	public static WebElement clickAutomotive;


	@FindBy(xpath = "//a[text()='BANKING']")
	public static WebElement clickBanking;


	@FindBy(xpath = "//a[text()='HEALTHCARE']")
	public static WebElement clickHealthCare;

	@FindBy(xpath = "//a[text()='INSURANCE']")
	public static WebElement clickInsurance;
	
	@FindBy(xpath = "//a[text()='MANUFACTURING']")
	public static WebElement clickManufacturing;
	

}
