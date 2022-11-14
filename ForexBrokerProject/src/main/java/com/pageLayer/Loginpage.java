package com.pageLayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;

import utility.ExcelReaderClass;

public class Loginpage extends TestBase {
	
// Driver initialization	
	public Loginpage () {
		
		PageFactory.initElements(driver, this);
	}
	
// object repositories
	
	@FindBy(xpath="//input[@id='field5']")
	private WebElement email_txtbox;
	
	@FindBy(xpath="//input[@id='field7']")
	private WebElement password_txtbox;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement login_btn;
	
// Action methods
	
	public void enterEmailAddress() throws IOException {
		email_txtbox.sendKeys(ExcelReaderClass.readData(1, 2));
	}
	
	public void enterPassword() throws IOException {
		password_txtbox.sendKeys(ExcelReaderClass.readData(2, 2));
	}
	
	public void clickOnLoginButton()
	{
		login_btn.click();
	}
}
