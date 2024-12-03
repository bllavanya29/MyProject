package BaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AdminPage {
	
	WebDriver driver;
	LoginPage lp;
		
		@BeforeTest
		public void setUp() {
			
			driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			lp = new LoginPage(driver);
		}
		
		@Test(dataProvider="excelData")
		public void userDetails(String un,String pwd) throws InterruptedException, IOException {
			
			lp.Login(un,pwd);
			lp.Logout();
		
		}
		
		@DataProvider()
		public Object[][] excelData() {	
			return new Object[][] {
				
				new Object[] {"Admin","admin123"},
				new Object[] {"Rama","Rama123"},
				new Object[] {"Admin","admin123"},
				new Object[] {"Krishna","Krishna123"},
				new Object[] {"SaiRam","SaiRam123"},			
		};
		}
		
		@AfterTest
		public void tearDown() {
			driver.close();
		}
		
		
	}

	

