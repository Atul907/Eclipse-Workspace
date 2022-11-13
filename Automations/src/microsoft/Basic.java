package microsoft;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Basic {

	public static void main (String [] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver","E:\\E Drive\\software testing\\Selenium server\\msedgebrowser\\msedgedriver.exe");
		
		WebDriver ip = new EdgeDriver();
		
		ip.get("https://www.google.com");
		
		System.out.println(ip.getTitle());
		System.out.println(ip.getCurrentUrl());
		
		Thread.sleep(3000);
		
		ip.manage().window().maximize();
		
		ip.navigate().refresh();
		
		ip.manage().window().minimize();
		
		ip.manage().window().maximize();
		
		ip.navigate().to("https://www.smartprix.com/");
		
		System.out.println(ip.getTitle());
		System.out.println(ip.getCurrentUrl());
		
		ip.navigate().back();
		System.out.println(ip.getTitle());
		
		Thread.sleep(3000);
		
		ip.navigate().forward();
		System.out.println(ip.getTitle());
		
		ip.quit();
		
	}
	
}
