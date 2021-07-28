package Webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TooltipModule2 {
  @Test
  public void script1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver d1;
		

		d1=new ChromeDriver();
		
		d1.get("https://sites.google.com/site/httpwwwseleniumhqorg/download");
String tooltip= d1.findElement(By.xpath("//*[@id=\"sites-canvas-main-content\"]/table/tbody/tr/td/div/div/div[1]/ul/li[4]/a")).getAttribute("title");
		
		System.out.print("Tooltip is ="+tooltip);
		Assert.assertEquals(tooltip,"Get Selenium");
		
	}
  }

