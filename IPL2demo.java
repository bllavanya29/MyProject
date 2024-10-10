package day5;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IPL2demo {

	public static void main(String[] args) {
			
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get(" https://www.iplt20.com/points-table/men/2024");
			
		WebElement TeamHeader=driver.findElement(By.xpath("//table/tbody/tr/th[3]"));
		System.out.println(TeamHeader.getText());
		List<WebElement>Teams=driver.findElements(By.xpath("//tbody[@id='pointsdata']//tr//td[3]/div//h2"));
		
		for(int i=0;i<=Teams.size()-1;i++) {

     		System.out.println(Teams.get(i).getText());
		}
		
		List<WebElement> Ipl=driver.findElements(By.xpath("//*[@id=\"pointsdata\"]/tr[1]/td[12]/div/span"));
		System.out.println("out and notout memebers:"+" "+Ipl.size());
		
		int countN=0,countW=0,countL=0;
		for(int i=0;i<Ipl.size();i++) {
			
			if(Ipl.get(i).getText().equals("N")) {
				
				countN=countN+1;
		 		}
			
			else if(Ipl.get(i).getText().equals("W")) {
				countW++;
				}
			else {
				countL++;
			}
}
		System.out.println("No.of Ns"+" "+countN);
		System.out.println("No.of Ws:"+" "+countW);
		System.out.println("No.of Ls:"+" "+countL);
	//2nd row
		
	List<WebElement> secrow=driver.findElements(By.xpath("//*[@id=\"pointsdata\"]/tr[3]/td[12]/div/span"));
	System.out.println("second row memebers:"+" "+secrow.size());	
	
	int countn=0,countw=0,countl=0;
	for(int i=0;i<secrow.size();i++) {
		
	if(secrow.get(i).getText().equals("N")) {
		
		countn=countn+1;
 		}
	
	else if(secrow.get(i).getText().equals("W")) {
		countw++;
		}
	else {
		countl++;
	}
}
System.out.println("No.of Ns"+" "+countn);
System.out.println("No.of Ws:"+" "+countw);
System.out.println("No.of Ls:"+" "+countl);
		
		
	}

}
