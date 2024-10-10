package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EnterProductData {
WebDriver driver;

	@FindBy (id = "startdate") WebElement startDate;
	@FindBy (id = "insurancesum") WebElement insuranceSum;
	@FindBy (id = "meritrating") WebElement meritRating ;        
	@FindBy (id = "damageinsurance") WebElement damageInsurance ;
	@FindBy (xpath = "//label[normalize-space()='Euro Protection']//span[@class='ideal-check']") WebElement optionalProductsEuroProtection ;
	@FindBy (xpath = "/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[4]/p/label[2]/span") WebElement optionalProductsLegalDefenseInsurance ;
	@FindBy (id = "courtesycar") WebElement courtesyCar ;
	@FindBy (id = "nextselectpriceoption") WebElement nextSelectPrice ;

	public EnterProductData(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void startDate() {
		startDate.sendKeys("11/10/2024");
	}
	public void insuranceSum(String selectInsurance) {
		new Select(insuranceSum).selectByVisibleText(selectInsurance);
	}
	public void meritRating(String selectMerit) {
		new Select(meritRating).selectByVisibleText(selectMerit);
	}
	public void damageInsurance(String selectDamage) {
		new Select(damageInsurance).selectByVisibleText(selectDamage);
	}
	public void euroProtection() {
		optionalProductsEuroProtection.click();
	}
	public void leglDefenseInsurance() {
		optionalProductsLegalDefenseInsurance.click();
	}
	public void courtesyCar(String selectCourtesy) {
		new Select(courtesyCar).selectByVisibleText(selectCourtesy);
	}
	public void nextSelectPrice() {
		nextSelectPrice.click();
	}
}
