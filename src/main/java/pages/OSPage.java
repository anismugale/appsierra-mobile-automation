package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class OSPage extends BasePage{

	WebDriver driver;
	
	@AndroidFindBy(id="io.appium.android.apis:id/sms_enable_receiver")
	public WebElement enableBroadcast;

	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"SMS Messaging\"]")
	public WebElement smsMessaging;

	@AndroidFindBy(id="io.appium.android.apis:id/sms_recipient")
	public WebElement recipient;

	@AndroidFindBy(id="io.appium.android.apis:id/sms_content")
	public WebElement messageBody;

	@AndroidFindBy(id="io.appium.android.apis:id/sms_send_message")
	public WebElement sendButton;

	public OSPage(AppiumDriver driver) {
		super(driver);
		this.driver = driver;
	}


}

