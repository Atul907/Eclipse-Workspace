package com.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;

public class CreateAccount extends TestBase {

//to call elements/etc from another class so we can't extend twice so create object of that class 
	//HomePage home = new HomePage ();
	
// driver initialization 
	public CreateAccount() 
	{
		PageFactory.initElements(driver, this);
	}
	
// object repositories
	
	@FindBy(xpath="(//a[@class='top-nav-link nav-link-nongrouped dropdown-toggle ng-star-inserted'])[1]")
	private WebElement accounts_tab;
	
	@FindBy(xpath="(//a[@class='sub-nav-link nav-link action-link ng-star-inserted'])[1]")
	private WebElement create_account;

	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement name_txtBox;
	
	@FindBy(xpath="(//button[@type='button'])[4]")
	private WebElement add_email_btn;

	@FindBy(xpath="(//input[@type='text'])[6]")
	private WebElement email_txtbox;

	@FindBy(xpath="(//input[@type='text'])[9]")
	private WebElement billingCity_txtbox;

	@FindBy(xpath="(//input[@type='text'])[10]")
	private WebElement billingState_txtbox;

	@FindBy(xpath="(//input[@type='text'])[11]")
	private WebElement billingCountry_txtbox;

	@FindBy(xpath="(//button[@type='button'])[2]")
	private WebElement save_btn;

// action methods
	
	public void clickOnAccounts () 
	{
		accounts_tab.click();
	}
	public void clickOnCreateAccounts () 
	{
		create_account.click();
	}
	
	public void enterName(String name) 
	{
		name_txtBox.sendKeys(name);
	}
	
	public void enterEmail(String email)
	{
		add_email_btn.click();
		email_txtbox.sendKeys(email);
	}
	
	public void enterBillingCity (String city) 
	{
		billingCity_txtbox.sendKeys(city);
	}
	
	public void enterBillingState (String state) 
	{
		billingState_txtbox.sendKeys(state);
	}
	
	public void enterBillingCountry (String country) 
	{
		billingCountry_txtbox.sendKeys(country);
	}
	
	public void saveDetails () 
	{
		save_btn.click();
	}
	
}
