package com.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.testBase.TestBase;

public class BuyIntradayLimitOrderTest extends TestBase
{
	String expected_buy_status = "Limit Order Created Successfully";
	
	@Test
	public void buyIntradayLimitOrder() throws InterruptedException 
	{	
		dashboard.enterCompanyName("ici");
		dashboard.clickOnPreferredCompany("icici bank");
		order.clickOnBuyBtn();
		order.clickOnBuyIntradayBtn();
		order.clickOnBuyCustomLimitBtn();
		order.enterShareBuyQuantity();
		order.clickOnBuyOrderBtn();
		Thread.sleep(2000);
		Assert.assertEquals(order.getBuyStatusMsg(), expected_buy_status);
		System.out.println("Buy order successfull");
		
	}
}
