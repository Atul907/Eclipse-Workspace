package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\E Drive\\software testing\\Selenium server\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		//WebElement my = driver.findElement(By.tagName("input"));
		
		//my.sendKeys("");

		driver.findElement(By.name("username")).sendKeys("student");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("Password123");
		Thread.sleep(2000);
		driver.findElement(By.id("submit")).click();
		
		Thread.sleep(2000);
		
		driver.quit();	
	}
}
