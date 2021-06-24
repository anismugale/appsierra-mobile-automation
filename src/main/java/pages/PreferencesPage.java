package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PreferencesPage extends BasePage  {
	
	WebDriver driver;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='3. Preference dependencies']")
	public WebElement dependencies;
	
	@AndroidFindBy(id="android:id/checkbox")
	public WebElement checkbox;
	
	@AndroidFindBy(xpath="(//android.widget.RelativeLayout)[2]")
	public WebElement layout;
	
	@AndroidFindBy(className="android.widget.EditText")
	public WebElement editText;
	
	@AndroidFindBy(className="android.widget.Button")
	public List<AndroidElement> buttons;
	
	
	public PreferencesPage(AppiumDriver driver) {
        super(driver);
        this.driver = driver;
    }
	
	
}
