package com.testLayer;

import java.io.IOException;

import org.testng.annotations.Test;

import com.pageLayer.Loginpage;
import com.testBase.TestBase;

public class LoginpageTest extends TestBase{

	@Test
	public void verifyloginTest() throws IOException, InterruptedException {
		
		Loginpage login = new Loginpage ();
		
		login.enterEmailAddress();
		Thread.sleep(3000);
		login.enterPassword();
		Thread.sleep(3000);
		login.clickOnLoginButton();
		
		Thread.sleep(3000);
		
		
		
		
	}
}
