package actiTimeCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ActitimeLogInPage {

		//Declaration
	private WebElement un;
	private WebElement pwd;
	private WebElement login;
	WebDriver driver;
	
		//Initialization
	public ActitimeLogInPage(WebDriver driver)
	{ 
	this.driver=driver;
	un= driver.findElement(By.xpath("//input[@id='username']"));
	pwd = driver.findElement(By.xpath("//input[@name='pwd']"));
	login = 
	driver.findElement(By.xpath("//a[@id='loginButton']"));
	}
	
		//Usage
	public void setActitimeUn()
	{
	un.sendKeys("admin");
	}
	public void setActitimePwd()
	{
	pwd.sendKeys("manager");
	}
	public void verifyLoginButton()
	{
	login.click();
	}
	}

	

