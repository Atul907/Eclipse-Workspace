package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusDate {

	public static void main (String []arg) {
	
	System.setProperty("webdriver.chrome.driver", "E:\\E Drive\\software testing\\Selenium server\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.get("https://www.redbus.in/");
	
	
//	String year = "2022";
//	String month = "October";
//	String day = "24";
	
	driver.findElement(By.xpath("//input[@id='onward_cal']")).click(); 			// opens he date picker
	
		while (true) {
			
			String monthyear = driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			
			monthyear.split("");
			
		}
	
	
	}
}
