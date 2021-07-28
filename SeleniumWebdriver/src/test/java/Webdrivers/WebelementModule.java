package Webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebelementModule {
  @Test
  
  
public void Script1() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver d1;
		d1=new ChromeDriver();
  d1.get("http://www.leafground.com/");
  WebElement ele1=d1.findElement(By.linkText("Edit"));
		  ele1.click();
	
	d1.findElement(By.id("email")).sendKeys("Poojab@gmail.com");
	d1.findElement(By.cssSelector("input[value='Append ']")).clear();
	
	d1.close();
  
  }  
  
  
}
