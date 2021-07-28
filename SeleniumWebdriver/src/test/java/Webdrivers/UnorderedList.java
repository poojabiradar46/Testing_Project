package Webdrivers;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class UnorderedList {
  @Test
  public void script1() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver d1;
		d1=new ChromeDriver();
		d1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d1.get("http://demo.automationtesting.in/AutoComplete.html");
		d1.findElement(By.id("searchbox")).sendKeys("A");
		List<WebElement> el1=d1.findElements(By.xpath("//ul[@id='ui-id-1']//li"));
		int size1=el1.size();
		System.out.print(size1);
		for(WebElement element_value:el1)
		{
			if(element_value.getText().equalsIgnoreCase("Afghanistan"))
			{
				element_value.click();
				break;
				
				
			}
		}
		
		
  }
}
