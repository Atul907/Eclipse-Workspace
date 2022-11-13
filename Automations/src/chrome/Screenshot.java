package chrome;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot 
{

	public static void main(String[] args) throws IOException 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\E Drive\\software testing\\Selenium server\\chromedriver.exe ");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.smartprix.com");
		
		// snapshot = (TakesScreenshot).driver;
		// File source = (snapshot).getScreenshotAs(OutputType.FILE);
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);		// source reference variable
		//convert webdriver object to TakesScreenshot & call getScreenshotAs method to create image file & copy file to desired path
		
		
		String path = "C:\\Users\\Atul\\Pictures\\Selenium Screenshots\\First_scrennshot.png";
		
			// path where we need to save screenshot
		File destination = new File(path);
		
		// File destination = new File ("C:\\Users\\Atul\\Pictures\\Selenium Screenshots\\First_scrennshot.png");
		
		FileHandler.copy(source, destination);
		// fileHnadler class to copy contents of source folder to destination folder
		
		driver.close();
		
	}

}
