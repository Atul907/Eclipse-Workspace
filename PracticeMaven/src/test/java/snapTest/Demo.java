package snapTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import snap.BaseClass;

public class Demo extends BaseClass{

	
	@Listeners(snap.ListenersClass.class)
	public class demo {
	@BeforeMethod
	public void setUp() {
	initialization();
	 
	}
	 
	@AfterMethod
	public void tearDown()
	{
	driver.quit();
	}
	 
	@Test
	public void takeScreenshotTest()
	{
	Assert.assertEquals(true, false);
	}
	}
}
