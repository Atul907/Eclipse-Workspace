package com.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.testBase.TestBase;
import com.utility.TakeScreenshotClass;

public class LogoVerifyTest extends TestBase
{
	@Test
	public void verifyAppLogoTest() 
	{
		boolean actual_result = dashboard.logoTest();
		Assert.assertTrue(actual_result);
		dashboard.elementLogoValue();
		TakeScreenshotClass.takesElementScreenshot("logo","C:\\Eclips Workspace\\DalalStreetIB\\ScreenShots\\");
	}
}
