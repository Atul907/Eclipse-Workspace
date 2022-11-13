package chrome;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PopUps {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\E Drive\\software testing\\Selenium server\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
			// simple alert
		driver.findElement(By.xpath("//*[@name=\"alert\"]")).click();
		Thread.sleep(2000);		
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
			// confirmation alert
		driver.findElement(By.xpath("//*[@name=\"confirmation\"]")).click();
		Thread.sleep(2000);
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		
			// prompt alert
		driver.findElement(By.xpath("//*[@name=\"prompt\"]")).click();
		Thread.sleep(2000);
		
		Alert prompt = driver.switchTo().alert();		// way for prompt alert
		//driver.switchTo().alert().sendKeys("test");
		
		String s = prompt.getText();				// method to get print alert message 
		System.out.println(s);
		
		Thread.sleep(2000);
		prompt.sendKeys("test");
		Thread.sleep(2000);
		prompt.accept();
		
			// Action Class
		Actions a = new Actions(driver);
		
		WebElement dc = driver.findElement(By.xpath("//*[@id=\"double-click\"]"));
		a.doubleClick(dc).perform();
		//a.click();
		//a.contextClick();
		
		driver.quit();
		
	}

}
