package com.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.testBase.TestBase;

public class SellIntradayMarketOrderTest extends TestBase
{
	String expected_sell_status = "Order Created successfully";
	@Test
	public void sellIntradayMarketOrder() throws InterruptedException 
	{
		dashboard.clickOnPortfolioIcon();
		Thread.sleep(2000);
		portfolio.sellPreferredShare("icicibank.ns");
		Thread.sleep(3000);
		order.clickOnSellBtn();
		order.clickOnSellIntradayBtn();
		order.clickOnSellMarketBtn();
		order.enterShareSellQuantity();
		order.clickOnSellOrderBtn();
		Thread.sleep(2000);
		Assert.assertEquals(order.getSellMarketOrderStatus(), expected_sell_status);
		System.out.println("Sell Intraday Market Order is successfull");
	}
}
