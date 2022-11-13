package com.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;

public class Loginpage extends TestBase {
	
	public Loginpage()
	{
		PageFactory.initElements(driver, this);
	}
	//------------- Obj repo -----------------
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement email_txtbox;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password_txtbox;
	
	@FindBy(xpath="//button[text()='Log In']")
	private WebElement login_btn;
	
	//--------------Action methods------------ 
	public void enterEmailAddress()
	{
		email_txtbox.sendKeys("amarwaghmare573@gmail.com");
	}
	public void enterPassword()
	{
		password_txtbox.sendKeys("Test@1234");
	}
	public void clickOnLoginButton()
	{
		login_btn.click();
	}
}
