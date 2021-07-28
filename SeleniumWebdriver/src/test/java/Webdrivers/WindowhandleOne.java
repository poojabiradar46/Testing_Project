package Webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowhandleOne {
  @Test
  public void Script() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver d1;
		d1=new ChromeDriver();
		d1.get("https://www.naukri.com/");
		d1.findElement(By.xpath("//div[@class='mTxt']")).click();
		
		Thread.sleep(3000);
		
		d1.quit();
		
  
  }
}
