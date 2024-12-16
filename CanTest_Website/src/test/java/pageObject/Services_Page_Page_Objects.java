package pageObject;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Services_Page_Page_Objects {
	@FindBy(xpath = "//a[@class=\"nav-link \"]")
	public static WebElement servicesPageObjects;

	@FindBy(xpath = "//a[text()='AI/ML SOLUTIONS']")
	public static WebElement clickAimlSolutions;

	@FindBy(xpath = "//a[text()='CLOUD SOLUTIONS']")
	public static WebElement clickCloudSolutions;

	@FindBy(xpath = "//a[text()='DIGITAL TRANSFORMATION']")
	public static WebElement clickDigitalService;

	@FindBy(xpath = "//a[text()='IT CONSULTING']")
	public static WebElement clickItConsulting;

	@FindBy(xpath = "//a[text()='ENTERPRISES SOLUTIONS']")
	public static WebElement clickEnterprisesSolUTIONS;
	
	@FindBy(xpath = "//a[text()='APPLICATION ENGINEERING']")
	public static WebElement clickApplicationEng;


//	@FindBy(xpath = "//a[text()='WEB & APP DEVELOPMENT']")
//	public static WebElement clickWebAppDevelopment;

}
