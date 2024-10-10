package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EnterVehicleData {

	WebDriver driver;

	@FindBy (id = "make") WebElement make;  
	@FindBy (id = "engineperformance") WebElement enginePerformance;
	@FindBy (id = "dateofmanufacture") WebElement dateOfManufacture ;
	@FindBy (id = "numberofseats") WebElement numberOfSeats;
	@FindBy (id ="numberofseatsmotorcycle") WebElement numberOfSeatsMotorCycle;
	@FindBy (id = "fuel") WebElement fuelType;
	@FindBy (id = "listprice") WebElement listPrice;
	@FindBy (id = "licenseplatenumber") WebElement licensePlateNumber ;
	@FindBy (id = "annualmileage") WebElement annualMileage ;
	@FindBy (id = "payload") WebElement payLoad;
	@FindBy (id = "totalweight") WebElement totalWeight;
	@FindBy (id = "model") WebElement model ;
	@FindBy (id = "cylindercapacity") WebElement cylinderCapacity ;
	@FindBy (xpath = "//*[@id=\"insurance-form\"]/div/section[1]/div[5]/p/label[1]/span") WebElement rightHandDriveYes;
	@FindBy (xpath = "//*[@id=\"insurance-form\"]/div/section[1]/div[5]/p/label[2]/span") WebElement rightHandDriveNo;
	@FindBy (id = "nextenterinsurantdata") WebElement nextEnterInsurantData;
	
	
	public EnterVehicleData(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void make(String selectMake) {
		
	new Select(make).selectByVisibleText(selectMake);
	}
	public void enginePerformance(String ep) {
enginePerformance.sendKeys(ep);
	}
	public void dateOfManufacture() {
		dateOfManufacture.sendKeys("10/03/2024");
	}
	public void numberOfSeats(String selectSeats) {
new Select(numberOfSeats).selectByVisibleText(selectSeats);
	}
	public void numberOfSeatsMotorCycle(String selectSeatsMotorC) {
		new Select(numberOfSeatsMotorCycle).selectByVisibleText(selectSeatsMotorC);
	}
	public void fuelType(String selectFuel) {
new Select(fuelType).selectByVisibleText(selectFuel);
	}

	public void listPrice(String lp) {
		listPrice.sendKeys(lp);
	}
	public void licensePlateNumber(String lp) {
		licensePlateNumber.sendKeys(lp);
	}
	public void annualMileage(String am) {
		annualMileage.sendKeys(am);
	}
	public void payLoad(String pl) {
		payLoad.sendKeys(pl);
	}
public void toatalWeight(String tw) {
		totalWeight.sendKeys(tw);
	}
public void model(String selectModel) {
	new Select(model).selectByVisibleText(selectModel);
}
public void cylinderCapacity(String cc) {
	cylinderCapacity.sendKeys(cc);
}
public void rightHandDriverYes() {
	rightHandDriveYes.click();
}
public void rightHandDriveNo() {
	rightHandDriveNo.click();
}

	public void nextInsurantdata() {
		driver.findElement(By.id("nextenterinsurantdata")).click();
	}
	
}
