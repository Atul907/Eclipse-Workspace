package chromeOptions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","E:\\E Drive\\software testing\\Selenium server\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		
		// website- "https://www.guru99.com/chrome-options-desiredcapabilities.html"
		
		options.addArguments("--headless");
		
		ChromeDriver driver = new ChromeDriver(options);		
		
		driver.get("https://www.smartprix.com");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
		System.out.println("Page Title: " +title);
		
		driver.quit();
		}
	}


