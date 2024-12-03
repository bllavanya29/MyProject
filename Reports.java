package BaseClass;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reports  {
	
	//    WebDriver driver;
	
	    ExtentSparkReporter htmlreport =  new ExtentSparkReporter("D:\\Lavanya_SeleniumDemos\\MyExtentReport.html")  ;
	    ExtentReports report = new ExtentReports();
	    ExtentTest test;
	    
	    @BeforeMethod
	    public void config() {
	    //html report configuration
	    htmlreport.config().setDocumentTitle("OrangeHRM Login Report");
	    htmlreport.config().setReportName("Functional Testing");
		htmlreport.config().setTheme(Theme.DARK);
	    
		//system info
		report.attachReporter(htmlreport);
		
		report.setSystemInfo("System name:","localhost");
		report.setSystemInfo("Tester name:","Lavanya");
		report.setSystemInfo("Environment:","QA");
		report.setSystemInfo("OS","windows11");
		report.setSystemInfo("Browser name","Chrome");
   }
  
	    @Test
	    public void Report() {
	    	  
	    //	Assert.assertTrue(driver.getCurrentUrl().contains("dashbord"),"Test case Fail");
	    	Assert.assertTrue(true);
	    	System.out.println("Test Case Pass");
	    	
	    	test = report.createTest("OHRM Login");
	       	test.log(Status.PASS, MarkupHelper.createLabel("OHRM Login:PASS",ExtentColor.GREEN));
	    	
	    	//if(driver.getCurrentUrl().contains("orangehrm"))
	    		System.out.println("Test case failed");
	    	
	    	test = report.createTest("OHRM Login");
	    	test.log(Status.FAIL, MarkupHelper.createLabel("OHRM Login:FAIL",ExtentColor.RED));
	 	    	
	    }
	    
	    @AfterTest
	    public void tearDown() {
	    	report.flush();
	    	//driver.close();
	    }
	

}
