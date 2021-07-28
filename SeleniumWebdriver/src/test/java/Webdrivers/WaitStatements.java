package Webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitStatements {
  @Test
  
	  
	  public void Script() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  WebDriver d1;
			d1=new ChromeDriver();
			d1.get("https://demo.actitime.com/login.do");
			d1.findElement(By.id("username")).sendKeys("admin");
			d1.findElement(By.name("pwd")).sendKeys("manager");
			d1.findElement(By.id("loginButton")).click();
			String eTitle="actiTime-Enter-Track";
			WebDriverWait wait= new WebDriverWait(d1,20);
			try
			{
				wait.until(ExpectedConditions.titleIs(eTitle));
				System.out.print("Pass");
				
				
			}
			catch(Exception e)
			{
				System.out.print("fail");
			}
		Thread.sleep(2000)	;
		d1.close();
  }
}
