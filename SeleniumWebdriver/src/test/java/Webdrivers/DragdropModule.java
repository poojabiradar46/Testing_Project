package Webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragdropModule {
  @Test
  public void Script1() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://www.leafground.com/pages/drag.html");
		Thread.sleep(5000);
		
	
		Actions act=new Actions(d1);
		String XP="//*[@id=\"draggable\"]";
		WebElement drag=d1.findElement(By.xpath(XP));
		act.dragAndDropBy(drag,250,100).build().perform();
		Thread.sleep(5000);
		
		
		d1.close();
		
		
  }
  }

