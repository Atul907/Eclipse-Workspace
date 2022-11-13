package chrome;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandleArray {

	
	@SuppressWarnings("deprecation")			// this are called annotation
	public static void main(String[] args) throws InterruptedException  {
		
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
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"newWindowBtn\"]")).click();
		
		Set<String> child = driver.getWindowHandles();
		System.out.println("the id of child window is :" + child);
		
		int a = child.size();
		System.out.println("the size of string array as :" + a);
		
		String [] id = new String [a];
				int i = 0;
			
				for (String single:child) {
					id [i] = single;
					i++;		
					System.out.println(single);
		}	
		driver.switchTo().window(id[1]);
		driver.manage().window().maximize();
		driver.getTitle();

		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("scrollBy(0,500)");
		Thread.sleep(3000);
		
		System.out.println("script is ended");
		
		driver.switchTo().window(id[0]);
		System.out.println((driver.getCurrentUrl()));
		Thread.sleep(3000);
		
		JavascriptExecutor s = ((JavascriptExecutor)driver);
		s.executeScript("scrollBy(0,500)");
		
		driver.switchTo().window(id[1]);
		Thread.sleep(2000);
		driver.close();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
