package com.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;

public class Exchangepage extends TestBase {

	public Exchangepage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//-----------obj repo -----------------
	private By buy_btn1 = By.xpath("//a[contains(text(),'Buy')]");
	private By quantity_txtbox = By.xpath("//input[@name='input-Qunatity']");
	private By buy_btn2 = By.xpath("//button[contains(text(),'Buy')]");
	private By status = By.xpath("//div[text()='Order Created successfully']");
	
	//----------action methods-------------
	public void clickOnBuyButton1()
	{
		driver.findElement(buy_btn1).click();
	}
	
	public void enterQuantity(String count)
	{
		WebElement quantity=driver.findElement(quantity_txtbox);
		quantity.click();
		quantity.sendKeys(count);
	}
	
	public void clickOnBuyButton2()
	{
		driver.findElement(buy_btn2).click();
	}
	
	public String getStatusMsg()
	{
		String msg = driver.findElement(status).getText();
		return msg;
	}
}
