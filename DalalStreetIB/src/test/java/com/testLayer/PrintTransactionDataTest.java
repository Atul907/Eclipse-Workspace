package com.testLayer;

import java.io.IOException;
import org.testng.annotations.Test;
import com.testBase.TestBase;

public class PrintTransactionDataTest extends TestBase
{
	@Test
	public void printData() throws InterruptedException, IOException 
	{
		dashboard.clickOnTransactionIcon();
		Thread.sleep(4000);
		transaction.printTransactionData();
		//Thread.sleep(4000);
		//transaction.createExcelData();

	}
}
