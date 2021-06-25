package com.appsierra;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.TestBase;

public class PreferencesTest extends TestBase{
	
	@Test
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
		
}


