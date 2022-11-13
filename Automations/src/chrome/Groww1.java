package chrome;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Groww1 {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "E:\\E Drive\\software testing\\Selenium server\\chromedriver.exe ");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://groww.in/login");
		
		
		driver.findElement(By.xpath("//div[@id='gmail_signin_button']")).click();
		
			//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement send = driver.findElement(By.xpath("(//*[@class=\"whsOnd zHQkBf\"])[1]"));
		send.sendKeys("atulmishra907@gmail.com");
		
		Thread.sleep(4000);
		

	}

}
