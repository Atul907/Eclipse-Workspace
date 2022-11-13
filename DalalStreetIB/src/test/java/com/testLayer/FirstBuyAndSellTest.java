package com.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.testBase.TestBase;

public class FirstBuyAndSellTest extends TestBase
{
	String expected_buy_status = "Order Created Successfully";
	String expected_sell_status = "Order Created successfully";
	@Test
	public void verifyFirstBuyAndSell() throws InterruptedException 
	{	
		dashboard.enterCompanyName("hdf");
		dashboard.clickOnPreferredCompany("hdfc life insuranc");
		//first buy
		Thread.sleep(4000);		
		order.clickOnBuyBtn();
		order.clickOnBuyIntradayBtn();
		order.clickOnBuyMarketBtn();
		order.enterShareBuyQuantity();
		order.checkBuyPrice();
		order.clickOnBuyOrderBtn();
		Thread.sleep(2000);		
		Assert.assertEquals(order.getBuyStatusMsg(), expected_buy_status);
		System.out.println("Buy order complete");
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(8000);
		//sell share
		order.clickOnSellBtn();
		order.clickOnBuyIntradayBtn();
		order.clickOnSellMarketBtn();
		order.enterShareSellQuantity();
		order.checkSellPrice();
		order.clickOnSellOrderBtn();
		Thread.sleep(2000);
		Assert.assertEquals(order.getBuyStatusMsg(),expected_sell_status );
		System.out.println("Sell order complete");
		Thread.sleep(4000);

	}
}
