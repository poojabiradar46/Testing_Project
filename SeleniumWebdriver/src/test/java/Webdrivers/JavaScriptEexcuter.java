package Webdrivers;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavaScriptEexcuter {
  @Test
  public void f() {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d1;

		d1=new ChromeDriver();
		d1.get("http://demo.automationtesting.in/Datepicker.html");
		JavascriptExecutor jse=(JavascriptExecutor) d1;
		jse.executeScript("document.getElementById('datepicker1').value='29/08/2021'");
  }
}
