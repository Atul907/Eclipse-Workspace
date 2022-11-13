package chrome;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dimensions {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\E Drive\\software testing\\Selenium server\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver ();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.smartprix.com");
		
		Thread.sleep(2000);
		
		// setting dimensions of page
		
		Dimension d = new Dimension (400 , 400);
		driver.manage().window().setSize(d);
		
		Thread.sleep(2000);
		
		// setting position of page
		
		Point p = new Point ( 500 , 300);
		driver.manage().window().setPosition(p);
		
		Thread.sleep(2000);
		
		driver.close();
		}

}
