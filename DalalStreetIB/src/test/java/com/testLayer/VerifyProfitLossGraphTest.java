package com.testLayer;

import org.testng.annotations.Test;
import com.testBase.TestBase;

public class VerifyProfitLossGraphTest extends TestBase
{
	@Test
	public void verifyProfitLossGraph() throws InterruptedException 
	{
		//Not execute
		
		
		dashboard.clickProfitBtn();
		Thread.sleep(3000);
		//dashboard.inputProfitLossGraph();
		//UtilClass.takesElementScreenshot("profitGraph", "C:\\Eclips Workspace\\DalalStreetIB\\ScreenShots\\");
		//Thread.sleep(3000);
		
		dashboard.clickOnLossBtn();
		Thread.sleep(3000);
		//dashboard.inputProfitLossGraph();
		//UtilClass.takesElementScreenshot("LossGraph", "C:\\Eclips Workspace\\DalalStreetIB\\ScreenShots\\");

	}
}
