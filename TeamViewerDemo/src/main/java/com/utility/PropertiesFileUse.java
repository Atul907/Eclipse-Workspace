package com.utility;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class PropertiesFileUse {

	
	public static String readData ( String value) throws IOException {
		
		Properties prop = new Properties();
	     
		 FileInputStream  fis = new FileInputStream(System.getProperty("user.dir") + "//TeamViewer.properties");
			     
			 prop.load(fis);
			     
			 return prop.getProperty(value);
		
		
	
	}
}
