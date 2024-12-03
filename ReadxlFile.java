package BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadxlFile {
	
	String path="D:\\Lavanya_SeleniumDemos\\excelData.xlsx";
	File file;
	FileInputStream fis ;
	XSSFWorkbook wb;
	XSSFSheet sh;
	XSSFRow row;
	
	
	@Test
	public void readData() throws IOException {
		
		String path="D:\\Lavanya_SeleniumDemos\\excelData.xlsx";
		File file;
		FileInputStream fis ;
		XSSFWorkbook wb;
		XSSFSheet sh;
		XSSFRow row;
	
		file = new File(path);
		fis = new FileInputStream(file);
		wb=new XSSFWorkbook(fis);
		sh=wb.getSheet("Sheet1");
		row=sh.getRow(0);
		
			
		int noofrows = sh.getPhysicalNumberOfRows();
		int noofcells = row.getPhysicalNumberOfCells();
		
		Object loginData[][] = new Object[noofrows][noofcells];
		
		for(int r=0;r<noofrows;r++) {
			for(int c=0;c<noofcells;c++) {
				
			   loginData[r][c]=sh.getRow(r).getCell(c).getStringCellValue();
				System.out.println(loginData[r][c]);
			}
			
		}
		
		
	}
	

}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


