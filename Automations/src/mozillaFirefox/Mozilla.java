package mozillaFirefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mozilla {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "E:\\E Drive\\software testing\\Selenium server\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.smartprix.com");
		driver.getTitle();
		
		driver.quit();
	}

}
