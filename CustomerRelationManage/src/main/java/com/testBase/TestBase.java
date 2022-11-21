package com.testBase;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.utility.PropertiesFileReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

// variable declaration	
	public static WebDriver driver;
	public static Logger logger;
	String browser = "Firefox";
	
//Logger setup configuration	
	@BeforeClass
	public void start () {
		logger = Logger.getLogger("CRM Telecom Project");
		PropertyConfigurator.configure("Log4j.properties");
	}

// logger close
	@AfterClass
	public void stop () {
		logger.info("Framework Execution stopped");
	}
	
// browser setup	
	@BeforeMethod
	public void browserSetup () throws IOException {
		
		if (browser.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("Edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if (browser.equalsIgnoreCase("Firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver ();
		}
		else
		{
			System.out.println("please provide correct browser");
		}
		
		logger.info("Browser Initialised");
		
		driver.get(PropertiesFileReader.propertiesReadData("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		logger.info("Browser launched, Maximized, deleted cookies, applied implicit wait ");
	}
	
	@AfterMethod
	public void tearDown () 
	{
		//driver.quit();
		logger.info("Browser Closed");
	}
}
