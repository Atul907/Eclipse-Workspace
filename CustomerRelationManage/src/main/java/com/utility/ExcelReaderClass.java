package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaderClass {

	public static String readData (int row , int column) throws IOException {
		
		File source = new File (System.getProperty("user.dir") + "/src/main/java/com/testData/CRMTestData.xlsx");
		
		FileInputStream excelfile = new FileInputStream(source);
		
		//to load the workbook 
		
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(excelfile);
		
		
		// to get the Sheet from the workbook
		
		XSSFSheet sh1 = workbook.getSheetAt(0);
				
		String value = sh1.getRow(row).getCell(column).getStringCellValue();
				
		System.out.println("The values are : " + value);
		
		return value;
		
	}
	
}
