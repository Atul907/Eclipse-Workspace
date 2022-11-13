package toolsQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\E Drive\\software testing\\Selenium server\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize(); // always max so can access every web element
		
		driver.get("https://demoqa.com/text-box");
		
		driver.findElement(By.id("userName")).sendKeys("Akshay Kumar");
		driver.findElement(By.id("userEmail")).sendKeys("akshaykumar@gmail.com");		
		driver.findElement(By.id("currentAddress")).sendKeys("Mumbai-Maharashtra-India");
		
	
	//	driver.findElement(By.id("permanentAddress")).sendKeys("Mumbai-Maharashtra-India");
		
		 WebElement permanentAddress = driver.findElement(By.id("permanentAddress"));
		 	permanentAddress.sendKeys("Mumbai-Maharashtra-India");
		
		Thread.sleep(3000);
	
		//driver.manage().deleteAllCookies();
		
		//driver.findElement(By.linkText("Submit")).click();
		
		//driver.findElement(By.id("submit")).click();
		//driver.findElement(By.className("text")).click();
		
		//driver.findElement(By.id("downloadButton")).click();
		
		//driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
		//driver.findElement(By.xpath("//button[contains(@type,'button')]")).click();
		//driver.switchTo().newWindow(WindowType.TAB);
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
