package chrome;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "E:\\E Drive\\software testing\\Selenium server\\chromedriver.exe");
		
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().deleteAllCookies();
	
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	
	//creating JavascriptExecutor interface object by Type casting for scrolling purpose
	JavascriptExecutor js = ((JavascriptExecutor)driver); 
 	
	//driver.findElement(By.xpath("//button[@id=\"newWindowBtn\"]")).click();
	
	Thread.sleep(3000);
	
	// js.executeScript("scrollBy(co-ordinate)");
	// to scroll down by 500 pixels (x,y) where x = horizontal & y = vertical
	js.executeScript("scrollBy(0,500)");   
	
	Thread.sleep(3000);
	
	//to scroll up by 200 pixels (x,y)
	js.executeScript("scrollBy(0,-200)");
	
	driver.close();	
	}
}
