package HomePage;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class HomePagePOB {
	
	WebDriver driver;
	
	   HomePagePOB(WebDriver driver){
			   this.driver=driver;		
			    PageFactory.initElements(driver,this);
	    }
	
	   //Login into OHRM
	  @Test
	public void Login() {
		
		   driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		   driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		   driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	  //HOMEPAGE
	  @Test
	  public void admin() {
		  
		List<WebElement> list  =  driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul//li"));
		System.out.println("List of elements in HomePage:"+" "+list.size());
		
		for(WebElement l:list) {
			System.out.println(l.getText());
		}
	  }
		
		//TEST CASE : 1
	  
	       	public void Adminbtn() throws IOException{
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
			//Utility.screenshot(driver);
			System.out.println("Admin Page clicked");
	}
	  	       
       //TEST CASE : 2
	  		public void userName() throws InterruptedException {
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys("Admin");
			//Search button
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")).click();
			Thread.sleep(10);
			//No.of Records
		    WebElement text=	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/span"));
		    System.out.println("userName:"+" "+text.getText());
		    driver.navigate().refresh();
		}
	  
	       //TEST CASE : 3
	  public void userRole() throws InterruptedException {
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[2]/i")).click();
		  driver.findElement(By.linkText("Admin")).click();
		  Thread.sleep(10);
		  //search
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  //Records
		  WebElement text=	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/span"));
		    System.out.println("userName:"+text.getText());
		    driver.navigate().refresh();
		  
	  }
	     //TESTCASE : 4
	  public void Status() {
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[2]/i")).click();
	      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div[2]/div[2]/span")).click();
	      //searching status
		  driver.findElement(By.xpath("//button[@type='submit']")).click();
		  //Records Found
		 WebElement noofrec= driver.findElement(By.xpath("//a[@class='oxd-brand']"));
		 System.out.println(noofrec.getText());
  
	  }
	  
	  public void logout() {
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/i")).click();
		  driver.findElement(By.xpath("//a[@class='oxd-brand']")).click();
		  
	  }
	
  }



	
	


