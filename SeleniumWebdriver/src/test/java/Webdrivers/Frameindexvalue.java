package Webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frameindexvalue {
  @Test
  
  public void script1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver d1;

		d1=new ChromeDriver();
		
		d1.get("http://www.leafground.com/pages/frame.html");
		int size=d1.findElements(By.tagName("iframe")).size();
		System.out.println(+size);
		d1.close();	
 
}
}
