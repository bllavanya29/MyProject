package POM;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class EnterInsurantData {
WebDriver driver;


public EnterInsurantData(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
@FindBy (id = "firstname") WebElement firstName ;
@FindBy (id = "lastname") WebElement lastName ;
@FindBy (id = "birthdate") WebElement dateOfBirth;
@FindBy (xpath = "//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[2]/span") WebElement genderFemale;
@FindBy (xpath = "//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span") WebElement genderMale ;
@FindBy (id = "streetaddress") WebElement streetAddress ;
@FindBy (id = "country") WebElement country ;
@FindBy (id = "zipcode") WebElement zipCode;
@FindBy (id = "city") WebElement city ;
@FindBy (id = "occupation") WebElement occupation;
@FindBy (xpath = "//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span") WebElement hobbiesSpeeding;
@FindBy (xpath = "//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[2]/span") WebElement hobbiesBungeeJumping;
@FindBy (xpath = "//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[3]/span") WebElement hobbiesCliffDiving;
@FindBy (xpath = "//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[4]/span") WebElement hobbiesSkyDiving;
@FindBy (xpath = "//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[5]/span") WebElement hobbiesOther;
@FindBy (id = "website") WebElement website ;
@FindBy (id = "open") WebElement pictureOpen;
@FindBy (id = "nextenterproductdata") WebElement nextProductData;

public void firstName(String fn) {
	firstName.sendKeys(fn);
}
public void lastName(String ln) {
	lastName.sendKeys(ln);
}

public void dateOfBirth(String db) {
	dateOfBirth.sendKeys(db);
}
public void genderMale() {
	genderMale.click();
}

public void generFemale() {
	genderFemale.click();
}
public void streetAddress(String ad) {
	streetAddress.sendKeys(ad);
}
public void country(String selectCountry ) {
new Select(country).selectByVisibleText(selectCountry);
}
public void zipCode(String zc) {
	zipCode.sendKeys(zc);
}
public void city(String ct) {
	city.sendKeys(ct);
}
public void occupation(String selectOccupation) {
	new Select(occupation).selectByVisibleText(selectOccupation);;
}
public void speeding() {
	hobbiesSpeeding.click();
}
public void bungeeJumping() {
	hobbiesBungeeJumping.click();
}
public void cliffDiving() {
	hobbiesCliffDiving.click();
}
public void skyDiving() {
	hobbiesSkyDiving.click();
}
public void other() {
	hobbiesOther.click();
}
public void website(String ws) {
	website.sendKeys(ws);
}
public void picture() throws AWTException, InterruptedException {
	pictureOpen.click();
	
}
public void nextProductdata() {
	nextProductData.click();
}
}
