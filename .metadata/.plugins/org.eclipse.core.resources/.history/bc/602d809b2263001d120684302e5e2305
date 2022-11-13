package com.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;

public class Transactionpage extends TestBase {

	public Transactionpage()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void getTransactionData()
	{
//		String data1= driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]")).getText();
//		tr[1-10]
//		td[1-9]
		
		String data;
		for(int i=1;i<=10;i++)
		{
			for(int k=1;k<=9;k++)
			{
				data = driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td["+k+"]")).getText();
				System.out.print(data +" ");
			}	
			System.out.println();
		}
	}
	
	
}
