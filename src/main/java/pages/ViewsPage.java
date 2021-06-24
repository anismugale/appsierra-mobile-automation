package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ViewsPage extends BasePage{

	WebDriver driver;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Expandable Lists\"]")
	public WebElement expandableLists;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"1. Custom Adapter\"]")
	public WebElement customAdaptor;
	
	@AndroidFindBy(xpath="//*[contains(@text,'People Names')]")
	public WebElement peopleNames;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Controls\"]")
	public WebElement controls;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"2. Dark Theme\"]")
	public WebElement darkTheme;
	
	@AndroidFindBy(id="io.appium.android.apis:id/edit")
	public WebElement textBox;
	
	@AndroidFindBy(id="io.appium.android.apis:id/radio1")
	public WebElement radioButton;
	
	@AndroidFindBy(id="io.appium.android.apis:id/star")
	public WebElement starButton;
	
	@AndroidFindBy(id="io.appium.android.apis:id/spinner1")
	public WebElement select;
	
	@AndroidFindBy(xpath="//*[contains(@text,'Earth')]")
	public WebElement selectEarth;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Rotating Button\"]")
	public WebElement rotatingButton;
	
	@AndroidFindBy(id="io.appium.android.apis:id/translationX")
	public WebElement txBar;
	
	@AndroidFindBy(id="io.appium.android.apis:id/scaleY")
	public WebElement syBar;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Date Widgets\"]")
	public WebElement dateWidgets;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"2. Inline\"]")
	public WebElement inline;
	
	@AndroidFindBy(xpath="//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"9\"]")
	public WebElement clock_9;
	
	@AndroidFindBy(xpath="//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"15\"]")
	public WebElement clock_15;
	
	@AndroidFindBy(xpath="//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"45\"]")
	public WebElement clock_45;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Drag and Drop\"]")
	public WebElement dragDrop;
	
	@AndroidFindBy(id="io.appium.android.apis:id/drag_dot_1")
	public WebElement dot1;
	
	@AndroidFindBy(id="io.appium.android.apis:id/drag_dot_2")
	public WebElement dot2;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Popup Menu\"]")
	public WebElement popUp;
	
	@AndroidFindBy(xpath="//android.widget.Button[@content-desc=\"Make a Popup!\"]")
	public WebElement makePopup;
	
	@AndroidFindBy(xpath="//*[contains(@text,'Edit')]")
	public WebElement edit;
	
	@AndroidFindBy(xpath="//*[contains(@text,'Share')]")
	public WebElement share;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@content-desc=\"Switches\"]")
	public WebElement switches;
	
	@AndroidFindBy(xpath="//android.widget.Switch[@content-desc=\"Standard switch\"and @checkable='true']")
	public WebElement stdSwitch;
	
	@AndroidFindBy(xpath="//android.widget.Switch[@content-desc=\"Monitored switch\"and @checkable='true']")
	public WebElement monitored;
	
	 public ViewsPage(AppiumDriver driver) {
	        super(driver);
	        this.driver = driver;
	    }
	
}
