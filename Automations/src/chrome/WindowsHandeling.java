package chrome;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandeling {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "E:\\E Drive\\software testing\\Selenium server\\chromedriver.exe");
		
	WebDriver driver= new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.manage().deleteAllCookies();
	
	driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	driver.manage().window().maximize();
	
	String parent = driver.getWindowHandle();
	System.out.println("the id of parent window is :" + parent);
	
	//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//*[@id=\"newWindowBtn\"]")).click();
	
	Set<String> child = driver.getWindowHandles();
	System.out.println("the id of child window is :" + child);
	driver.getTitle();
	
	for (String single : child) {
		
		// if(!(single.equals(parent)))
		if (!(single.equals(parent))) {
			
			driver.switchTo().window(single);
			
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			JavascriptExecutor js = ((JavascriptExecutor)driver);
			js.executeScript("scrollBy(0,600)");
			//*[@id="navigateHome"]
			driver.findElement(By.xpath("//*[@id=\"navigateHome\"]")).click();
			driver.getTitle();
			driver.close();
			}
		}
			driver.switchTo().window(parent);
			driver.getTitle();
			driver.quit();
	}
}

	

