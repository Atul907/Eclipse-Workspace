package com.pageLayer;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.testBase.TestBase;
public class ExchangesPage extends TestBase
{
	//initialization
	public ExchangesPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//======obj repo==============
	@FindBy(xpath="//input[@placeholder='Search for Company name']")
	private WebElement search_text_box;
	
	@FindBy(xpath="(//div[@class='row'])[5]//a")
	private List<WebElement> search_results;
	
	
	//-------Actions method-------
	
	public void searchForTrade() 
	{
		search_text_box.sendKeys("icici");
	}
	
	public void clickOnPreferredShare() throws InterruptedException  
	{
		int count = search_results.size();
		for(int i=0; i<count; i++)
		{
			String name = search_results.get(i).getText();
			if(name.equalsIgnoreCase("icicibank.ns")) 
			{
				search_results.get(i).click();
				break;
			}
		}
	} 
}
