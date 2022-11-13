package excelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWrite {

	public static void main(String[] args) throws EncryptedDocumentException, IOException  {

		String path = "E:\\E Drive\\software testing\\Sheet\\Book1.xlsx";
		
		FileInputStream file = new FileInputStream(path);
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sh1 = workbook.getSheetAt(0);
		
		String val = sh1.getRow(0).getCell(0).getStringCellValue();
		String val1 = sh1.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(val);
		System.out.println(val1);

		workbook.close();
	}

}
