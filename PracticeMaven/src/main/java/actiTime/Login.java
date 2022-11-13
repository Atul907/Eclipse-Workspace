package actiTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

		//Declaration
	
	@FindBy(xpath = "//input[@id='username']")
	private WebElement un;
	
	@FindBy(xpath = "//input[@name='pwd']")
	private WebElement pwd;
	
	@FindBy(xpath = "//a[@id='loginButton']")
	private WebElement login;
	
	WebDriver driver;
	
		//Initialization
	
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
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
