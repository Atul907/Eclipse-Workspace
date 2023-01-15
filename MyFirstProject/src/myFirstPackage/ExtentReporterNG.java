package myFirstPackage;

/*
*
*/
import java.io.File;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.xml.XmlSuite;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReporterNG implements IReporter {
   
	public static ExtentReports extent;

	public static ExtentReports extentReportGenerator () {
	
		String path = System.getProperty("user.dir") + "//Reports//index.html"  ;
		
		ExtentSparkReporter report = new  ExtentSparkReporter ();
		
		report.config().setReportName("CRM");
		
		report.config().setDocumentTitle("AccountCreate");
		
		report.config().setTheme(Theme.DARK);
		
		
		
		
//		extent = new ExtentReports () ;
//		
//		extent.attachReporter(report);
//		
//		extent.setSystemInfo("OS", "Windows");
//		
//		extent.setSystemInfo("Organization", "VCTC ChinchWad");
//		
//		extent.setSystemInfo("Tester", "Atul");
		
		return extent;
		
		
		
		
		
		
		
	}

}

