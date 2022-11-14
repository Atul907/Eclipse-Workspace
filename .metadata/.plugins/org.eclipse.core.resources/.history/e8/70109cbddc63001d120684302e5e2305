package com.PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBaseClass;

public class HomePage extends TestBaseClass
{
	public static WebElement acc_module;
	
	//-------WebElement initialization---------
	public HomePage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	//-----------Obj Repo-------------------
	@FindBy(xpath="(//a[contains(@class, 'top-nav')])[1]")
	private WebElement Accounts;
	
	@FindBy(xpath="(//a[contains(@class, 'top-nav')])[2]")
	private WebElement Contacts;
	
	@FindBy(xpath="(//a[contains(@class, 'top-nav')])[3]")
	private WebElement Opportunities;
	
	@FindBy(xpath="(//a[contains(@class, 'top-nav')])[4]")
	private WebElement Leads;
	
	@FindBy(xpath="(//a[contains(@class, 'top-nav')])[5]")
	private WebElement Quotes;
	
	@FindBy(xpath="(//a[contains(@class, 'top-nav')])[6]")
	private WebElement Calendar;
	
	@FindBy(xpath="//a[@class='sub-nav-link nav-link action-link ng-star-inserted']")
	private List <WebElement> module_link;
	
	//------------Action method----------
	
	public WebElement accountsModule() 
	{
		acc_module= Accounts;
		return acc_module;
	}
	public WebElement createAccountLink() 
	{
		acc_module= module_link.get(0);
		return acc_module;
	}
}
