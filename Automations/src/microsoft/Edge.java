package microsoft;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
System.setProperty("webdriver.edge.driver","E:\\E Drive\\software testing\\Selenium server\\msedgebrowser\\msedgedriver.exe"); 		// path copy carefully
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.facebook.com/");

	}

}
