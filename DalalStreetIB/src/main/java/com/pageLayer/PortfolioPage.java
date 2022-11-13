package com.pageLayer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;

public class PortfolioPage extends TestBase
{
	//---initialization---------
	public PortfolioPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//---------obj repo----------
			
	@FindBy(xpath="(//table//thead)[1]//th")
	private List <WebElement> column_headings;
	
	@FindBy(xpath="(//table//tbody)[1]//tr")
	private List <WebElement> rows;
	
	@FindBy(xpath="(//table//tbody)[1]//tr//th//a")
	private List <WebElement> ticker_id_values;
	
	public void printHeadings () 
	{
		int heading_count = column_headings.size();
		
		for(int i=0; i<heading_count; i++) 
		{
			String headings = column_headings.get(i).getText();
			System.out.print(headings+", ");
		}
		System.out.println(" ");
	}
	
	public void sellPreferredShare(String company) 
	{
		int heading_count = column_headings.size();
		for(int i=0; i<heading_count; i++)
		{
			String name = ticker_id_values.get(i).getText();	
			if(name.equalsIgnoreCase(company))
			{
				ticker_id_values.get(i).click();
				break;
			}
		}
	}
	
	public void printPortfolioValues() 
	{
		int row_count = rows.size();
		for(int i=0; i<row_count; i++)
		{
			String ticker_id = ticker_id_values.get(i).getText();
			System.out.print(ticker_id+", ");

			List<WebElement> columns = driver.findElements
		    (By.xpath("(//table//tbody//tr)["+(i+1)+"]//td"));
			
			int columns_count = columns.size();
		
			for(int j=0; j<columns_count; j++) 
			{
				String columns_value = columns.get(j).getText();
				System.out.print(columns_value+", ");
			}
			System.out.println(" ");
		}
	}
}
