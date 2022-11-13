package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\E Drive\\software testing\\Selenium server\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("file:///C:/Users/Atul/Desktop/WebPage/practice.html");
		Thread.sleep(2000);
		
		JavascriptExecutor s = ((JavascriptExecutor)driver);
		s.executeScript("scrollBy(0,500)");
		Thread.sleep(2000);
		
			// locate frames
		driver.findElement(By.id("frame1"));		 
		
			// switch driver to another frame u want to operate
		driver.switchTo().frame("frame1");			
		
		JavascriptExecutor j = ((JavascriptExecutor)driver);
		j.executeScript("scrollBy(0,350)");						// scroll down
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"id123\"]")).sendKeys("testing");
		Thread.sleep(2000);
		
		 	//Finding the size(total number of frame) 
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println("number of frames present are :" + size);
		
			// switch to parent frame back 
		driver.switchTo().parentFrame();
		
			//JavascriptExecutor s = ((JavascriptExecutor)driver);
		s.executeScript("scrollBy(0,-200)"); // scroll up
		
		driver.findElement(By.name("login")).sendKeys("return_frame");
		Thread.sleep(2000);
		
		driver.quit();	
}
}
