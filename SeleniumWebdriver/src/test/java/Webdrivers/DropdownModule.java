package Webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownModule {
  @Test
  
  
  public void script1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver d1;

		d1=new ChromeDriver();
		
		d1.get("http://www.leafground.com/pages/Dropdown.html");
		Select select1=new Select(d1.findElement(By.id("dropdown1")));
		select1.selectByVisibleText("Selenium");
		Thread.sleep(5000);
		Select select2=new Select(d1.findElement(By.name("dropdown2")));
		select2.selectByVisibleText("UFT/QTP");
		Thread.sleep(5000);
		Select select3=new Select(d1.findElement(By.name("dropdown3")));
		select3.selectByVisibleText("Loadrunner");
		Thread.sleep(5000);
		Select select4=new Select(d1.findElement(By.className("dropdown")));
		select4.selectByVisibleText("Loadrunner");
		
		d1.close();
		
		
 
  }
}
