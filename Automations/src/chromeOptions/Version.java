package chromeOptions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Version {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\E Drive\\software testing\\Selenium server\\chromedriver.exe" );

		ChromeOptions options = new ChromeOptions();
		
		ChromeOptions ver = options.addArguments("--version");
		
		System.out.println("current version is : " + ver);
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.smartprix.com");
		
		String title = driver.getTitle();	
		
		System.out.println("Title of website is : " + title);
		
		driver.quit();
		
	}
	
}
