package Webdrivers;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertModule3 {
 
	 @Test
	  public void script1() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
			WebDriver d1;

			d1=new ChromeDriver();
			
			d1.get("http://demo.automationtesting.in/Alerts.html");
		WebElement Element=	d1.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a"));
			Thread.sleep(5000);
		
		
			((JavascriptExecutor)d1).executeScript("arguments[0].click()",Element);
			d1.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
			
			Thread.sleep(5000);
			Alert promptAlert=d1.switchTo().alert();
			String alertText=promptAlert.getText();
			System.out.print("Alert text is"+ alertText);
			Thread.sleep(5000);
			promptAlert.sendKeys("pooja");
			promptAlert.accept();
			Thread.sleep(5000);
			
			

			
			
			
	}
	}


