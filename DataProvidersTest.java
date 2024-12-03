package BaseClass;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvidersTest {
	
	File file;
	FileOutputStream fos ;
	String path="D:\\Lavanya_SeleniumDemos\\excelData.xlsx";
	XSSFWorkbook wb;
	XSSFSheet sh;
	int index=0;
	
//	@BeforeTest
	public void setUp() throws IOException {
		
		file = new File(path);
		fos=new FileOutputStream(file);
		wb= new XSSFWorkbook();
	    sh=wb.createSheet("Sheet1");
		
	}
	
	//@Test(dataProvider="excelData")
	public void data(String un,String pwd) {
		
		XSSFRow row = sh.createRow(index);
		XSSFCell cell=row.createCell(0);
		cell.setCellValue(un);
		cell=row.createCell(1);
		cell.setCellValue(pwd);
		index++;
		
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
	
	//@AfterTest
	public void tearDown() throws IOException {
		
		wb.write(fos);
		fos.close();
		wb.close();
	}

}

	
	
	
	
	
	
	
	
	
	
	
	
	
	


