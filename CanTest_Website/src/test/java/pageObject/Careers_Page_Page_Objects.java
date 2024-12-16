package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Careers_Page_Page_Objects {
	@FindBy(xpath = "//a[text()='Careers']")
	public static WebElement careersPageObjects;
	
	@FindBy(xpath = "//button[@class=\"careers-page-btn\"]")
	public static WebElement clickContactUs;
	
	
}
