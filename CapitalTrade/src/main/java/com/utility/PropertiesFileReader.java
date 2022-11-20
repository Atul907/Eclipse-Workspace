package com.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {

	public static String propertiesReadData (String value) throws IOException {
		
		Properties prop = new Properties();
		
		FileInputStream  fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/java/com/testData/Capital.properties");
		
		prop.load(fis);
		
		return prop.getProperty(value); 
}
}
