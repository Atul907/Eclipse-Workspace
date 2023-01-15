package myFirstPackage;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.testBase.TestBase;

public class ListenerSetup extends TestBase implements ITestListener{

	
	ExtentReports 	extent = ExtentReporterNG.extentReportGenerator ();
	
	 ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
	
		 test = extent.createTest(result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		test.log(Status.PASS, "Test is pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
			test.fail(result.getThrowable());
	
   try {
			test.addScreenCaptureFromPath(ScreenShot.capturescreenshot(driver, result.getName() 
					+ System.currentTimeMillis() ) ,"ScreenShotAttached");
	} 
   catch (IOException e) 
   {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		

	}

	@Override
	public void onTestSkipped(ITestResult result) {
	
	
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
		
	}

	@Override
	public void onStart(ITestContext context) {

		
	}

	@Override
	public void onFinish(ITestContext context) {

		extent.flush();
	}

}
