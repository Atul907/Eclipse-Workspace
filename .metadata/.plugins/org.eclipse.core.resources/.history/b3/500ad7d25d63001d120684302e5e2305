package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage2 {
	
	public HomePage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@id='login2']")
	private WebElement login_lnk;
	
	@FindBy(xpath="//a[contains(text(),'Phones')]")
	private WebElement phone_lnk;
	
	@FindBy(xpath="//a[contains(text(),'Samsung galaxy s6')]")
	private WebElement samsung_galaxy_s6;
	
	@FindBy(xpath="//a[contains(text(),'Add to cart')]")
	private WebElement add_to_cart_btn;
	
	
	//----------------------------------------------------------------
	public void clickOnLoginLink()
	{
		login_lnk.click();
	}
	
	public void clickOnPhonesLink()
	{
		phone_lnk.click();
	}
	public void clickOnSamsungGalaxyS6()
	{
		samsung_galaxy_s6.click();
	}
	
	public void clickOnAddToCartButton()
	{
		add_to_cart_btn.click();
	}
	

}
