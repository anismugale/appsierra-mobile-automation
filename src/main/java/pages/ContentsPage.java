package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;
import io.appium.java_client.AppiumDriver;

public class ContentsPage extends BasePage {

	
    @FindBy(xpath="//android.widget.TextView[@content-desc=\"Storage\"]")
	public WebElement storage;
	
	@FindBy(id="android:id/text1")
	public WebElement externalStorage;
	
	@FindBy(xpath="(//android.widget.Button[@content-desc=\"Create\"])[1]")
	public WebElement create;
	
	@FindBy(xpath="(//android.widget.Button[@content-desc=\"Delete\"])[1]")
	public WebElement delete;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc=\"Provider\"]")
	public WebElement provider;
	
	@FindBy(xpath="//android.widget.TextView[@content-desc=\"Pick Contact\"]")
	public WebElement pickContact;
	
	@FindBy(id="io.appium.android.apis:id/pick_contact")
	public WebElement contactButton;
	
	@FindBy(xpath="//*[contains(@text,'Choose a contact')]")
	public WebElement chooseContact;
	
	public ContentsPage(AppiumDriver driver) {
        super(driver);
    }
	
}
