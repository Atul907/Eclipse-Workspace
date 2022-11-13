package com.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.testBase.TestBase;

public class VerifyPageNavigationTest extends TestBase
{
	@Test
	public void verifyPageNavigation() throws InterruptedException 
	{
		Thread.sleep(2000);

		dashboard.clickOnExchangeIcon();
		Thread.sleep(2000);
		String expected_exchange_url="https://www.apps.dalalstreet.ai/exchanges";
		Assert.assertEquals(util.getUrl(), expected_exchange_url);
		
		dashboard.clickOnTransactionIcon();
		Thread.sleep(2000);
		String expected_transaction_url="https://www.apps.dalalstreet.ai/transactions";
		Assert.assertEquals(util.getUrl(), expected_transaction_url);

		dashboard.clickOnPortfolioIcon();
		Thread.sleep(2000);
		String expected_portfolio_url="https://www.apps.dalalstreet.ai/portfolio";
		Assert.assertEquals(util.getUrl(), expected_portfolio_url);

		dashboard.clickOnDashboardIcon();
		Thread.sleep(6000);
		String expected_dashboard_url="https://www.apps.dalalstreet.ai/dashboard";
		Assert.assertEquals(util.getUrl(), expected_dashboard_url);

		dashboard.clickOnViewAll();
		Thread.sleep(2000);
		Assert.assertEquals(util.getUrl(), expected_transaction_url);

		dashboard.clickOnLogo();
		Thread.sleep(2000);
		Assert.assertEquals(util.getUrl(), expected_dashboard_url);

		
	}
}
