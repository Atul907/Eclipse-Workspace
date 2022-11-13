package com.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageLayer.Dashboardpage;
import com.pageLayer.Exchangepage;
import com.testBase.TestBase;

public class BuyScenerio extends TestBase {
	
	String expected_msg = "Order Created successfully";
	
	@Test
	public void buyShare() throws InterruptedException
	{
		Thread.sleep(3000);
		dash.enterCompnayName("Axis");
		dash.clickOnCompanyOption();
		logger.info("Selected Company option");
		Thread.sleep(3000);
		exchange.clickOnBuyButton1();
		exchange.enterQuantity("2");
		exchange.clickOnBuyButton2();
		logger.info("Clicked on buy button");
		Thread.sleep(2000);
		Assert.assertEquals(exchange.getStatusMsg(), expected_msg);	
	}
	
	@Test
	public void buyShare1() throws InterruptedException
	{
		Thread.sleep(3000);
		dash.enterCompnayName("TATA");
		dash.clickOnCompanyOption();
		logger.info("Selected Company option");
		Thread.sleep(3000);
		exchange.clickOnBuyButton1();
		exchange.enterQuantity("2");
		exchange.clickOnBuyButton2();
		logger.info("Clicked on buy button");
		Thread.sleep(2000);
		Assert.assertEquals(exchange.getStatusMsg(), expected_msg);	
	}
}
