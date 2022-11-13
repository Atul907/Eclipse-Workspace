package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig()
	{
		String path = "C:\\Users\\232338\\OneDrive\\Desktop\\04June Github\\04JuneDemoBlazeTestProject\\TestProject\\Config\\Config.properties";
		
		File file = new File(path);
		try 
		{
			FileInputStream fis = new FileInputStream(file);
			pro = new Properties();
			pro.load(fis);
		} 
		catch (IOException e) 
		{
			System.out.println("Exception is " +e.getMessage());
		}
	}
	
	// read url 
	public String getApplicationURL()
	{
		String url = pro.getProperty("url");
		return url;
	}
	

}
