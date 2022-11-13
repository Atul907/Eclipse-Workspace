package com.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.testBase.TestBase;

public class CheckBalanceTest extends TestBase
{
	@Test
	public void printBalance() 
	{
		dashboard.getAvailablBalance();
		String expected_balance = "40981";
		Assert.assertEquals(dashboard.getAvailablBalance(), expected_balance);
		
		dashboard.getNetPortfolioWorth();
		String expectedNetWorth = "19882";
		Assert.assertEquals(dashboard.getNetPortfolioWorth(), expectedNetWorth);

	}
}
