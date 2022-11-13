package com.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;
import com.utility.UtilClass;

public class RegisterPage extends TestBase
{
	//initialization
	
	public RegisterPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//object repo
	
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement first_name;
	
	@FindBy(xpath="//input[@name='lastName']")
	private WebElement last_name;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement email_id;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@name='agreement']")
	private WebElement agree_btn;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement start_btn;
	
	
	//===Action method====
	public void enterFirstName()
	{
		first_name.sendKeys("Saroj");
	}
	
	public void enterLastName() 
	{
		last_name.sendKeys("Pulajwar");
	}
	
	public void enterEmailId()
	{
		email_id.sendKeys("sarojpulajwar4444@gmail.com");
	}
	
	public void enterPassword()
	{
		password.sendKeys("Saroj@123");
	}

	public void clickAgreeBtn()
	{
		//org.openqa.selenium.ElementClickInterceptedException
		UtilClass.element=agree_btn;
		UtilClass.javaScript();
		//agree_btn.click();
	}
	
	public void clickStartBtn()
	{
		//org.openqa.selenium.ElementClickInterceptedException
		UtilClass.element=start_btn;
		UtilClass.javaScript();
	}
	
}
