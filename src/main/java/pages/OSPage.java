package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;
import io.appium.java_client.AppiumDriver;

public class OSPage extends BasePage{

	@FindBy(id="io.appium.android.apis:id/sms_enable_receiver")
	public WebElement enableBroadcast;

	@FindBy(xpath="//android.widget.TextView[@content-desc=\"SMS Messaging\"]")
	public WebElement smsMessaging;

	@FindBy(id="io.appium.android.apis:id/sms_recipient")
	public WebElement recipient;

	@FindBy(id="io.appium.android.apis:id/sms_content")
	public WebElement messageBody;

	@FindBy(id="io.appium.android.apis:id/sms_send_message")
	public WebElement sendButton;

	public OSPage(AppiumDriver driver) {
		super(driver);
	}


}

