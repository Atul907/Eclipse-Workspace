package chromeOptions;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Incognito {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","E:\\E Drive\\software testing\\Selenium server\\chromedriver.exe" );

		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--incognito");
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.smartprix.com");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
		System.out.println("Title of webpage is : " + title);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		driver.quit();
	}

}
