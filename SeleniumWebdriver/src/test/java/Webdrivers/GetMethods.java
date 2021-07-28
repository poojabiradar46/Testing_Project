package Webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetMethods {
  @Test
  public void script() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  
	  WebDriver driver=new ChromeDriver();
	  
	  driver.get("https://en-gb.facebook.com/");
	  driver.findElement(By.id("email")).sendKeys("pooja");
		driver.findElement(By.name("pass")).sendKeys("pooja");
		
	  driver.getTitle();
	  driver.getCurrentUrl();
	  driver.getPageSource();
	  driver.navigate().to("http://www.leafground.com/");
	  
	 driver.close();
	  
	  
	  
  }
}
