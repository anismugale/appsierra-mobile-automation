package com.appsierra;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class OSTest extends TestBase{
	
	@Test
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
