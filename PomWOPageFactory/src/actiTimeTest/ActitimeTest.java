package actiTimeTest;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import actiTimeCode.ActitimeHomePage;
import actiTimeCode.ActitimeLogInPage;

public class ActitimeTest {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\E Drive\\software testing\\Selenium server\\Chrome\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://localhost/login.do");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		ActitimeLogInPage f = new ActitimeLogInPage(driver);
		f.setActitimeUn();
		f.setActitimePwd();
		f.verifyLoginButton();
		
		Thread.sleep(2000);
		
		ActitimeHomePage g = new ActitimeHomePage(driver);
		g.verifyActitimeLogo();
		g.verifyActitimeLogout();
		
		driver.quit();

}
}
