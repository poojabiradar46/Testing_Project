package Webdrivers;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Downloadfile {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://www.leafground.com/pages/download.html");
		d1.findElement(By.linkText("Download Excel")).click();
		File f1=new File("C:\\Users\\Deepa\\Downloads");
		File[] var_files=f1.listFiles();
		for(File type_file : var_files)
		{
			if(type_file.getName().equalsIgnoreCase("testleaf.xlsx"))
			{
				System.out.print("file downloaded");
				
			}
		}
  }
}
