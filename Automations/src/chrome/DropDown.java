package chrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\E Drive\\software testing\\Selenium server\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("file:///C:/Users/Atul/Desktop/WebPage/practice.html");
		Thread.sleep(2000);
		
		JavascriptExecutor s = ((JavascriptExecutor)driver);
		s.executeScript("scrollBy(0,300)");
		
		WebElement element = driver.findElement(By.xpath("//*[@id=\"Number\"]"));
		element.click();
		
		// we use findElements method in drop down 
		
		Select b = new Select (element);	// select class object creation (3 types[selectBy - Value,Index,VisibleText])
		b.selectByValue("Atul");
		// b.selectByIndex(0);
		// b.selectByVisibleText("Renuka");
		
		// to get all options
		List<WebElement> total = b.getOptions();
		int count = total.size();
		System.out.println(count); 
		
		// to print all options of drop down
		for(int i=0;i<count;i++)
		{
		String l = total.get(i).getText();
		System.out.println(l);
		}

		
		 driver.findElement(By.xpath("/html/body/a/form/input")).click();
		 
		driver.quit();
	}
 
}
