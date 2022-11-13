package com.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.testBase.TestBase;
import com.utility.UtilClass;

public class flacttuationOfGraphTest extends TestBase
{
	@Test
	public void veriFyFlacttuationOfGraph() throws InterruptedException 
	{
		dashboard.enterCompanyName("ax");
		dashboard.clickOnPreferredCompany("icici bank");
		Thread.sleep(2000);
		order.printCompanyName();
		order.printFlactuatePrice();
		
		order.clickOnDaysBtn();
		order.inputGraphValue();
		Thread.sleep(2000);
		Assert.assertTrue(order.checkDaysBtn());
		UtilClass.takesElementScreenshot("logo","C:\\Eclips Workspace\\DalalStreetIB\\ScreenShots\\");
		
		order.clickOnMonthBtn();
		order.inputGraphValue();
		Thread.sleep(2000);
		Assert.assertTrue(order.checkMonthBtn());
		UtilClass.takesElementScreenshot("logo","C:\\Eclips Workspace\\DalalStreetIB\\ScreenShots\\");
		
		order.clickOnYearBtn();
		order.inputGraphValue();
		Thread.sleep(2000);
		Assert.assertTrue(order.checkYearBtn());
		UtilClass.takesElementScreenshot("logo","C:\\Eclips Workspace\\DalalStreetIB\\ScreenShots\\");

	}
}
