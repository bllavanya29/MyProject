package BaseClass;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
	int i=1;

WebDriver driver;
	
	public LoginPage(WebDriver driver ) {
		this.driver=driver;
	    PageFactory.initElements(driver,this);
	}
		
	public void Login(String un,String pwd) throws InterruptedException, IOException {
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(un);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(pwd);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		Thread.sleep(2000);
		
		//Validation
		
		 // Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"TestCase Failed");
	   //	 System.out.println("successfully Login");
						
			  File Screenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			  FileHandler.copy(Screenshot,new File("D:\\Lavanya_SeleniumDemos\\OHRMScreenshot"+(i++)+".jpeg"));
			  System.out.println("screenshot captured");
	}	  
			
	public void Logout() {
		
		if(driver.getCurrentUrl().contains("dashboard")) {
			
			driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/i")).click();
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a")).click();
			System.out.println("Logout successfull");
		}
		
		
	}
}



	
	
	
	

