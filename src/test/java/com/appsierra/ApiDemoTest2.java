package com.appsierra;
import org.testng.annotations.Test;

import base.TestBase;

public class ApiDemoTest2 extends TestBase{
	
	@Test
	 void viewsTest() {
		pages.homePage().wait.forElementToBeVisible(pages.homePage().views);
		pages.homePage().views.click();
		pages.viewsPage().expandableLists.click();
		pages.viewsPage().customAdaptor.click();
		pages.viewsPage().peopleNames.click();
		pages.viewsPage().back();
		pages.viewsPage().back();
		pages.viewsPage().controls.click();
		pages.viewsPage().darkTheme.click();
		pages.viewsPage().textBox.sendKeys("Hello");
		pages.viewsPage().hideKeyboard();
		pages.viewsPage().radioButton.click();
		pages.viewsPage().starButton.click();
		pages.viewsPage().select.click();
		pages.viewsPage().selectEarth.click();
	}
	
	@Test
	void progressBars() {
		pages.homePage().wait.forElementToBeVisible(pages.homePage().views);
		pages.homePage().views.click();
		pages.viewsPage().scrollIntoView("Rotating Button");
		pages.viewsPage().rotatingButton.click();
		pages.viewsPage().progressBar(pages.viewsPage().txBar);
		pages.viewsPage().progressBar(pages.viewsPage().syBar);
		pages.viewsPage().back();
	}
	
	@Test
	 void dragging() {
		pages.homePage().wait.forElementToBeVisible(pages.homePage().views);
		pages.homePage().views.click();
		pages.viewsPage().dateWidgets.click();
		pages.viewsPage().inline.click();
		pages.viewsPage().clock_9.click();
		pages.viewsPage().moveTo(pages.viewsPage().clock_15, pages.viewsPage().clock_45);
		pages.viewsPage().back();
		pages.viewsPage().back();
		pages.viewsPage().dragDrop.click();
		pages.viewsPage().dragAndDrop(pages.viewsPage().dot1, pages.viewsPage().dot2);
	}
	
	@Test
	 void popUpMenu() {
		pages.homePage().wait.forElementToBeVisible(pages.homePage().views);
		pages.homePage().views.click();
		pages.viewsPage().popUp.click();
		pages.viewsPage().makePopup.click();
		pages.viewsPage().edit.click();
		pages.viewsPage().share.click();
		pages.viewsPage().back();
		pages.viewsPage().switches.click();
		pages.viewsPage().stdSwitch.click();
		pages.viewsPage().monitored.click();
		pages.viewsPage().customized.click();
	}
}
