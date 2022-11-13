package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver; 

public class LoginAssignment {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "E:\\E Drive\\software testing\\Selenium server\\chromedriver.exe ");
	
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
	
	Thread.sleep(4000);
	
	driver.findElement(By.name("username")).sendKeys("Akshay173");
	//Thread.sleep(4000);
	driver.findElement(By.name("password")).sendKeys("Akshay@173");
	//Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	//Thread.sleep(4000);
	//driver.findElement(By.)
	//driver.quit();
	}
}
