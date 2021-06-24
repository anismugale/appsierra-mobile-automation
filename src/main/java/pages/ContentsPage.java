package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ContentsPage extends BasePage {

	WebDriver driver;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Storage\"]")
	public WebElement storage;
	
	@AndroidFindBy(id="android:id/text1")
	public WebElement externalStorage;
	
	@AndroidFindBy(xpath="(//android.widget.Button[@content-desc=\"Create\"])[1]")
	public WebElement create;
	
	@AndroidFindBy(xpath="(//android.widget.Button[@content-desc=\"Delete\"])[1]")
	public WebElement delete;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Provider\"]")
	public WebElement provider;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Pick Contact\"]")
	public WebElement pickContact;
	
	@AndroidFindBy(id="io.appium.android.apis:id/pick_contact")
	public WebElement contactButton;
	
	@AndroidFindBy(xpath="//*[contains(@text,'Choose a contact')]")
	public WebElement chooseContact;
	
	public ContentsPage(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
    }
	
}
