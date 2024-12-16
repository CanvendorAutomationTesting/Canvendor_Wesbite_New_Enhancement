package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Insights_PageObject {
	@FindBy(xpath = "//a[text()='Insights']")
	public static WebElement ClickInsights;
	//button[@class='scroll-to-top-btn']
	@FindBy(xpath = "//button[@class='scroll-to-top-btn']")
	public static WebElement clickTopBtn;
}
