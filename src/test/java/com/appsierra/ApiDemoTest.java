package com.appsierra;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.TestBase;

public class ApiDemoTest extends TestBase{
	
	@Test(priority=1)
	public void preferencesTest() {
		pages.homePage().wait.forElementToBeVisible(pages.homePage().preferences);
		pages.homePage().preferences.click();
		pages.preferencesPage().dependencies.click();
		pages.preferencesPage().checkbox.click();
		pages.preferencesPage().layout.click();
		pages.preferencesPage().editText.sendKeys("Hello");
		pages.preferencesPage().buttons.get(1).click();
	    Assert.assertTrue(pages.preferencesPage().layout.isDisplayed());
	}
	@Test(priority=2)
	 public void contentTest() {
		pages.homePage().wait.forElementToBeVisible(pages.homePage().content);
		pages.homePage().content.click();
		pages.contentsPage().storage.click();
		pages.contentsPage().externalStorage.click();
		pages.contentsPage().create.click();
		pages.contentsPage().delete.click();
		Assert.assertTrue(pages.contentsPage().create.isDisplayed());
		pages.contentsPage().back();
		pages.contentsPage().externalStorage.isDisplayed();
		pages.contentsPage().back();
		pages.contentsPage().provider.click();
		pages.contentsPage().pickContact.click();
		pages.contentsPage().contactButton.click();
		Assert.assertTrue(pages.contentsPage().chooseContact.isDisplayed());
	}
		
	@Test(priority=3)
	public void osTest() {
		pages.homePage().wait.forElementToBeVisible(pages.homePage().operatingSystem);
		pages.homePage().operatingSystem.click();
		pages.osPage().smsMessaging.click();
		pages.osPage().enableBroadcast.click();
		pages.osPage().recipient.sendKeys("9876543210");
		pages.osPage().messageBody.sendKeys("Welcome to AppSierra");
		pages.osPage().sendButton.click();
		Assert.assertTrue(pages.osPage().sendButton.isDisplayed());

	}
}


