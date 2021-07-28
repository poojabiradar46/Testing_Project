package Webdrivers;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TooltipModule {
  @Test
  public void script1() throws InterruptedException, IOException
  
  
	{
	  
	  WebDriver d1;

		
	  FileInputStream f1=new FileInputStream("Config.Properties");
	  Properties prop=new Properties();
	  prop.load(f1);
	 String browser_name= prop.getProperty("browser");
	 String driver_path= prop.getProperty("path");
	 if(browser_name.equalsIgnoreCase("chrome"))
	 
		 {
		 System.setProperty("webdriver.chrome.driver", driver_path);
		 d1=new ChromeDriver();
		 }
	 
	 else if(browser_name.equalsIgnoreCase("firefox")) 
	 {
		 {
		 System.setProperty("webdriver.gecko.driver", driver_path);
		 d1=new FirefoxDriver();
	 }
	  
	d1.get("http://www.leafground.com/pages/tooltip.html");
	WebElement el1= d1.findElement(By.id("age"));
	String msg=el1.getAttribute("title");
	System.out.print(msg);
		
	
}

}
}

		