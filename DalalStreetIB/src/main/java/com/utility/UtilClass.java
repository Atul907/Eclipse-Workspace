package com.utility;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import com.testBase.TestBase;

import net.bytebuddy.utility.RandomString;

public class UtilClass extends TestBase
{	
	public static WebElement input;
	public static WebElement element;

	public UtilClass ()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String getUrl() 
	{
		String Current_url=driver.getCurrentUrl();
		return Current_url;
	}
	
	
	public static void takesScreenshot(String filename, String path)
	{	
		try 
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			String Random = RandomString.make(2);
			//String path = "C:\\Eclips Workspace\\DalalStreetIB\\ScreenShots\\";
			File destination = new File(path+filename+""+Random+".png");
			FileHandler.copy(src, destination);
			//FileUtils.copyDirectory(src, destination);
		}
		catch(IOException e)
		{
			System.out.println("Please provide correct path");
			e.printStackTrace();
		}
	}
	public static void takesElementScreenshot(String filename, String path)
	{	
		try 
		{
			TakesScreenshot ts = (TakesScreenshot)input;
			File src = ts.getScreenshotAs(OutputType.FILE);
			String Random = RandomString.make(2);
			//String path = "C:\\Eclips Workspace\\DalalStreetIB\\ScreenShots\\";
			File destination = new File(path+filename+""+Random+".png");
			FileHandler.copy(src, destination);
			//FileUtils.copyDirectory(src, destination);
		}
		catch(IOException e)
		{
			System.out.println("Please provide correct path");
			e.printStackTrace();
		}
	}
	
	public static void javaScript() 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",element);
	}
}
