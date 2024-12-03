package HomePage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import HomePage.HomePagePOB;

public class UserDetails {

	WebDriver driver;
	HomePagePOB hp;
	
	@BeforeTest
	public void setUp() {
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		hp = new HomePagePOB(driver); 
	}
	
	    @Test
		public void adminPage() throws InterruptedException, IOException {
		
		hp.Login();
		System.out.println("Login succesfully");
		hp.Adminbtn();
		System.out.println("HomePage");
		hp.userName();
		System.out.println("username Records found");
		hp.userRole();
		System.out.println("userrole enabled");
		hp.Status();
		System.out.println("status enabled");
		hp.logout();
		System.out.println("Logout successfully");
		
	}
		
		
	}



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

