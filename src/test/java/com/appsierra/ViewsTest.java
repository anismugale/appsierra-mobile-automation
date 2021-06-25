package com.appsierra;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class ViewsTest extends TestBase{
	
	@Test(priority=1)
	public void viewsTest() {
		pages.homePage().wait.forElementToBeVisible(pages.homePage().views);
		pages.homePage().views.click();
		pages.viewsPage().expandableLists.click();
		pages.viewsPage().customAdaptor.click();
		pages.viewsPage().peopleNames.click();
		pages.viewsPage().longPress(pages.viewsPage().peopleNames, 4);
		Assert.assertTrue(pages.viewsPage().peopleNames.isDisplayed());
		pages.viewsPage().back();
		pages.viewsPage().customAdaptor.isDisplayed();
		pages.viewsPage().back();
		pages.viewsPage().controls.click();
		pages.viewsPage().darkTheme.click();
		pages.viewsPage().textBox.sendKeys("Hello");
		pages.viewsPage().hideKeyboard();
		pages.viewsPage().radioButton.click();
		pages.viewsPage().starButton.click();
		pages.viewsPage().select.click();
		pages.viewsPage().selectEarth.click();
		Assert.assertTrue(pages.viewsPage().select.isDisplayed());
	}
	
	@Test(priority=2)
	public void progressBars() {
		pages.homePage().wait.forElementToBeVisible(pages.homePage().views);
		pages.homePage().views.click();
		pages.viewsPage().scrollIntoView("Rotating Button");
		pages.viewsPage().rotatingButton.click();
		pages.viewsPage().progressBar(pages.viewsPage().txBar);
		pages.viewsPage().progressBar(pages.viewsPage().syBar);
		Assert.assertTrue(pages.viewsPage().syBar.isDisplayed());
	}
	
	@Test(priority=3)
	 public void dragging() {
		pages.homePage().wait.forElementToBeVisible(pages.homePage().views);
		pages.homePage().views.click();
		pages.viewsPage().dateWidgets.click();
		pages.viewsPage().inline.click();
		pages.viewsPage().clock_9.click();
		pages.viewsPage().moveTo(pages.viewsPage().clock_15, pages.viewsPage().clock_45);
		Assert.assertTrue(pages.viewsPage().clock_45.isDisplayed());
		pages.viewsPage().back();
		pages.viewsPage().inline.isDisplayed();
		pages.viewsPage().back();
		pages.viewsPage().dragDrop.click();
		pages.viewsPage().dragAndDrop(pages.viewsPage().dot1, pages.viewsPage().dot2);
		Assert.assertTrue(pages.viewsPage().dot1.isDisplayed());
	}
	
	@Test(priority=4)
	 public void popUpMenu() {
		pages.homePage().wait.forElementToBeVisible(pages.homePage().views);
		pages.homePage().views.click();
		pages.viewsPage().scrollIntoView("Popup Menu");
		pages.viewsPage().popUp.click();
		pages.viewsPage().makePopup.click();
		pages.viewsPage().edit.click();
		pages.viewsPage().share.click();
		Assert.assertTrue(pages.viewsPage().makePopup.isDisplayed());
		pages.viewsPage().back();
		pages.viewsPage().scrollIntoView("Switches");
		pages.viewsPage().switches.click();
		pages.viewsPage().stdSwitch.click();
		pages.viewsPage().monitored.click();
		Assert.assertTrue(pages.viewsPage().monitored.isDisplayed());
	}
}
