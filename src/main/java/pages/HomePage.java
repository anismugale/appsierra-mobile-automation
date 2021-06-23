package pages;

import org.openqa.selenium.WebElement;
import base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePage extends BasePage {

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Preference']")
	public WebElement preferences;

	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Content\"]")
	public WebElement content;

	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"OS\"]")
	public WebElement operatingSystem;

	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Views\"]")
	public WebElement views;

    public HomePage(AppiumDriver driver) {
        super(driver);
    }
}
