package chrome;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsSynchronisation {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\E Drive\\software testing\\Selenium server\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.naukri.com");
		
			// implicit wait for entire page to load 
				// implicit wait = waiting time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("scrollBy (0,700)");
		
			// explicit wait for particular web element which takes time to load (until web element is visible/clickable)
				// explicit wait = condition + specific time
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name=\"MNCs\"]")));
		
			// fluent Wait 
				// fluent wait = specific waiting time + condition + frequency
		FluentWait<WebDriver> fluent = new FluentWait <WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(1))
				.ignoring(NoSuchElementException.class);
		
		fluent.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"premium-collection-wdgt\"]/div/a")));
		
		driver.findElement(By.xpath("//*[@id=\"premium-collection-wdgt\"]/div/a")).click();
		
		// wait browser loading for some time
		Thread.sleep(2000);
		
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		
		Duration time = driver.manage().timeouts().getPageLoadTimeout();
		System.out.println("time required to load the page is :" + time);
		driver.quit();
	}

}
