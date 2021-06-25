package com.appsierra;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class ContentTest extends TestBase{
	
	@Test
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

}
