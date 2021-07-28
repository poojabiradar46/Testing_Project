package Webdrivers;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandling {
  @Test
  public void sript() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver d1;
		d1=new ChromeDriver();
		d1.get("http://www.leafground.com/pages/Window.html");
		d1.findElement(By.id("home")).click();
		Set<String> Window_value =d1.getWindowHandles();
		Iterator<String> iter= Window_value.iterator();
		String W1= iter.next();
		String w2=iter.next();
		d1.switchTo().window(w2);
		System.out.print(W1);
		System.out.print(w2);
	
		
		String title_child=d1.getTitle();
		System.out.print(title_child);
			
	d1.quit();
  }
}
