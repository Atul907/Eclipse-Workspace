package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnotherWayOfSendkeysJS {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\E Drive\\software testing\\Selenium server\\chromedriver.exe ");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.saucedemo.com");
		
		Thread.sleep(1000);
		
	//	driver.findElement(By.name("user-name")).sendKeys("standard_user");
//		Thread.sleep(6000);
	//	driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		Thread.sleep(6000);
		
			//you can use Java script Executer to input text into a text box without using sendKeys() method:
			// Initialize JS object
			JavascriptExecutor JS = (JavascriptExecutor)driver;
			// Enter user-name
			//JS.executeScript("document.getElementById('user-name').value='standard_user'");
			
			// 1st way
			WebElement send = driver.findElement(By.xpath("//*[@id='user-name']"));
			JS.executeScript("arguments[0].value='standard_user'", send);
			
			Thread.sleep(2000);
			
			// Enter password
			// 2nd way
			JS.executeScript("document.getElementById('password').value='secret_sauce'");
			Thread.sleep(2000);
		
			WebElement clk = driver.findElement(By.xpath("//*[@id='login-button']"));
			JS.executeScript("arguments[0].click()", clk); 	// click not performd
			
		//driver.findElement(By.id("login-button")).click();
		//Thread.sleep(6000);
		
		//driver.close();
		
	}

}
