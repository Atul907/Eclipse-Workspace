package generlization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateTo implements CommonProperty{

	static WebDriver driver;
	
	public void chrome () throws InterruptedException 
	{
		System.setProperty(chromeKey, chromePath);
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(3000);

		driver.close();	
	}

	public void edge() throws InterruptedException 
	{
		System.setProperty(edgeKey, edgePath);
		driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.close(); 
	}

	@Override
	public void firefox() throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty(firefoxkey, FirefoxPath);
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.close();
	}
	
}
