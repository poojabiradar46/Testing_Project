package Webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigatingMethods {
  @Test
  public void Script1() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		d1.get("https://en-gb.facebook.com/");
		d1.findElement(By.id("email")).sendKeys("pooja");
		d1.findElement(By.name("pass")).sendKeys("pooja");
		d1.navigate().back();
		d1.navigate().forward();
		d1.navigate().to("https://www.naukri.com/");
		d1.navigate().refresh();
	
		d1.quit();
		
		
		
  
  }
}