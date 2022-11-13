package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\E Drive\\software testing\\Selenium server\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		Thread.sleep(5000);
		
			// Action Class
		Actions a = new Actions(driver);
	
		WebElement dc = driver.findElement(By.xpath("//*[@id=\"double-click\"]"));
		//a.doubleClick();
		a.doubleClick(dc).build().perform();   
		//a.click();
		//a.contextClick();
	
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
	}

}
