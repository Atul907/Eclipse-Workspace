package com.pageLayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;
import com.utility.ExcelReaderClass;

public class LoginPage extends TestBase {

// 1- driver initialization using constructor
	
	public LoginPage () {
		PageFactory.initElements(driver, this);
	}
	
// 2- object repositories
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement username_txtbox;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password_txtbox;
	
	@FindBy(xpath="//button[@id='login-button']")
	private WebElement login_btn;
	
// 3- action methods
	
	public void enterUsername() throws IOException {
		username_txtbox.sendKeys(ExcelReaderClass.readData(0, 1));
	}
	
	public void enterPassword () throws IOException {
		password_txtbox.sendKeys(ExcelReaderClass.readData(1, 1));
	}
	
	public void clickOnLoginBtn () {
		login_btn.click();
	}
}
