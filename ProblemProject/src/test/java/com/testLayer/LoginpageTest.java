package com.testLayer;

import org.testng.annotations.Test;

import com.pageLayer.Loginpage;
import com.testBase.TestBase;

public class LoginpageTest extends TestBase{

	@Test
	public void verifyLoginTest() throws InterruptedException
	{
		Loginpage login = new Loginpage();
		login.enterEmailAddress();
		login.enterPassword();
		login.clickOnLoginButton();
		Thread.sleep(3000);

	}
}
