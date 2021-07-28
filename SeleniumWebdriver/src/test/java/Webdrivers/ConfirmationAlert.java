package Webdrivers;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ConfirmationAlert {
  @Test
  
	  
	  public void script1() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
			WebDriver d1;

			d1=new ChromeDriver();
			
			d1.get("http://www.leafground.com/pages/Alert.html");
			d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button")).click();
			Alert a=d1.switchTo().alert();
			String Text=a.getText();
			System.out.print(Text);
			
			a.accept();
  }
}
