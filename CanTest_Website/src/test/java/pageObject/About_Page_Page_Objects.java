package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class About_Page_Page_Objects {
	@FindBy(xpath="//a[text()='About']")
	public static WebElement aboutPageObjects;
}
