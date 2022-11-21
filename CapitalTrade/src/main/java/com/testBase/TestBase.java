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

	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeClass
	public void start()
	{
		logger = Logger.getLogger("Capital Trade Investment Banking Framework");
		PropertyConfigurator.configure("Log4j.properties");
		
		logger.info("Framework execution started");
	}
	
	@AfterClass
	public void stop()
	{
		logger.info("Framework execution finished");
	}
	
	
	String br = "Chrome";
	
	// browser setup
	@BeforeMethod
	public void setUp () throws IOException 
	{
		if (br.equalsIgnoreCase("Chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		else if (br.equalsIgnoreCase("Firefox")) 
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver ();
		}
		
		else if (br.equalsIgnoreCase("Edge")) 
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver ();
		}
		
		else 
		{
			System.out.println("Please provide correct Browser");
			
		}
		
		logger.info("Browser initialised");
		driver.get(PropertiesFileReader.propertiesReadData("url"));
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		logger.info("Opened Url, maximized browser and applied implicit wait");
		
	}
	
	@AfterMethod
	public void tearDown () {
		
		driver.quit();
		logger.info("Browser closed");
	}
}
