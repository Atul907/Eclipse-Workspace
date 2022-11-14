package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	private WebElement username_txt;
	private WebElement password_txt;
	private WebElement login_btn;
	
	public LoginPage(WebDriver driver)
	{
		username_txt=driver.findElement(By.xpath("//input[@id='loginusername']"));
		password_txt=driver.findElement(By.xpath("//input[@id='loginpassword']"));
		login_btn=driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
	}
	
	public void enterUsername()
	{
		username_txt.sendKeys("testacc4");
	}
	
	public void enterPassword()
	{
		password_txt.sendKeys("test");
	}
	
	public void clickOnLoginButton()
	{
		login_btn.click();
	}
}
