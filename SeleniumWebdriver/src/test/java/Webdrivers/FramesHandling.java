package Webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;



public class FramesHandling {
  @Test
  public void Script1() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
		d1=new ChromeDriver();
		
		d1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS)	;
		
		d1.get("http://www.leafground.com/pages/frame.html");
           d1.switchTo().frame(0);
		
		d1.switchTo().defaultContent();
		
		d1.switchTo().frame(1);
		d1.switchTo().frame("frame2");
		d1.findElement(By.xpath("//*[@id=\"Click1\"]")).click();
		Thread.sleep(5000);
		d1.switchTo().defaultContent();
		int size=d1.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		
		d1.close();
		
  }
}

 