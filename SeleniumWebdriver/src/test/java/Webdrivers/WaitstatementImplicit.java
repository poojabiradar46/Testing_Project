package Webdrivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WaitstatementImplicit {
  @Test
  
	  
	  public void Script() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 
		  
		  WebDriver d1;
			d1=new ChromeDriver();
			d1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			d1.get("https://demo.actitime.com/login.do");
			d1.findElement(By.id("username")).sendKeys("admin");
			d1.findElement(By.name("pwd")).sendKeys("manager");
			d1.findElement(By.id("loginButton")).click();
			d1.close();
			
  }
}
