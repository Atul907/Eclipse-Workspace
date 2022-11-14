package com.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.testBase.TestBase;


public class BuyLongTermLimitOrderTest extends TestBase
{
	String expected_buy_status = "Limit Order Created Successfully";

	//not execute
	@Test
	public void BuyLongTermLimitOrder() throws InterruptedException 
	{	
		dashboard.enterCompanyName("ici");
		dashboard.clickOnPreferredCompany("icici bank");
		order.clickOnBuyBtn();
		order.clickOnBuyLongeTermBtn();
		order.clickOnBuyCustomLimitBtn();
		order.enterShareBuyQuantity();
		order.clickOnBuyOrderBtn();
		Thread.sleep(2000);
		System.out.println("buy click");
		Assert.assertEquals(order.getBuyStatusMsg(), expected_buy_status);
		
	}
}