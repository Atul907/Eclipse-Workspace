package com.TestBase;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.PageLayer.CreateAccountPage;
import com.PageLayer.HomePage;
import com.PageLayer.LoginPage;
import com.Utility.ReadConfig;
import com.Utility.ReadData;
import com.Utility.UtilClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBaseClass 
{
	//-----variable Declaration------
	public static WebDriver driver;
	public static Logger logger;
	public Actions action;
	
	//--------Page Object declaration-----------
	public LoginPage login;
	public HomePage home;
	public CreateAccountPage createAccount;
	public UtilClass util;
	public static ReadConfig readconfig;
	
	//---------Logger start and stop-------------
	@BeforeTest
	public void start()
	{
		logger = Logger.getLogger("CRMTelecomPrjectFramework");
		PropertyConfigurator.configure("Log4j.properties");
		logger.info("Framework execution start");
	}
	@AfterTest
	public void stop()
	{
		logger.info("Framework execution stop");
	}

	//-----------browser launch and close------------
	//@Parameters("browser")
	@BeforeClass
	public void browserLaunch() throws IOException, InterruptedException 
	{
		String br ="chrome";
		if(br.equalsIgnoreCase("chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			logger.info("chrome browser launch");
		}
		else if(br.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			logger.info("edge browser launch");
		}
		else if(br.equalsIgnoreCase("firefox")) 
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			logger.info("firefox browser launch");
		}
		else 
		{
			logger.info("please provide correct browser");
		}
		
		readconfig = new ReadConfig();
		
		driver.get(readconfig.getApplicationUrl());
		logger.info("application launch");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//----------Object Creation-----------
		action = new Actions(driver);
		login = new LoginPage();
		home = new HomePage();
		util = new UtilClass();
		createAccount=new CreateAccountPage();
	}
	
	@AfterClass
	public void browserClose() 
	{
		//driver.quit();
	}
	
	@BeforeMethod
	public void login() throws IOException, InterruptedException 
	{
		login.enterUserName("will");
		logger.info("username enterd");
		login.enterPassword("will");
		logger.info("password enterd");
		login.clickOnLoginBtn();
		logger.info("login btn clicked");
		Thread.sleep(7000);
	}
}
