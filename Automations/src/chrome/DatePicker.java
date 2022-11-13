package chrome;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\E Drive\\software testing\\Selenium server\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		
				// for date pick
		List<WebElement> date = driver.findElements(By.xpath("//*[@data-handler='selectDay']"));

		for(WebElement day:date) {
			
			if(day.getText().equals("17")) {
				
				day.click();
			}
		}
		
				// for month and year
		
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
		
		
		
		
//		List<WebElement> year = driver.findElements(By.xpath("//*[@class='ui-datepicker-year']"));
//		
//			for(WebElement century:year) {
//			
//			if(century.getText().equals("2021")) {
//				
//				century.click();
//			}
//		}
		
		
		
	}

}
