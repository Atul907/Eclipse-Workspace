package com.testLayer;

import java.io.IOException;

import org.testng.annotations.Test;

import com.pageLayer.LoginPage;
import com.testBase.TestBase;

public class TradeNowTest extends TestBase {

	@Test
	public void VerifyTradeNow () throws IOException, InterruptedException {
		
	LoginPage login = new LoginPage ();
	
	login.clickOnTradeNowButton();
	Thread.sleep(10000);
	
	login.enterEmailAddress2();
	Thread.sleep(2000);
	
	login.enterPassword2();Thread.sleep(10000);
	Thread.sleep(2000);
	
	login.clickOnContinueButton2();
	
	}
	
}
