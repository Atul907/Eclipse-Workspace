package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForexBroker {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "E:\\E Drive\\Software\\Selenium server\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://auth.pepperstone.com/login");
		
		Thread.sleep(15000);
		
		WebElement username = driver.findElement(By.xpath("//input[@id='field5']"));
		username.sendKeys("akshaymishra349@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='field7']")).sendKeys("Akshay@349");
		
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		login.click();
		Thread.sleep(3000);
		
		//driver.findElement(By.linkText("Logout")).click();
		
	}

}
