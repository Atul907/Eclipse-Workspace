package com.pageLayer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;
import com.utility.TakeScreenshotClass;

public class DashboardPage extends TestBase
{
	public static int index[]; 
	
	//-------initialization-------------
	public DashboardPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//------Obj Repo-----------------
	@FindBy(xpath="(//a[@class='nav-link dropdown-toggle arrow-none'])[1]")
	private WebElement dashboard_icon;
	
	@FindBy(xpath="(//a[@class='nav-link dropdown-toggle arrow-none'])[1]")
	private WebElement exchange_icon;
	
	@FindBy(xpath="//a[@class='logo logo-dark']")
	private WebElement logo;
	
	@FindBy(xpath="//a[contains(@class,'nav-link dropdown-togglez')]")
	private WebElement transactions;
	
	@FindBy(xpath="(//a[contains(@class,'nav-link dropdown-toggle ')])[3]")
	private WebElement portfolio;
	
	@FindBy(xpath="//a[text()=' View All']")
	private WebElement viewAll;
	
	@FindBy(xpath="//button[@id='page-header-user-dropdown']")
	private WebElement profile;
	
	@FindBy(xpath="//div[@class='mt-2 d-none d-lg-block']//h5")
	private WebElement available_balance;
	
	@FindBy(xpath="//div[@class='mt-2 mx-4 d-none d-lg-block']//h5")
	private WebElement net_portfolios_worth;
	
	@FindBy(xpath="//span[text()='Power Off']")
	private WebElement power_off;
	
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	private WebElement search_Nse_Listed_Company;
	
	@FindBy(xpath="//div[@class='d-none d-lg-block']//div//div//a")
	private List<WebElement> companies_result;
	
	//-----Latest Transaction----------
	@FindBy(xpath="//div[@class='mb-4 h4 card-title']")
	private WebElement latest_transaction;
	
	@FindBy(xpath="(//div[@class='col-xl-12'])[2]")
	private WebElement table;
	
	@FindBy(xpath="//table//tr")
	private List <WebElement> rows;
	
	@FindBy(xpath="//table//tr//th")
	private List <WebElement> columns_heading;
	
	private List <WebElement> columns;
	
	//---------------profitLoss graph-----------
	@FindBy(xpath="(//div[@class='apexcharts-legend-series']//span)[1]")
	private WebElement profit;
	
	@FindBy(xpath="(//div[@class='apexcharts-legend-series']//span)[3]")
	private WebElement loss;
	
	@FindBy(xpath="(//div[@class='card-body'])[1]")
	private WebElement profit_loss_graph;
	
	//----------Action methods-----------------
	
	public void printLatestTransactionData() 
	{
		int rows_count = rows.size();
		int column_count = columns_heading.size();
		
		//heading
		for(int i=0; i<column_count; i++)
		{
			String col_heading = columns_heading.get(i).getText();
			System.out.print(col_heading+", ");
		}
		System.out.println(" ");
		//table
		for(int i=0; i<rows_count-1; i++)
		{
			columns = driver.findElements(By.xpath("(//table//tr)["+(i+2)+"]//td"));	
			for(int j=0; j<column_count; j++)
			{
				String values = columns.get(j).getText();
				System.out.print(values+", ");
			}
			System.out.println(" ");
		}
	}
	
	public boolean logoTest() 
	{
		boolean logo_result = logo.isDisplayed();
		return logo_result;
	}
	public void elementLogoValue() 
	{
		TakeScreenshotClass.element=logo;
	}
	public void clickOnLogo() 
	{
		logo.click();
	}
	public void clickOnDashboardIcon() 
	{
		dashboard_icon.click();
	}
	public void clickOnExchangeIcon() 
	{
		exchange_icon.click();
	}
	public void clickOnPortfolioIcon() 
	{
		portfolio.click();
	}
	public void clickOnViewAll() 
	{
		TakeScreenshotClass.element=viewAll;
		TakeScreenshotClass.javaScript();
	}
	public void profileGetText() 
	{
		System.out.println(profile.getText());
	}
	public String checkAvailableBalance() 
		{
		return available_balance.getText();
	}
	
	public void clickOnTransactionIcon() 
	{
		transactions.click();
	}
	
	public void logOut() 
	{
		TakeScreenshotClass.element = profile;
		TakeScreenshotClass.javaScript();
		power_off.click();
	}
	
	public void enterCompanyName(String company_Name) 
	{
		search_Nse_Listed_Company.sendKeys(company_Name);
	}
	
	public void clickOnPreferredCompany(String company) 
	{
		int company_count = companies_result.size();
		
		for(int i=0; i<company_count; i++)
		{
			String company_name = companies_result.get(i).getText();
			if(company_name.equalsIgnoreCase(company))
			{
				companies_result.get(i).click();
				break;
			}
		}
	}
	
	public void printRelatedCompany() 
	{
		int company_count = companies_result.size();
		
		for(int i=0; i<company_count; i++)
		{
			String company_name = companies_result.get(i).getText();
			System.out.println(company_name);
		}
	}
	
	
	//------balance-----------
	public String getAvailablBalance() 
	{
		String ava_bal = available_balance.getText();
		return ava_bal;
	}
	public String getNetPortfolioWorth() 
	{
		String net_bal = net_portfolios_worth.getText();
		return net_bal;
	}
	
	
	//-----------profit loss graph-------------
	
	public void elementProfitLossGraph()
	{
		TakeScreenshotClass.element=profit_loss_graph;
	}
	public void inputProfitLossGraph()
	{
		TakeScreenshotClass.element=profit_loss_graph;
	}
	public void clickProfitBtn()
	{
		boolean profitBtn = profit.isSelected();
		if(profitBtn==true)
		{
			boolean lossBtn=loss.isSelected();
			if(lossBtn==true)
			{
				loss.click();
			}
		}
		else 
		{
			profit.click();
			boolean lossBtn=loss.isSelected();
			if(lossBtn==true)
			{
				loss.click();
			}
		}
	}
	public void clickOnLossBtn() 
	{
		boolean lossBtn = loss.isSelected();
		if(lossBtn==true)
		{
			boolean profitBtn=profit.isSelected();
			if(profitBtn==true)
			{
				profit.click();
			}
		}
		else 
		{
			loss.click();
			boolean profitBtn=profit.isSelected();
			if(profitBtn==true)
			{
				profit.click();
			}
		}
	}
	public void lossGraph()
	{
		loss.click();
	}

	
	
	
	
	
	
}
