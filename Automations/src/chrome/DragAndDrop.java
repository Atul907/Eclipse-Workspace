package chrome;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "E:\\E Drive\\software testing\\Selenium server\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://demoqa.com/droppable");
				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
		Actions a = new Actions(driver);
		
		WebElement source = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement destination = driver.findElement(By.xpath("(//*[text()='Drop here'])[1]"));
		
		a.clickAndHold(source).moveToElement(destination).release().build().perform();
		
		//a.dragAndDrop(source, destination).build().perform();  //1
		
		//a.dragAndDropBy(source, 250, 0).build().perform();
		
			// Action Class
		// a = new Actions(driver);			
//		a.click();
//		a.doubleClick(location);
//		a.doubleClick(null);    	// web element reference variable
//		a.doubleClick();
//		a.contextClick(null);		// web element reference variable	
		
		Thread.sleep(2000);
		
		driver.quit();
	}

}
