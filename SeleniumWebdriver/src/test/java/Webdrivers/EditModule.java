package Webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditModule {
  
  
		
		@Test
		
		public void script1()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
			
			d1=new ChromeDriver();
			
			d1.get("http://www.leafground.com/");
			d1.findElement(By.linkText("Edit")).click();
			d1.findElement(By.id("email")).sendKeys("Poojab@gmail.com");
			d1.findElement(By.cssSelector("input[value='Append ']")).clear();
			
			d1.findElement(By.cssSelector("input[value='Append ']")).sendKeys("pooja");
			d1.findElement(By.name("username")).clear();
			d1.findElement(By.name("username")).sendKeys("P");
			
			d1.findElement(By.xpath("//input[@name='username'][1]")).sendKeys("Clear");
			
			d1.close();
		}
	
			
			
			
  }

