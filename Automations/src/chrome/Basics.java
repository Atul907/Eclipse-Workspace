package chrome;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;		// till selenium is package & webdriver is class name
import org.openqa.selenium.chrome.ChromeDriver;  // till chrome is package & chromedriver is class name

public class Basics {

	public static void main(String[] args) throws InterruptedException {
		
	//	System.setProperty(key, path);				// Interview question and copy path and give one more backlash
		
	System.setProperty("webdriver.chrome.driver", "E:\\E Drive\\software testing\\Selenium server\\chromedriver.exe");
		
	// create object and open Chrome
	WebDriver driver = new ChromeDriver();		// capital letters for interface and class (driver is refrence variable)
		
		// to clear cookies from browser before launching any client website
				driver.manage().deleteAllCookies();		
		
		// maximize window
				driver.manage().window().maximize();
				
		// minimize possible in after Selenium 3.0 from 2021
				//driver.manage().window().minimize(); 	
				
		// open by copying URL inside chrome
				driver.get("https://www.instagram.com/?hl=en"); 	
		
		// to stop for some time (sleep time) 
		// calls throws interruptedexception (any interuption(popups,add,etc) comes to throw out of main method)
				Thread.sleep(1500); 	
		
		// to refresh 
				driver.navigate().refresh();
		
		// to get title (driver.getTitle();)
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());	
		
		// open multiple tabs in flow
				driver.get("https://www.flipkart.com ");
			
		// navigation
				driver.navigate().to("https://www.smartprix.com");  // alternate option of get to jump/open to url
				
				driver.navigate().back();			// to come back
				driver.navigate().forward(); 		// to go forward
					
		//driver.navigate().to("https://www.flipkart.com ");
		
		// to manage page dimensions 
				Dimension d = new Dimension(350,400);
				driver.manage().window().setSize(d);
		
		// to manage pixel/ coordinates/ position of a page
				Point p = new Point (250,350);
				driver.manage().window().setPosition(p);
		
		// close
		// driver.close ();    // whole window   
				driver.quit();		// particular tab
		
		
		
	}
}
