package BaseClass;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportTest extends AdminPage implements ITestListener {
	
	public ExtentSparkReporter sparkReporter;//About Report-name.doc.title,Theme
	public ExtentReports extent;//attach spark report and sys.details-comp.name,os,browser,Tester name
	public ExtentTest test;//ITestResult(class) result is assigned to test and print in test.log
	
	public void onStart(ITestContext context) {

    sparkReporter = new ExtentSparkReporter("D:\\My New Report.html");	
    sparkReporter.config().setDocumentTitle("MyFirstReort");
    sparkReporter.config().setReportName("Functional Testing");
	sparkReporter.config().setTheme(Theme.DARK);
	
	extent = new ExtentReports();
	extent.attachReporter(sparkReporter);
	
	extent.setSystemInfo("computer Name","localhost");
	extent.setSystemInfo("Environment","QA");
	extent.setSystemInfo("TesterName","Lavanya");
	extent.setSystemInfo("os","windows10");
	extent.setSystemInfo("BrowserName","Chrome"); 
		
	System.out.println("after starting Execution only once it is exceuted");
	}

	@Test	   
    public void onTestSuccess(ITestResult result)
{
	
    test = extent.createTest(result.getName());
    test.log(Status.PASS,"TC Pass:"+result.getName());

}

 public void onTestFailure(ITestResult result)
   {
	  test=extent.createTest(result.getName());
	  test.log(Status.FAIL,"TC FAIL:"+result.getName());

   }

 public void onTestSkipped(ITestResult result)
  {
	 test=extent.createTest(result.getName());
	 test.log(Status.SKIP,"TC Skipped:"+result.getName());
  }

  public void onFinish(ITestResult result)
  {
  
    extent.flush();
  }

 }





	
	




