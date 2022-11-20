package com.pageLayer;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;
import com.utility.ExcelReaderClass;

public class LoginPage extends TestBase {

	// Driver initialization using constructor
	
	public LoginPage () {		// constructor name should be same as class name
		
		PageFactory.initElements(driver, this);	
	}
	
	// object repositories
	
	@FindBy(xpath="//a[@id='wg_loginBtn']")
	private WebElement login_btn;
	
	@FindBy(xpath="(//input[@type='email'])[1]")
	private WebElement email_txtbox;
	
	@FindBy(xpath="(//input[@type='password'])[1]")
	private WebElement password_txtbox;
	
	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement continue_btn;
	
	@FindBy(xpath="//a[@data-type='btn_header']")
	private WebElement tradeNow_btn;
	
	@FindBy(xpath="(//input[@type='email'])[3]")
	private WebElement email_txtbox2;
	
	@FindBy(xpath="(//input[@type='password'])[2]")
	private WebElement password_txtbox2;
	
	@FindBy(xpath="(//button[@type='submit'])[4]")
	private WebElement continue_btn2;
	
	// Action methods
	
	public void clickOnLoginButton() {
		login_btn.click();
	}
	
	public void enterEmailAddress() throws IOException {
		email_txtbox.sendKeys(ExcelReaderClass.readData(0, 1));
	}
	
	public void enterPassword() throws IOException {
		password_txtbox.sendKeys(ExcelReaderClass.readData(1, 1));
	}
	
	public void clickOnContinueButton() {
		continue_btn.click();
	}
	
	public void clickOnTradeNowButton() {
		tradeNow_btn.click();
	}
	
	public void enterEmailAddress2() throws IOException {
		email_txtbox2.sendKeys(ExcelReaderClass.readData(0, 1));
	}
	
	public void enterPassword2() throws IOException {
		password_txtbox2.sendKeys(ExcelReaderClass.readData(1, 1));
	}
	
	public void clickOnContinueButton2() {
		continue_btn2.click();
	}
}
