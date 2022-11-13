package actiTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	//Declaration
	@FindBy(xpath ="//img[@height='61']")
	private WebElement logo;
	
	@FindBy(xpath = "//a[@id='logoutLink']")
	private WebElement logout;
	WebDriver driver;
	
	//Initialization
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Usage
	public void verifyActitimeLogo() {
	boolean res = logo.isDisplayed();
	
	if(res==true) {
	System.out.println("Test is Passed : " + res);
	}
	else {
	System.out.println("Test is Failed : " + res);
	}
	}
	public void verifyActitimeLogout() {
	logout.click();
}
}

	

