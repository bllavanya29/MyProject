package POM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class AllTests {
	WebDriver driver;
	EnterVehicleData ed;
	EnterInsurantData en;
	EnterProductData ep;
	SelectPriceOptions sp;
	SendQuote sq;
	
@Test(dataProvider = "automobileData", priority = 1)
  public void AutomobileTests   
  (String expPrice, String expCalim, String expDis, String expCover,String type) throws AWTException, InterruptedException {
    
	  driver.findElement(By.linkText("Automobile")).click();
	  
 ed.make("Audi");
 ed.enginePerformance("1000");
 ed.dateOfManufacture();
 ed.numberOfSeats("2");
 ed.fuelType("Petrol");
 ed.listPrice("1000");
 ed.licensePlateNumber("0422");
 ed.annualMileage("1000");
 ed.nextInsurantdata();
 
 en.firstName("Ruksar");
 en.lastName("shaik");
 en.dateOfBirth("04/27/1997");
 en.generFemale();
 en.streetAddress("Jp nagar");
 en.country("India");
 en.zipCode("0404");
 en.city("Banglore");
 en.occupation("Employee");
 en.skyDiving();
 en.website("sampleapp.com");
 //en.picture();
 /*Robot rbt = new Robot();
	for (int i =1;i<=8;i++) {
		Thread.sleep(1000);
		rbt.keyPress(KeyEvent.VK_TAB);
	}
	 rbt.keyPress(KeyEvent.VK_DOWN);
	 rbt.keyPress(KeyEvent.VK_ENTER);
	 rbt.keyPress(KeyEvent.VK_TAB);
	 rbt.keyPress(KeyEvent.VK_DOWN);
	 rbt.keyPress(KeyEvent.VK_ENTER);*/
 en.nextProductdata();
 
 ep.startDate();
 ep.insuranceSum("3.000.000,00");
 ep.meritRating("Bonus 2");
 ep.damageInsurance("No Coverage");
 ep.euroProtection();
 //ep.leglDefenseInsurance();
 ep.courtesyCar("No");
 ep.nextSelectPrice();
 
sp.checkPricOptions(expPrice, expCalim, expDis, expCover, type);
 Thread.sleep(2000);
sp.nextSendQuote();
 sq.email("ruksar@gmail.com");
 sq.phone("8956231478");
 sq.userName("ruksar");
 sq.password("Ruksar123");
 sq.confirmPassword("Ruksar123");
 sq.comments("NA");
 sq.send();
 //Thread.sleep(2000);
 sq.message();
 //Thread.sleep(2000);
 sq.messageOk();
 //Thread.sleep(1000);
 sq.mainPage();
 
  }

  @DataProvider
  public Object[][] automobileData() {
    return new Object[][] {
      new Object[] { "226.00", "No", "No", "No", "Silver"},
      new Object[] { "667.00", "Submit" ,"2", "Limited", "Gold"},
      new Object[] { "1,310.00", "Submit" ,"5", "Limited", "Platinum"},
      new Object[] { "2,496.00", "Submit" ,"10", "Unlimited", "Ultimate"}
    };
  }
  
@Test(dataProvider = "truckData", priority = 2)
  public void truckTests   
  (String expPrice, String expCalim, String expDis, String expCover,String type) throws AWTException, InterruptedException {

	  driver.findElement(By.linkText("Truck")).click();
 ed.make("Audi");
 ed.enginePerformance("1000");
 ed.dateOfManufacture();
 ed.numberOfSeats("2");
 ed.fuelType("Petrol");
 ed.payLoad("1000");
 ed.toatalWeight("1000");
 ed.listPrice("1000");
 ed.licensePlateNumber("0422");
 ed.annualMileage("1000");
 ed.nextInsurantdata();
 
 en.firstName("Ruksar");
 en.lastName("shaik");
 en.dateOfBirth("04/27/1997");
 en.generFemale();
 en.streetAddress("Jp nagar");
 en.country("India");
 en.zipCode("0404");
 en.city("Banglore");
 en.occupation("Employee");
 en.skyDiving();
 en.website("sampleapp.com");
 //en.picture();
 en.nextProductdata();
 
 ep.startDate();
 ep.insuranceSum("3.000.000,00");
 ep.damageInsurance("No Coverage");
ep.euroProtection();
 //ep.leglDefenseInsurance();
 ep.nextSelectPrice();
 
sp.checkPricOptions(expPrice, expCalim, expDis, expCover, type);
 sp.nextSendQuote();
 sq.email("ruksar@gmail.com");
 sq.phone("8956231478");
 sq.userName("ruksar");
 sq.password("Ruksar123");
 sq.confirmPassword("Ruksar123");
 sq.comments("NA");
 sq.send();
 sq.message();
 sq.messageOk();
 sq.mainPage();
 
  }

  @DataProvider
  public Object[][] truckData() {
    return new Object[][] {
      new Object[] { "274.00", "No", "No", "No", "Silver"},
      new Object[] { "807.00", "Submit" ,"2", "Limited", "Gold"},
      new Object[] { "1,584.00", "Submit" ,"5", "Limited", "Platinum"},
      new Object[] { "3,018.00", "Submit" ,"10", "Unlimited", "Ultimate"}
    };
  }
  
 @Test(dataProvider = "MotorcycleData", priority = 3)
  public void MotorcycleTests   
  (String expPrice, String expCalim, String expDis, String expCover,String type) throws AWTException, InterruptedException {

	  driver.findElement(By.linkText("Motorcycle")).click();
	  
 
 ed.make("Audi");
 ed.model("Scooter");
 ed.cylinderCapacity("1000");
 ed.enginePerformance("1000");
 ed.dateOfManufacture();
 ed.numberOfSeatsMotorCycle("2");
 ed.listPrice("1000");
 ed.annualMileage("1000");
 ed.nextInsurantdata();
 
 en.firstName("Ruksar");
 en.lastName("shaik");
 en.dateOfBirth("04/27/1997");
 en.generFemale();
 en.streetAddress("Jp nagar");
 en.country("India");
 en.zipCode("0404");
 en.city("Banglore");
 en.occupation("Employee");
 en.cliffDiving();
 en.website("sampleapp.com");
 //en.picture();
 en.nextProductdata();
 
 ep.startDate();
 ep.insuranceSum("3.000.000,00");
 ep.damageInsurance("No Coverage");
 ep.euroProtection();
 ep.nextSelectPrice();
 
sp.checkPricOptions(expPrice, expCalim, expDis, expCover, type);
 sp.nextSendQuote();
 sq.email("ruksar@gmail.com");
 sq.phone("8956231478");
 sq.userName("ruksar");
 sq.password("Ruksar123");
 sq.confirmPassword("Ruksar123");
 sq.comments("NA");
 sq.send();
 sq.message();
 sq.messageOk();
 sq.mainPage();
 
  }

  @DataProvider
  public Object[][] MotorcycleData() {
    return new Object[][] {
      new Object[] { "234.00", "No", "No", "No", "Silver"},
      new Object[] { "690.00", "Submit" ,"2", "Limited", "Gold"},
      new Object[] { "1,355.00", "Submit" ,"5", "Limited", "Platinum"},
      new Object[] { "2,582.00", "Submit" ,"10", "Unlimited", "Ultimate"}
    };
  }
  
  @Test(dataProvider = "camperData", priority = 4)
  public void camperTests   
  (String expPrice, String expCalim, String expDis, String expCover,String type) throws AWTException, InterruptedException {

	  driver.findElement(By.linkText("Camper")).click();
	  
	  ed.make("Audi");
	  ed.enginePerformance("1000");
	  ed.dateOfManufacture();
	  ed.numberOfSeats("2");
	  ed.rightHandDriverYes();
	  ed.fuelType("Petrol");
	  ed.payLoad("1000");
	  ed.toatalWeight("1000");
	  ed.listPrice("1000");
	  ed.licensePlateNumber("0422");
	  ed.annualMileage("1000");
	  ed.nextInsurantdata();
 
 en.firstName("Ruksar");
 en.lastName("shaik");
 en.dateOfBirth("04/27/1997");
 en.generFemale();
 en.streetAddress("Jp nagar");
 en.country("India");
 en.zipCode("0404");
 en.city("Banglore");
 en.occupation("Employee");
 en.speeding();
 en.website("sampleapp.com");
 //en.picture();
 en.nextProductdata();
 
 ep.startDate();
 ep.insuranceSum("3.000.000,00");
 ep.damageInsurance("No Coverage");
 ep.euroProtection();
 ep.nextSelectPrice();
 
sp.checkPricOptions(expPrice, expCalim, expDis, expCover, type);
 sp.nextSendQuote();
 sq.email("ruksar@gmail.com");
 sq.phone("8956231478");
 sq.userName("ruksar");
 sq.password("Ruksar123");
 sq.confirmPassword("Ruksar123");
 sq.comments("NA");
 sq.send();
 sq.message();
 sq.messageOk();
 sq.mainPage();
 
  }

  @DataProvider
  public Object[][] camperData() {
    return new Object[][] {
      new Object[] { "256.00", "No", "No", "No", "Silver"},
      new Object[] { "755.00", "Submit" ,"2", "Limited", "Gold"},
      new Object[] { "1,483.00", "Submit" ,"5", "Limited", "Platinum"},
      new Object[] { "2,825.00", "Submit" ,"10", "Unlimited", "Ultimate"}
    };
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://sampleapp.tricentis.com/101/app.php");
	  
	  ed = new EnterVehicleData(driver);
	  en = new EnterInsurantData(driver);
	  ep = new EnterProductData(driver);
	  sp= new SelectPriceOptions(driver);
	  sq = new SendQuote(driver);
  }

  @AfterTest
  public void afterTest() {
	driver.close();
  }

}
