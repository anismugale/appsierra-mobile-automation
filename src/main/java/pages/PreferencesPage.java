package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;
import io.appium.java_client.AppiumDriver;

public class PreferencesPage extends BasePage  {
	

    @FindBy(xpath="//android.widget.TextView[@text='3. Preference dependencies']")
	public WebElement dependencies;
	
    @FindBy(id="android:id/checkbox")
	public WebElement checkbox;
	
    @FindBy(xpath="(//android.widget.RelativeLayout)[2]")
	public WebElement layout;
	
    @FindBy(className="android.widget.EditText")
	public WebElement editText;
	
	
	public PreferencesPage(AppiumDriver driver) {
        super(driver);
    }
	
	
}
