package com.pageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.testBase.TestBase;
import com.utility.TakeScreenshotClass;

public class PlaceOrderPage extends TestBase
{
	//-------initialization----------
	public PlaceOrderPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//----------Obj Repo-------------------
	@FindBy(xpath="(//li[@class='nav-item'])[1]")
	private WebElement buy_btn;
	
	@FindBy(xpath="(//li[@class='nav-item'])[2]")
	private WebElement sell_btn;
	
	@FindBy(xpath="(//div[@class='me-2'])[1]")
	private WebElement buy_longterm_btn;
	
	@FindBy(xpath="(//div[@class='me-2'])[3]")
	private WebElement sell_longterm_btn;
	
	@FindBy(xpath="(//div[@class='btn-group mb-2']//label)[2]")
	private WebElement buy_intraday_btn;
	
	@FindBy(xpath="(//div[@class='btn-group mb-4']//label)[2]")
	private WebElement sell_intraday_btn;
	
	@FindBy(xpath="(//div[@class='me-2'])[2]")
	private WebElement buy_market_btn;
	
	@FindBy(xpath="(//div[@class='me-2'])[4]")
	private WebElement sell_market_btn;
	
	@FindBy(xpath="(//label[text()='Custom Limit'])[1]")
	private WebElement buy_customLimit_btn;
	
	@FindBy(xpath="((//div[@class='btn-group mb-2'])[3]//label)[2]")
	private WebElement sell_customLimit_btn;
	               
	@FindBy(xpath="//input[@name='input-Qunatity']")
	private WebElement buy_input_quantity;
	
	@FindBy(xpath="//input[@id='quantity']")
	private WebElement sell_input_quantity;

	@FindBy(xpath="(//input[@class='form-control'])[4]")
	private WebElement buy_price;
	
	@FindBy(xpath="(//input[@class='form-control form-control'])[2]")
	private WebElement sell_price;
	
	@FindBy(xpath="//button[@class='w-md btn btn-success']")
	private WebElement buy_order_btn;
	
	@FindBy(xpath="//button[text()='Sell']")
	private WebElement sell_order_btn;
	
	@FindBy(xpath="(//div[contains(@class, 'Toastify__toast-')])[2]")
	private WebElement buy_order_status;
	
	@FindBy(xpath="(//div[@id='xboo1aj'])[1]")
	private WebElement sell_order_status;

	@FindBy(xpath="//div[text()='Limit Order Created Successfully']")
	private WebElement sell_limit_order_status;
	
	@FindBy(xpath="//div[text()='Order Created successfully']")
	private WebElement sell_market_order_status;
	
	//----------------graph--------------------------
	
	@FindBy(xpath="((//div[@class='card-body'])[1]//div)[1]//h4")
	private WebElement company_heading;
	
	@FindBy(xpath="//div[@class='col-sm-4 col-xl-2']//p")
	private List <WebElement> price_flactuation;
	
	@FindBy(xpath="//div[@class='col-sm-4 col-xl-2']//h5")
	private List <WebElement> price_value;
	
	@FindBy(xpath="//button[text()='14 Days']")
	private WebElement fourteen_days;
	
	@FindBy(xpath="//button[text()='1 Month']")
	private WebElement one_month;
	
	@FindBy(xpath="//button[text()='1 Year']")
	private WebElement one_year;
	
	@FindBy(xpath="//div[@id='candlestick-chart']")
	private WebElement graph;
	//---------------------------------------------------------
	
	//-----Actions method--------
	public void clickOnBuyBtn()
	{
		TakeScreenshotClass.element=buy_btn;
		TakeScreenshotClass.javaScript();
	}
	
	public void clickOnSellBtn() 
	{
		TakeScreenshotClass.element=sell_btn;
		TakeScreenshotClass.javaScript();
		sell_btn.click();
	}
	
	public void clickOnBuyIntradayBtn()
	{
		TakeScreenshotClass.element=buy_intraday_btn;
		TakeScreenshotClass.javaScript();
		
	} 
	
	public void clickOnSellIntradayBtn()
	{
		TakeScreenshotClass.element=sell_intraday_btn;
		TakeScreenshotClass.javaScript();
	} 
	
	public void clickOnBuyLongeTermBtn()
	{
		TakeScreenshotClass.element=buy_longterm_btn;
		TakeScreenshotClass.javaScript();
	}
	
	public void clickOnSellLongeTermBtn()
	{
		TakeScreenshotClass.element=sell_longterm_btn;
		TakeScreenshotClass.javaScript();
	}
	
	public void clickOnBuyMarketBtn()
	{
		TakeScreenshotClass.element=buy_market_btn;
		TakeScreenshotClass.javaScript();
	}
	
	public void clickOnSellMarketBtn()
	{
		TakeScreenshotClass.element=sell_market_btn;
		TakeScreenshotClass.javaScript();
	}
	
	public void clickOnBuyCustomLimitBtn()
	{
		TakeScreenshotClass.element=buy_customLimit_btn;
		TakeScreenshotClass.javaScript();
	}
	
	public void clickOnSellCustomLimitBtn()
	{
		TakeScreenshotClass.element=sell_customLimit_btn;
		TakeScreenshotClass.javaScript();
	}
	
	public void enterShareBuyQuantity()
	{
		//Integer.toString(buy_qty);
		TakeScreenshotClass.element=buy_input_quantity;
		TakeScreenshotClass.javaScript();
		buy_input_quantity.sendKeys("5");
	}
	
	public void enterShareSellQuantity()
	{
		//Integer.toString(sell_qty);
		TakeScreenshotClass.element=sell_input_quantity;
		TakeScreenshotClass.javaScript();
		sell_input_quantity.sendKeys("1");
	}
	
	public void checkBuyPrice()
	{
		TakeScreenshotClass.element=buy_price;
		TakeScreenshotClass.javaScript();
		System.out.println(buy_price.getText());
	}
	
	public void checkSellPrice()
	{

		TakeScreenshotClass.element=sell_price;
		TakeScreenshotClass.javaScript();
		System.out.println(sell_price.getText());
	}
	
	public void clickOnBuyOrderBtn()
	{
		TakeScreenshotClass.element=buy_order_btn;
		TakeScreenshotClass.javaScript();
	}
	
	public void clickOnSellOrderBtn()
	{
		TakeScreenshotClass.element=sell_order_btn;
		TakeScreenshotClass.javaScript();
	}
	
	public String getBuyStatusMsg()
	{
		TakeScreenshotClass.element=buy_order_status;
		TakeScreenshotClass.javaScript();
		String msg = buy_order_status.getText();
		return msg;
	}
	
	public String getSellStatusMsg()
	{
		TakeScreenshotClass.element=sell_order_status;
		TakeScreenshotClass.javaScript();
		String msg = sell_order_status.getText();
		return msg;
	}
	public String getSellLimitOrderStatus() 
	{
		String msg = sell_limit_order_status.getText();
		return msg;	
	}
	public String getSellMarketOrderStatus() 
	{
		String msg = sell_market_order_status.getText();
		return msg;	
	}
	
	//-------------graph-----------------------
	
	public void printCompanyName() 
	{
		String company = company_heading.getText();
		System.out.println(company);
	}
	
	public void printFlactuatePrice() 
	{
		int count = price_flactuation.size();
		int price_count = price_value.size();
		for(int i=0; i<count; i++) 
		{
			String price_type = price_flactuation.get(i).getText();
			System.out.print(price_type+", ");
		}
		
		System.out.println(" ");

		for(int i=0; i<price_count; i++) 
		{
			String price = price_value.get(i).getText();
			System.out.print(price+", ");
		}
	}
	
	public void clickOnDaysBtn() 
	{
		fourteen_days.click();
	}
	public boolean checkDaysBtn() 
	{
		boolean days_result = fourteen_days.isEnabled();
		return days_result;	
	}
	public void clickOnMonthBtn()
	{
		one_month.click();
	}
	public boolean checkMonthBtn() 
	{
		boolean month_result = one_month.isEnabled();
		return month_result;
	}
	public void clickOnYearBtn()
	{
		one_year.click();
	}	
	public boolean checkYearBtn() 
	{
		boolean year_result = one_year.isEnabled();
		return year_result;
	}
	public void inputGraphValue() 
	{
		TakeScreenshotClass.input=graph;
	}
}
