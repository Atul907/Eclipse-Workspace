package com.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;

public class HomePage extends TestBase{

// 1- driver initialization using constructor
	
	public HomePage () 
	{
		PageFactory.initElements(driver, this);
	}

// 2- object repositories

	@FindBy(xpath="(//a[@class='top-nav-link nav-link-nongrouped dropdown-toggle ng-star-inserted'])[1]")
	public WebElement accounts_tab;
	
	@FindBy(xpath="(//a[@class='top-nav-link nav-link-nongrouped dropdown-toggle ng-star-inserted'])[2]")
	public WebElement contacts_tab;
	
	@FindBy(xpath="(//a[@class='top-nav-link nav-link-nongrouped dropdown-toggle ng-star-inserted'])[3]")
	public WebElement oppurtunities_tab;
	
	@FindBy(xpath="(//a[@class='top-nav-link nav-link-nongrouped dropdown-toggle ng-star-inserted'])[4]")
	public WebElement leads_tab;
	
	@FindBy(xpath="(//a[@class='top-nav-link nav-link-nongrouped dropdown-toggle ng-star-inserted'])[5]")
	public WebElement quotes_tab;
	
	@FindBy(xpath="(//a[@class='top-nav-link nav-link-nongrouped dropdown-toggle ng-star-inserted'])[6]")
	public WebElement calender_tab;
	
	@FindBy(xpath="//a[@class='nav-link-nongrouped dropdown-toggle']")
	public WebElement more_tab;
	
	@FindBy(xpath="//span[@class='global-user-name ng-tns-c302-1']")
	public WebElement profiles_tab;
	
	@FindBy(xpath="//input[@name='global-search-term']")
	public WebElement search_tab;
	
	@FindBy(xpath="(//button[@type='button'])[1]")
	public WebElement new_tab;
	
	@FindBy(xpath="//a[@id='tab0']")
	public WebElement suiteCRM_Dashboard_tab;
	
	@FindBy(xpath="//a[@class='dropdown-toggle']")
	public WebElement actions_tab;
	
// action methods
	
	public void clickOnAccounts () 
	{
		accounts_tab.click();
	}
	
	public void clickOnContacts () 
	{
		contacts_tab.click();
	}
	
	public void clickOnOppurtunities () 
	{
		oppurtunities_tab.click();
	}
	
	public void clickOnLeads () 
	{
		leads_tab.click();
	}
	
	public void clickOnQuotes () 
	{
		quotes_tab.click();
	}
	
	public void clickOnCalender () 
	{
		calender_tab.click();
	}
	
	public void clickOnMore () 
	{
		more_tab.click();
	}

	public void clickOnProfiles () 
	{
		profiles_tab.click();
	}

	public void clickOnSearch () 
	{
		search_tab.click();
	}

	public void clickOnNew () 
	{
		new_tab.click();
	}

	public void clickOnSuiteCRMDashboard () 
	{
		suiteCRM_Dashboard_tab.click();
	}

	public void clickOnActions () 
	{
		actions_tab.click();
	}
	
}
