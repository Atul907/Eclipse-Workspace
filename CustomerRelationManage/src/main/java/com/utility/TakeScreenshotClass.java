package com.utility;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;

public class TakeScreenshotClass extends TestBase 
{
	static String path = "E:\\E Drive\\Software\\Automation- (Selenium)\\Failed Screenshots\\";

	public TakeScreenshotClass()
	{
		PageFactory.initElements(driver, this);
	}
	//url get 
	public String getUrl()
	{
		String current_url = driver.getCurrentUrl();
		return current_url;
	}

	public static void takeScreenShot(String filename)
	{
		try 
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			
//			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
//		    LocalDateTime now = LocalDateTime.now();
//		    String dateandtime = dtf.format(now);
			
			File des = new File(path + filename+System.currentTimeMillis()+".png");
			FileHandler.copy(src, des);
		} 
		catch (IOException e)  
		{
			System.out.println("Please provide correct path");
			e.printStackTrace();
		}	
	}
	
//		//Creating a method getScreenshot and passing two parameters 
//		//driver and screenshotName
//	
//		public static String getScreenshot(WebDriver driver, String screenshotName) throws Exception 
//		{
//	        //below line is just to append the date format with the screenshot name to avoid duplicate names		
//	   
//			String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
//			TakesScreenshot ts = (TakesScreenshot) driver;
//			File source = ts.getScreenshotAs(OutputType.FILE);
//			
//	        //after execution, you could see a folder "FailedTestsScreenshots" under src folder
//			
//		String destination = System.getProperty("user.dir") +  
//		"E:\\E Drive\\Software\\Automation- (Selenium)\\Failed Screenshots\\"+screenshotName+dateName+".png";
//			
//			File finalDestination = new File(destination);
//			FileUtils.copyFile(source, finalDestination);
//			
//	        //Returns the captured file path
//			return destination;
//	}
	
	
}
