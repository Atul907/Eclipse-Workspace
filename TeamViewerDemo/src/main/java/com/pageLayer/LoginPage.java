package com.pageLayer;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseTest;
import com.utility.PropertiesFileUse;

public class LoginPage extends BaseTest{

	@FindBy(xpath = "//*[@name='username']")
	private WebElement txt_username;

	@FindBy(xpath = "//*[@name='password']")
	private WebElement txt_password;

	@FindBy(xpath = "//*[@type='submit']")
	private WebElement btn_login;


	public LoginPage () {



		PageFactory.initElements(driver, this);
	}
	
	
	public void loginHRM2 () throws IOException {
		
		txt_username.sendKeys(PropertiesFileUse.readData("id"));
		
		txt_password.sendKeys(PropertiesFileUse.readData("password"));
		
		btn_login.click();
		
		
		
	}
}
