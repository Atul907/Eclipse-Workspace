package snap;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
	public static WebDriver driver;
	 
	public static void initialization()
	{
		// another way instead of set property manually 
		
	WebDriverManager.chromedriver().setup();
		
	//System.setProperty("webdriver.chrome.driver", "E:\\E Drive\\software testing\\Selenium server\\chromedriver.exe ");
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/login/device-based/regular/login/?login_attempt=1&lwv=100");
	 
	}
	public void failed()
	{
	File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try 
	{
	FileHandler.copy(srcFile, new File("C:\\Users\\Atul\\Pictures\\snap\\FbSnapshot.png"
	));
	} 
	catch (IOException e)
	{
	e.printStackTrace();
	}
	}
}
