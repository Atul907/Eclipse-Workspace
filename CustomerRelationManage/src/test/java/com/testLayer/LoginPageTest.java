package com.testLayer;

import java.io.IOException;

import org.testng.annotations.Test;

import com.pageLayer.LoginPage;
import com.testBase.TestBase;

public class LoginPageTest extends TestBase {

	@Test
	public void verifyLoginTest() throws IOException, InterruptedException {
		
		LoginPage login = new LoginPage();
		
		login.enterUsername();
		Thread.sleep(2000);
		login.enterPassword();
		Thread.sleep(2000);
		login.clickOnLoginBtn();
	}
	
	
}