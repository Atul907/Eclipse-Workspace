package toolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Butons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.setProperty("webdriver.chrome.driver", "E:\\E Drive\\software testing\\Selenium server\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/buttons");
		
		driver.findElement(By.id("fXAA")).click();
		
		//driver.findElement(By.xpath("//button[contains(text,'Click Me')]")).click();
		//driver.findElement(By.xpath("//button[contains(@type,'button')]")).click();
		
		
		
	}

}
