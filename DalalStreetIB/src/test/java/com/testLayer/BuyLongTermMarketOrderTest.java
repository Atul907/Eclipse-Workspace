package com.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.testBase.TestBase;

public class BuyLongTermMarketOrderTest extends TestBase
{
	String expected_buy_status = "Order Created successfully";

	@Test
	public void buyLongTermMarketOrder() throws InterruptedException 
	{
		
		dashboard.enterCompanyName("hd");
		dashboard.clickOnPreferredCompany("hindustan zinc");
		order.clickOnBuyBtn();
		order.clickOnBuyLongeTermBtn();
		order.clickOnBuyMarketBtn();
		order.enterShareBuyQuantity();
		order.clickOnBuyOrderBtn();
		Thread.sleep(2000);
		Assert.assertEquals(order.getBuyStatusMsg(), expected_buy_status);
		System.out.println("Buy Longterm Market Order Sucessfull");
	}
}
