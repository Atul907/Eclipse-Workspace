package com.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;
import com.utility.UtilClass;

public class LoginPage extends TestBase
{
	//initialization
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//=====Obj Repo=========
	
	@FindBy(xpath="//a[text()='Signup now']")
	private WebElement Signup_Now;
	
	@FindBy(name="email")
	private WebElement enter_email;
	
	@FindBy(name="password")
	private WebElement enter_password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement login_btn;
	
	
	
	
	//===========Action Methods=====
	
	public void clickOnSignupBtn() 
	{
		//org.openqa.selenium.ElementClickInterceptedException
		UtilClass.element=Signup_Now;
		UtilClass.javaScript();
	}
	
	public void enterEmail(String email) 
	{
		enter_email.sendKeys(email);
	}
	
	public void enterPassword(String password)
	{
		enter_password.sendKeys(password);
	}
	
	public void clickOnLoginBtn() 
	{
		login_btn.click();
	}
}
