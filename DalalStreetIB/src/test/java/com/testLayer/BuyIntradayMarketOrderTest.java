package com.testLayer;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.testBase.TestBase;


public class BuyIntradayMarketOrderTest extends TestBase
{
	String expected_buy_status = "Order Created successfully";

	@Test
	public void verifyBuyIntradayMarketOrder() throws InterruptedException, IOException 
	{	
		dashboard.clickOnExchangeIcon();
		Thread.sleep(1000);
		exchange.searchForTrade();
		Thread.sleep(4000);
		exchange.clickOnPreferredShare();
		Thread.sleep(2000);
		order.clickOnBuyBtn();
		order.clickOnBuyIntradayBtn();
		order.clickOnBuyMarketBtn();
		order.enterShareBuyQuantity();
		//order.checkPrice();
		order.clickOnBuyOrderBtn();
		Thread.sleep(2000);
		Assert.assertEquals(order.getBuyStatusMsg(), expected_buy_status);
		System.out.println("Buy intraday market order sucessfull");
	}
}
