package com.testLayer;

import org.testng.annotations.Test;

import com.pageLayer.Dashboardpage;
import com.pageLayer.Transactionpage;
import com.testBase.TestBase;

public class GetTranscationData extends TestBase {

	@Test
	public void getData() throws InterruptedException
	{
		Transactionpage tran = new Transactionpage();
		Dashboardpage dash=new Dashboardpage();
		Thread.sleep(3000);
		dash.clickOnTransactionLink();
		Thread.sleep(3000);
		tran.getTransactionData();	
	}
}
