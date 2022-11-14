package com.testBase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.pageLayer.Loginpage;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.PropertiesFileReader;

public class TestBase {

	public static WebDriver driver;
	String br = "Chrome";
	
//	public void setUp(String br) throws IOException
//	{
//		if(br.equalsIgnoreCase("Chrome"))
//		{
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//		}
//		else if(br.equalsIgnoreCase("firefox"))
//		{
//			WebDriverManager.firefoxdriver().setup();
//			driver = new FirefoxDriver();
//		}
//		else if(br.equalsIgnoreCase("edge"))
//		{
//			WebDriverManager.edgedriver().setup();
//			driver = new EdgeDriver();
//		}
//		else
//		{
//			System.out.println("Please provide correct browser");
//		}
//		System.out.println("Browser Launched");
	@BeforeClass
	public void setUp(String br) throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\E Drive\\software testing\\Selenium server\\chromedriver.exe");
		driver = new ChromeDriver();
		
		Thread.sleep(3000);
		driver.get(PropertiesFileReader.propertiesReadData("url"));
		Thread.sleep(10000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		System.out.println("Opened Url, maximized browser and applied implicit wait");

	
	
		//------------Login steps -------------------
		Loginpage login = new Loginpage();
		login.enterEmailAddress();
		login.enterPassword();
		login.clickOnLoginButton();
		
		
	}

	@AfterClass
	public void tearDown()
	{
		driver.quit();
	
	}
}
