package chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameDemo {

	 public static void main(String[] args) throws InterruptedException{
         //set the location of chrome browser from the local machine path
         System.setProperty("webdriver.chrome.driver", "E:\\E Drive\\software testing\\Selenium server\\chromedriver.exe");
         
         // Initialize browser
         WebDriver driver=new ChromeDriver();
         
         driver.manage().window().maximize();
         
         //navigate to url
         driver.get("https://demoqa.com/frames");
         
         //Locating frame1 using its id
         WebElement frame1=driver.findElement(By.id("frame1"));
         
         //Switching the WebDriver context to frame1
         driver.switchTo().frame(frame1);
         
         Thread.sleep(3000);
         
         //Identifying the frame heading in a WebElement
         WebElement frame1Heading= driver.findElement(By.id("sampleHeading"));
         
         //Finding the text of the frame1 heading
         String frame1Text=frame1Heading.getText();
         
         Thread.sleep(3000);
         
         //Print the heading
         System.out.println("Text of the frame1 heading is:"+frame1Text);
         
         //closing the driver
         driver.quit();
 }
}

