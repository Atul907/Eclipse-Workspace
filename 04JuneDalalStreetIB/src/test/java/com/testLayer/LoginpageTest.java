package com.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageLayer.Loginpage;
import com.testBase.TestBase;
import com.utility.UtilClass;

public class LoginpageTest extends TestBase {

	String expected_url = "https://www.apps.dalalstreet.ai/dashboard";
	@Test
	public void verifyLoginTest() throws InterruptedException
	{
		Loginpage login = new Loginpage();
		UtilClass util = new UtilClass();
		login.enterEmailAddress();
		login.enterPassword();
		login.clickOnLoginButton();
		Thread.sleep(3000);
		String actual_url = util.getUrl();
		Assert.assertEquals(actual_url, expected_url);
	}
}
