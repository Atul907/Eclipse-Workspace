package com.testLayer;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.pageLayer.CreateAccount;
import com.testBase.TestBase;

public class CreateAccountTest extends TestBase{

	// create object of classes we need
	@Test
	public void verifyAccount () throws IOException, InterruptedException 
	{
		LoginPageTest login = new LoginPageTest ();
		login.verifyLoginTest();
		
		Thread.sleep(3000);
		
		CreateAccount account = new CreateAccount ();
		
		account.clickOnAccounts();
		account.clickOnCreateAccounts();
		Thread.sleep(2000);
		logger.info("clicked on create new account");
		
		account.enterName("James Bond");
		Thread.sleep(2000);
		account.enterEmail("jamesbond007@test.com");
		Thread.sleep(2000);
		logger.info("enterd name and email");
		
		account.enterBillingCity("Pune");
		account.enterBillingState("Maharashtra");
		account.enterBillingCountry("India");
		logger.info("enterd address");
		Thread.sleep(2000);
		
		// creating JavascriptExecutor interface object by Type casting for scrolling purpose
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("scrollBy(0,-500)");
		
		Thread.sleep(2000);
		account.saveDetails();
		
	}
	
	
	
}
