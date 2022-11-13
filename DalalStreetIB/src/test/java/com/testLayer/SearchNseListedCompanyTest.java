package com.testLayer;

import org.testng.annotations.Test;

import com.testBase.TestBase;

public class SearchNseListedCompanyTest extends TestBase
{
	@Test
	public void clickOnPreferredCompany() 
	{	
		dashboard.enterCompanyName("hd");
		dashboard.printRelatedCompany();
		dashboard.clickOnPreferredCompany("tech mahindra");
	}
}
