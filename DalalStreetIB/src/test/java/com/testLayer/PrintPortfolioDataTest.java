package com.testLayer;

import org.testng.annotations.Test;

import com.testBase.TestBase;

public class PrintPortfolioDataTest extends TestBase
{
	@Test
	public void printPortfolioData() throws InterruptedException 
	{	
		dashboard.clickOnPortfolioIcon();
		Thread.sleep(3000);
		portfolio.printHeadings();
		portfolio.printPortfolioValues();
	}
}
