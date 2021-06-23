package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;
import io.appium.java_client.AppiumDriver;

public class ViewsPage extends BasePage{

	
    @FindBy(xpath="//android.widget.TextView[@content-desc=\"Expandable Lists\"]")
	public WebElement expandableLists;
	
    @FindBy(xpath="//android.widget.TextView[@content-desc=\"1. Custom Adapter\"]")
	public WebElement customAdaptor;
	
    @FindBy(xpath="//*[contains(@text,'People Names')]")
	public WebElement peopleNames;
	
    @FindBy(xpath="//*[contains(@text,'Sample action')]")
	public WebElement sampleAction;
	
    @FindBy(xpath="//android.widget.TextView[@content-desc=\"Controls\"]")
	public WebElement controls;
	
    @FindBy(xpath="//android.widget.TextView[@content-desc=\"2. Dark Theme\"]")
	public WebElement darkTheme;
	
    @FindBy(id="io.appium.android.apis:id/edit")
	public WebElement textBox;
	
    @FindBy(id="io.appium.android.apis:id/radio1")
	public WebElement radioButton;
	
    @FindBy(id="io.appium.android.apis:id/star")
	public WebElement starButton;
	
    @FindBy(id="io.appium.android.apis:id/spinner1")
	public WebElement select;
	
    @FindBy(xpath="//*[contains(@text,'Earth')]")
	public WebElement selectEarth;
	
    @FindBy(xpath="//android.widget.TextView[@content-desc=\"Rotating Button\"]")
	public WebElement rotatingButton;
	
    @FindBy(id="io.appium.android.apis:id/translationX")
	public WebElement txBar;
	
    @FindBy(id="io.appium.android.apis:id/scaleY")
	public WebElement syBar;
	
    @FindBy(id="io.appium.android.apis:id/rotationX")
	public WebElement xBar;
	
    @FindBy(id="io.appium.android.apis:id/rotationZ")
	public WebElement zBar;
	
    @FindBy(xpath="//android.widget.TextView[@content-desc=\"Rating Bar\"]")
	public WebElement ratingBar;
	
    @FindBy(id="io.appium.android.apis:id/ratingbar2")
	public WebElement ratings;
	
    @FindBy(xpath="//android.widget.TextView[@content-desc=\"Seek Bar\"]")
	public WebElement seekBarButton;
	
    @FindBy(id="io.appium.android.apis:id/seek")
	public WebElement seekBar;
	
    @FindBy(xpath="//android.widget.TextView[@content-desc=\"Date Widgets\"]")
	public WebElement dateWidgets;
	
    @FindBy(xpath="//android.widget.TextView[@content-desc=\"2. Inline\"]")
	public WebElement inline;
	
    @FindBy(xpath="//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"9\"]")
	public WebElement clock_9;
	
    @FindBy(xpath="//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"15\"]")
	public WebElement clock_15;
	
    @FindBy(xpath="//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc=\"45\"]")
	public WebElement clock_45;
	
    @FindBy(xpath="//android.widget.TextView[@content-desc=\"Drag and Drop\"]")
	public WebElement dragDrop;
	
    @FindBy(id="io.appium.android.apis:id/drag_dot_1")
	public WebElement dot1;
	
    @FindBy(id="io.appium.android.apis:id/drag_dot_2")
	public WebElement dot2;
	
    @FindBy(xpath="//android.widget.TextView[@content-desc=\"Popup Menu\"]")
	public WebElement popUp;
	
    @FindBy(xpath="//android.widget.Button[@content-desc=\"Make a Popup!\"]")
	public WebElement makePopup;
	
    @FindBy(xpath="//*[contains(@text,'Edit')]")
	public WebElement edit;
	
    @FindBy(xpath="//*[contains(@text,'Share')]")
	public WebElement share;
	
    @FindBy(xpath="//android.widget.TextView[@content-desc=\"Switches\"]")
	public WebElement switches;
	
    @FindBy(xpath="//android.widget.Switch[@content-desc=\"Standard switch\"and @checkable='true']")
	public WebElement stdSwitch;
	
    @FindBy(xpath="//android.widget.Switch[@content-desc=\"Monitored switch\"and @checkable='true']")
	public WebElement monitored;
	
    @FindBy(xpath="//android.widget.Switch[@content-desc=\"Customized text\"and @checkable='true']")
	public WebElement customized;
	
	 public ViewsPage(AppiumDriver driver) {
	        super(driver);
	    }
	
}
