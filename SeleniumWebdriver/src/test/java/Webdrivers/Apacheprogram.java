package Webdrivers;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Apacheprogram {
  @Test
public void f() throws IOException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
		File file=new File("C:\\Users\\Deepa\\Desktop\\Assignments\\Pooja.xlsx");
		
		
		FileInputStream fis= new FileInputStream(file);
		XSSFWorkbook Workbook =new XSSFWorkbook(fis);
		XSSFSheet sheet = Workbook.getSheetAt(0);
		//String cellvalue=sheet.getRow(0).getCell(0).getStringCellValue();
		//System.out.println(cellvalue);
		
		int rowCount=sheet.getPhysicalNumberOfRows();
		for(int i=0; i<rowCount; i++)
		{
			XSSFRow row=sheet.getRow(i);
			
		}
		Workbook.close();
		
  }
		
		
		
		
		
		
	
		
		
		
	
  }


  

