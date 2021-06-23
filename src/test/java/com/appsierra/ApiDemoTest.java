package com.appsierra;

import org.testng.annotations.Test;
import base.TestBase;

public class ApiDemoTest extends TestBase{
	
	@Test
	public void preferencesTest() {
		pages.homePage().wait.forElementToBeVisible(pages.homePage().preferences);
		pages.homePage().preferences.click();
		pages.preferencesPage().dependencies.click();
		pages.preferencesPage().checkbox.click();
		pages.preferencesPage().layout.click();
		pages.preferencesPage().editText.sendKeys("Hello");
//		pages.formPage().scrollIntoView("Active");
//	    Assert.assertTrue(pages.formPage().activeButton.isDisplayed());
	}
	@Test
	 public void contentTest() {
		
		pages.homePage().wait.forElementToBeVisible(pages.homePage().content);
		pages.homePage().content.click();
		pages.contentsPage().storage.click();
		pages.contentsPage().externalStorage.click();
		pages.contentsPage().create.click();
		pages.contentsPage().delete.click();
		pages.contentsPage().back();
		pages.contentsPage().back();
		pages.contentsPage().provider.click();
		pages.contentsPage().pickContact.click();
		pages.contentsPage().contactButton.click();
		pages.contentsPage().chooseContact.click();
		
	}
		
	@Test
	public void osTest() {
		pages.homePage().wait.forElementToBeVisible(pages.homePage().operatingSystem);
		pages.homePage().operatingSystem.click();
		pages.osPage().smsMessaging.click();
		pages.osPage().enableBroadcast.click();
		pages.osPage().recipient.sendKeys("9876543210");
		pages.osPage().messageBody.sendKeys("Welcome to AppSierra");
		pages.osPage().sendButton.click();

	}
}


