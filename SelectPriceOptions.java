package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPriceOptions {
	WebDriver driver;
	@FindBy (id = "nextsendquote") WebElement nextSendQuote;
	
	public SelectPriceOptions(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void checkPricOptions(String expPrice, String expClaim, String expDis,String expCover, String type) {
		String actPrice, actClaim, actDis, actCover;

		switch(type) {
		case "Silver" : 
		System.out.println("\tSilver");
		actPrice= driver.findElement(By.id("selectsilver_price")).getText();

		if(expPrice.equals(actPrice)){
			System.out.println("Price Matching");}
		else {
			System.out.println("Price not Matching");}

       actClaim=driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[2]/td[2]")).getText();
		
		if(expClaim.equals(actClaim)) {
			System.out.println("Claim Matching");}
		else {
			System.out.println("Claim not Matching"); }
		
		actDis= driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[3]/td[2]")).getText();
		
		if(expDis.equals(actDis)) {
			System.out.println("Discount Matching"); }
		else {
			System.out.println("Discount not Matching"); }
		
		actCover= driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[4]/td[2]")).getText();
		
		if(expCover.equals(actCover)) {
			System.out.println("Cover matching");}
		else {
			System.out.println("Cover not Matching");}
			
		driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[1]/span")).click();
break;
		case "Gold": 
			System.out.println("\n\tGold");
			actPrice= driver.findElement(By.id("selectgold_price")).getText();
			
			if(expPrice.equals(actPrice)){
				System.out.println("Price Matching");}
			else {
				System.out.println("Price not Matching");}
			
			actClaim=driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[2]/td[3]")).getText();
			
			if(expClaim.equals(actClaim)) {
				System.out.println("Claim Matching");}
			else {
				System.out.println("Claim not Matching"); }
			
			
			actDis= driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[3]/td[3]")).getText();
			
			if(expDis.equals(actDis)) {
				System.out.println("Discount Matching"); }
			else {
				System.out.println("Discount not Matching"); }
			
			actCover= driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[4]/td[3]")).getText();
			
			if(expCover.equals(actCover)) {
				System.out.println("Cover matching");}
			else {
				System.out.println("Cover not Matching");}
				
			driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[2]/span")).click();
break;
		case "Platinum":
			System.out.println("\n\tPlatinum");
			actPrice= driver.findElement(By.id("selectplatinum_price")).getText();
			
			if(expPrice.equals(actPrice)){
				System.out.println("Price Matching");}
			else {
				System.out.println("Price not Matching");}
			
			actClaim=driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[2]/td[4]")).getText();
			
			if(expClaim.equals(actClaim)) {
				System.out.println("Claim Matching");}
			else {
				System.out.println("Claim not Matching"); }
			
			actDis= driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[3]/td[4]")).getText();
			
			if(expDis.equals(actDis)) {
				System.out.println("Discount Matching"); }
			else {
				System.out.println("Discount not Matching"); }
			
			actCover= driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[4]/td[4]")).getText();
			
			if(expCover.equals(actCover)) {
				System.out.println("Cover matching");}
			else {
				System.out.println("Cover not Matching");}
				
				driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[3]/span")).click();
				break;
				
		case "Ultimate":
			System.out.println("\n\tUltimate");
			actPrice= driver.findElement(By.id("selectultimate_price")).getText();
			
			if(expPrice.equals(actPrice)){
				System.out.println("Price Matching");}
			else {
				System.out.println("Price not Matching");}
			
			actClaim=driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[2]/td[5]")).getText();
			
			if(expClaim.equals(actClaim)) {
				System.out.println("Claim Matching");}
			else {
				System.out.println("Claim not Matching"); }
			
			
			actDis= driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[3]/td[5]")).getText();
			
			if(expDis.equals(actDis)) {
				System.out.println("Discount Matching"); }
			else {
				System.out.println("Discount not Matching"); }
			
			actCover= driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[4]/td[5]")).getText();
			
			if(expCover.equals(actCover)) {
				System.out.println("Cover matching");}
			else {
				System.out.println("Cover not Matching");}
				
				driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]/span")).click();
				
				
		}		
		}
	public void nextSendQuote() {
		nextSendQuote.click();
	}
	}

/*	//Select Price Options
	 System.out.println("Checking Automobile -> Silver Price Options");
	 String expPrice ="224.00" , actPrice, expClaim ="No" , actClaim, expDis ="No" , actDis, expCover="No", actCover;

	actPrice= driver.findElement(By.id("selectsilver_price")).getText();

	if(expPrice.equals(actPrice)){
		System.out.println("Price Matching");}
	else {
		System.out.println("Price not Matching");}

	actClaim=driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[2]/td[2]")).getText();

	if(expClaim.equals(actClaim)) {
		System.out.println("Claim Matching");}
	else {
		System.out.println("Claim not Matching"); }

	actDis= driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[3]/td[2]")).getText();

	if(expDis.equals(actDis)) {
		System.out.println("Discount Matching"); }
	else {
		System.out.println("Discount not Matching"); }

	actCover= driver.findElement(By.xpath("//*[@id=\"priceTable\"]/tbody/tr[4]/td[2]")).getText();

	if(expCover.equals(actCover)) {
		System.out.println("Cover matching");}
	else {
		System.out.println("Cover not Matching");}

}*/
