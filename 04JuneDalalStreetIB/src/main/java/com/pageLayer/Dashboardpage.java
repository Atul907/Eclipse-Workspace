package com.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;

public class Dashboardpage extends TestBase {

	public Dashboardpage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//---------- obj repo ---------------------
	
	private By search_box = By.xpath("(//input[@class='form-control'])[1]");
	
	@FindBy(xpath="(//div[@class='m-2 card-title'])[2]")
	private WebElement select_companyOption;
	
	private By transaction_lnk = By.xpath("//a[text()='Transactions']");
	
	
	//--------- action methods ----------------
	
	public void enterCompnayName(String CompanyName)
	{
		driver.findElement(search_box).sendKeys(CompanyName);
	}
	
	public void clickOnCompanyOption()
	{
		select_companyOption.click();
	}
	
	public void clickOnTransactionLink()
	{
		driver.findElement(transaction_lnk).click();
	}
}
