package com.testBase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.utility.PropertiesFileReader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	
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
		
		driver.get(PropertiesFileReader.propertiesReadData("url"));
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
	}
	
	@AfterMethod
	public void tearDown () {
		
		//driver.quit();
	}
}
