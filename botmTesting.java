package com.TestNGDemo3;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class botmTesting {
	
	WebDriver driver;
	
  @Test
  public void f() throws InterruptedException {
	
	 	  
	  driver.findElement(By.xpath("//input[@id='trial_fname']")).sendKeys("Shree");
	  driver.findElement(By.xpath("//input[@id='trial_lname']")).sendKeys("Ram");
	  driver.findElement(By.xpath("//input[@id='trial_company']")).sendKeys("SeleniumHub");
	  driver.findElement(By.xpath("//input[@id='trial_email']")).sendKeys("Mycompany.indiagovernment.com");
	  
	  JavascriptExecutor js = (JavascriptExecutor)driver;
	  js.executeScript("window.scrollBy(0,300)", " ");
	  
	  
	  driver.findElement(By.xpath("//*[@id=\"free_trial_form\"]/div[6]/div[3]/div[1]/span/span[1]/span/span[2]/b")).click();
	  Thread.sleep(1000);
	//  driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[39]")).sendKeys(Keys.ENTER);
	  
	  driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[39]")).click();
	  
	  //driver.findElement(By.xpath("//*[@id=\"free_trial_form\"]/div[6]/div[3]/div[1]/span/span[1]/span/span[2]")).sendKeys("IND +91");
	 //driver.findElement(By.xpath("//*[@id=\"free_trial_form\"]/div[6]/div[3]/div[1]/span/span[1]/span/span[2]")).sendKeys(Keys.ENTER);
	  

	  driver.findElement(By.xpath("//*[@id=\"trial_mobile\"]")).sendKeys("9764432478");
	  driver.findElement(By.xpath("//*[@id=\"free_trial_form\"]/div[7]/span/span[1]/span/span[2]/b")).click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[38]")).click();
	  driver.findElement(By.xpath("//*[@id=\"trial_city\"]")).sendKeys("Montreal");
	  driver.findElement(By.xpath("//*[@id=\"trial_message\"]")).sendKeys("I am Boss of the my company");
	  driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
	  		
	  		
  }
  @BeforeTest
  public void beforeTest() {
	    driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://www.botmtesting.com/a/p/free-trial");
		
  }

  @AfterTest
  public void afterTest() {
	  //driver.close();
  }

}
