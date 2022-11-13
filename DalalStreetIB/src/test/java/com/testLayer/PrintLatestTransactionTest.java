package com.testLayer;

import org.testng.annotations.Test;

import com.testBase.TestBase;

public class PrintLatestTransactionTest extends TestBase
{
	@Test
	public void printLatestTransactions() 
	{
		dashboard.printLatestTransactionData();
	}
}
