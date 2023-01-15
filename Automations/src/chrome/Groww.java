package chrome;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Groww 
{		
	// GROWW live app login and pop up & window handling

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\E Drive\\Software\\Selenium server\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();		
		driver.get("https://groww.in/login");

		String parent = driver.getWindowHandle();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@id='gmail_signin_button']")).click();
		
		Set<String> child = driver.getWindowHandles();
		int a = child.size();
		
		String [] id = new String [a];
				int i = 0;
			
				for (String single:child) {
					id [i] = single;
					i++;		
		}	
		driver.switchTo().window(id[1]);
		driver.manage().window().maximize();
		driver.getTitle();
		
		WebElement send = driver.findElement(By.xpath("(//*[@class=\"whsOnd zHQkBf\"])[1]"));
		send.sendKeys("atulmishra907@gmail.com");
		driver.findElement(By.xpath("(//*[@class=\"VfPpkd-vQzf8d\"])[2]")).click();
		
		driver.switchTo().window(parent);
		driver.quit();
		}

}
