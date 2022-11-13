package chromeOptions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StartMaximized {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","E:\\E Drive\\software testing\\Selenium server\\chromedriver.exe" );
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("start-maximized");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.smartprix.com");
		
		String title = driver.getTitle();
		
		System.out.println("Title of page is : " + title);
		
		driver.close();
		
	}

}
