package com.pageLayer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;

public class TransactionPage extends TestBase
{
	//---------initialization--------
	public TransactionPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//--------obj repo------
	@FindBy(xpath="//div[@class='col-xl-12']//tbody//tr//td")
	private List<WebElement> transaction_data;
	
	@FindBy(xpath="(//table)[1]//thead//th")
	private List<WebElement> column_heading;
	
	@FindBy(xpath="(//table)[1]//tbody//tr")
	private List<WebElement> rows;
					
	//---------Action Method------
	
	
	//Print on console
	public void printTransactionData() throws InterruptedException 
	{
		int column_count = column_heading.size();
		int rows_count = rows.size();
		
		//for heading
		for(int i=0; i<column_count; i++)
		{
			String data = column_heading.get(i).getText();
			System.out.print(data+", ");
		} 
		System.out.println(" ");
		
		//for data
		for(int i=0; i<rows_count; i++ ) 
		{
			List<WebElement> rows_value = driver.findElements(By.xpath("((//table)[1]//tbody//tr)["+(i+1)+"]//td"));
			Thread.sleep(2000);
			for(int j=0; j<column_count; j++)
			{
				String col_data = rows_value.get(j).getText();
				System.out.print(col_data+", ");
			}
			System.out.println(" ");
		}

	}
	
	//export data and maintan on excell sheet
	public void createExcelData() throws IOException 
	{
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("Dalal_Street_Transaction_Data");
		XSSFRow row;
		row = sheet.createRow(0);
		
		int column_count = column_heading.size();
		int rows_count = rows.size();
		
		String[] row_data = new String[column_count];
		
		for(int i=0; i<rows_count; i++)
		{
			List<WebElement> rows_value = driver.findElements(By.xpath("((//table)[1]//tbody//tr)["+(i+1)+"]//td"));
			row = sheet.createRow(i);      

			for(int j=0; j<column_count; j++) 
			{
				row_data[j] = rows_value.get(j).getText();
				XSSFCell cell = row.createCell(j);   
				
				if (cell.getColumnIndex() == j)
				{
					//cell.setCellValue(row_data[j]);
				} 
			}
		}
		
		String path = "D:\\FrameworkClass\\transaction data.xlsx";
		FileOutputStream out = new FileOutputStream(path);
		//wb.write(out);
		System.out.println("File is Generated....");
		out.close();
	}
	
}
