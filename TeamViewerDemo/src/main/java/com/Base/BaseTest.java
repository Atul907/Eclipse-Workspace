package com.Base;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.pageLayer.LoginPage;
import com.utility.PropertiesFileUse;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	public static WebDriver driver;
	
	  public LoginPage lp;

	@BeforeMethod
	public void openBrowser() throws IOException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver ();
		
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.get(PropertiesFileUse.readData("url"));

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                      lp = new LoginPage();
	}

      @AfterMethod
	public void tearDown  () {
		
		driver.quit();
	}
 }
