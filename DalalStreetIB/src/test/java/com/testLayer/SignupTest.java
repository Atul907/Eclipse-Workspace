package com.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageLayer.LoginPage;
import com.pageLayer.RegisterPage;
import com.testBase.TestBase;
import com.utility.TakeScreenshotClass;


public class SignupTest extends TestBase
{
	String signup_url="https://www.apps.dalalstreet.ai/register";
	@Test
	public void verifySignupTest() throws InterruptedException 
	{
		LoginPage login = new LoginPage();
		RegisterPage register = new RegisterPage();
		TakeScreenshotClass util = new TakeScreenshotClass();
		
		login.clickOnSignupBtn();;
		register.enterFirstName();
		register.enterLastName();
		register.enterEmailId();
		register.enterPassword();
		register.clickAgreeBtn();
		register.clickStartBtn();
		Thread.sleep(3000);
		String actual_url=util.getUrl();
		Assert.assertNotEquals(signup_url, actual_url);
	}
}
