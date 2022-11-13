package com.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageLayer.DashboardPage;
import com.pageLayer.PlaceOrderPage;
import com.pageLayer.PortfolioPage;
import com.testBase.TestBase;

public class SellLongTermMarketOrderTest extends TestBase
{
	String expected_sell_status = "Order Created successfully";

	@Test
	public void sellLongTermMarketOrder() throws InterruptedException 
	{
		DashboardPage dashboard = new DashboardPage();
		PlaceOrderPage order = new PlaceOrderPage();
		PortfolioPage portfolio = new PortfolioPage();

		dashboard.clickOnPortfolioIcon();
		portfolio.sellPreferredShare("sbilife.ns");
		Thread.sleep(4000);
		order.clickOnSellBtn();
		order.clickOnSellLongeTermBtn();
		order.clickOnSellMarketBtn();
		order.enterShareSellQuantity();
		order.checkSellPrice();
		order.clickOnSellOrderBtn();
		Thread.sleep(2000);
		Assert.assertEquals(order.getSellMarketOrderStatus(), expected_sell_status);
		System.out.println("Sell Longterm Market Order Successfull");

	}
}
