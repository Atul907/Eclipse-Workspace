package com.testBase;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.pageLayer.DashboardPage;
import com.pageLayer.ExchangesPage;
import com.pageLayer.LoginPage;
import com.pageLayer.PlaceOrderPage;
import com.pageLayer.PortfolioPage;
import com.pageLayer.RegisterPage;
import com.pageLayer.TransactionPage;
import com.utility.TakeScreenshotClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase 
{
	public static WebDriver driver;
	
	//-------page object declaration------------
	public LoginPage login;
	public TakeScreenshotClass util;
	public TransactionPage transaction;
	public RegisterPage register;
	public PortfolioPage portfolio;
	public PlaceOrderPage order;
	public ExchangesPage exchange;
	public DashboardPage dashboard;
	
	
	//----------------------------------------
	//@Parameters("browser")
	@BeforeMethod
	public void setup() throws InterruptedException 
	{
	
		String br="chrome";
	if(br.equalsIgnoreCase("Chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	else if(br.equalsIgnoreCase("firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	else if(br.equalsIgnoreCase("edge"))
	{
		WebDriverManager.edgedriver().setup();
		driver = new EdgeDriver();
	}
	else
	{
		System.out.println("Please provide correct browser");
	}
		driver.get("https://www.apps.dalalstreet.ai/login");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		
		//---------object  initialization--------
		
		    login = new LoginPage();
		    util = new TakeScreenshotClass();
		    transaction = new TransactionPage();
		    register = new RegisterPage();
		    portfolio = new PortfolioPage();
		    order = new PlaceOrderPage();
	        exchange = new ExchangesPage();
	     	dashboard = new DashboardPage();
 		
		//-----------Login steps-----------------
		   login = new LoginPage();
		   login.enterEmail("enter email");
		   login.enterPassword("enter pass");
		   login.clickOnLoginBtn();
		   Thread.sleep(3000);
		
	}
	
	@AfterMethod
	public void closeApp() throws InterruptedException 
	{
		Thread.sleep(5000);
		//----------Logout--------
		//dashboard.logOut();
		//-----browser close---------
		driver.quit();
	}
}
