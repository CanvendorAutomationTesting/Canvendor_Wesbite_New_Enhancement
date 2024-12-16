package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Contact_Page_Page_Objects {
	@FindBy(xpath = "//a[text()='Contact']")
	public static WebElement contactPageObjects;

	@FindBy(xpath ="//input[@id='uname']")
	public static WebElement inputName;

	@FindBy(xpath ="//input[@id='email']")
	public static WebElement inputEmail;

	@FindBy(xpath ="//input[@id='subject']")
	public static WebElement inputSubject;

	@FindBy(xpath = "//textarea[@name='message']")
	public static WebElement inputMessage;
	
	@FindBy(xpath ="//button[@type='submit']")
	public static WebElement clickSendMessageBtn;
	
	@FindBy(xpath = "//input[@name='email']//following::input[2]")
	public static WebElement belowInputEmail;
	
//	@FindBy(xpath = "//a[text()='Terms of service']")
//	public static WebElement clickTerms;

//	@FindBy(xpath = "//a[text()='Privacy policy']")
//	public static WebElement clickPrivacy;
	
	@FindBy(xpath = "//button[@class='tp-btn-border contact-mail-btn']")
	public static WebElement clickSubmitBtn;
	
	
	@FindBy(xpath = "//button[text()='Ok']")
	public static WebElement ClickOkayBtn;
}
