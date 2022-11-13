package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.TestBase.TestBaseClass;

public class ReadData extends TestBaseClass
{
	public static String readData(String sheetname, int rownum, int cellnum) throws IOException 
	{
		String path = "C:\\Eclipse Framework\\CRM\\CRMTelecomProject\\src\\main\\java\\com\\TestData\\CRM Credential.xlsx";
	    File file = new File(path);
	    FileInputStream fis = new FileInputStream(file);
	    XSSFWorkbook wb = new XSSFWorkbook(fis);
	    String data = wb.getSheet(sheetname).getRow(rownum).getCell(cellnum).getStringCellValue();
	    return data;
	}
}
