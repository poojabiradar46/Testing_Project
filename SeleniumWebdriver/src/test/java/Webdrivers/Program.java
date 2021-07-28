package Webdrivers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Program {
  @Test
  public void Script() throws IOException   {
	  
	  
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
				  WebDriver d1;
					d1=new ChromeDriver();
					String file1=("C:\\Users\\Deepa\\Desktop\\Assignments\\write.xls");
					File f1=new File(file1);
					FileOutputStream fw1= new FileOutputStream(f1);
					XSSFWorkbook w1=new XSSFWorkbook();
					XSSFSheet s1=w1.createSheet("Selenium");
					Row r1=s1.createRow(5);
					org.apache.poi.ss.usermodel.Cell c1=r1.createCell(6);
					c1.setCellType(CellType.STRING);
					c1.setCellValue("karthika");
					w1.write(fw1);
	
  }
}
