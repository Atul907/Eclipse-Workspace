package com.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageLayer.DashboardPage;
import com.pageLayer.PlaceOrderPage;
import com.pageLayer.PortfolioPage;
import com.testBase.TestBase;

public class SellLongTermLimitOrderTest extends TestBase
{
	String expected_sell_status = "Limit Order Created Successfully";

	@Test
	public void sellLongTermLimitOrder() throws InterruptedException 
	{
		DashboardPage dashboard = new DashboardPage();
		PlaceOrderPage order = new PlaceOrderPage();
		PortfolioPage portfolio = new PortfolioPage();

		dashboard.clickOnPortfolioIcon();
		portfolio.sellPreferredShare("sbilife.ns");
		Thread.sleep(4000);
		order.clickOnSellBtn();
		order.clickOnSellLongeTermBtn();
		order.clickOnSellCustomLimitBtn();
		order.enterShareSellQuantity();
		order.clickOnSellOrderBtn();
		Thread.sleep(2000);
		Assert.assertEquals(order.getSellLimitOrderStatus(), expected_sell_status);
		System.out.println("Sell Longterm Limit Order successfull");
	}
}
