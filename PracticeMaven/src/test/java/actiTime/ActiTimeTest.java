package actiTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActiTimeTest {

	WebDriver driver;
	Login login;
	HomePage home;
	
	@BeforeClass
	public void openBrowser () 
	{		
		System.out.println("Opening Browser");
		System.setProperty("webdriver.chrome.driver", "E:\\E Drive\\software testing\\Selenium server\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		System.out.println("Chrome opened Succesfully");
		login = new Login(driver);
		home = new HomePage(driver);
	}
	
	@AfterClass
	public void closeBrowser ()
	{
		System.out.println("Closing Browser");
		driver.quit();
	}
	
	@BeforeMethod
	public void login ()
	{
		login.setActitimeUn();
		login.setActitimePwd();
		login.verifyLoginButton();
		System.out.println("Login Successfully");
	}
	
	@Test
	public void logoVerify()
	{
		home.verifyActitimeLogo();
		System.out.println("Logo Verified");
	}
	
	@AfterMethod
	public void logout ()
	{
		home.verifyActitimeLogout();
		System.out.println("Logout successfull");
	}
	
}
