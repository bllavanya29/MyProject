package com.TestNGDemo5;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Grid3 {
	WebDriver driver;
	@Parameters({"browser"})
	
	@Test
	public void browsers(String br) throws MalformedURLException {
	
	 if(br.toLowerCase().equals("chrome")) {
	 ChromeOptions opt= new ChromeOptions();
	 driver =new RemoteWebDriver(new URL("http://localhost:4444"),opt);
	 System.out.println("chrome driver enabled");
  }
	 else if(br.toLowerCase().equals("firefox")) {
		
		 FirefoxOptions opt= new  FirefoxOptions();
		 driver =new RemoteWebDriver(new URL("http://localhost:4444"),opt);
		 System.out.println("Firefox driver enabled");
  }
	
	 else if(br.toLowerCase().equals("Edge")){
	
		 EdgeOptions opt= new  EdgeOptions();
		 driver =new RemoteWebDriver(new URL("http://localhost:4444"),opt);
		 System.out.println("Firefox driver enabled");
	 }
	 
	 driver.get("https://www.amazon.com");
	 System.out.println("Parallel execution using Grid,Docker");
	 driver.quit();
	}	 
	 
}
