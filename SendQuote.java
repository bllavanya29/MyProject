package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SendQuote {
WebDriver driver;

@FindBy (id = "email") WebElement email ;
@FindBy (id = "phone") WebElement phone;
@FindBy (id = "username") WebElement username;
@FindBy (id = "password") WebElement password ;
@FindBy (id = "confirmpassword") WebElement confirmPassword ;
@FindBy (id = "Comments") WebElement comments ;
@FindBy (id = "sendemail") WebElement sendMail;

//message
@FindBy (xpath = "/html/body/div[4]/h2") WebElement message; 
@FindBy (xpath = "/html/body/div[4]/div[7]/div/button") WebElement ok;
@FindBy (xpath = "//*[@id=\"backmain\"]") WebElement mainPage;

public SendQuote(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

public void email(String em) {
	email.sendKeys(em);
}
public void phone(String ph) {
	phone.sendKeys(ph);
}
public void userName(String un) {
	username.sendKeys(un);
}
public void password(String ps) {
	password.sendKeys(ps);
}

public void confirmPassword(String cp) {
	confirmPassword.sendKeys(cp);
}
public void comments(String cm) {
comments.sendKeys(cm);
}
public void send() {
sendMail.click();
}
public void message() throws InterruptedException {
	Thread.sleep(1000);
System.out.println(message.getText());
}
public void messageOk() throws InterruptedException {
	Thread.sleep(1000);
ok.click();
}
public void mainPage() throws InterruptedException {
	Thread.sleep(1000);
	
mainPage.click();
}
public void tearDown() {
driver.close();
}

}
