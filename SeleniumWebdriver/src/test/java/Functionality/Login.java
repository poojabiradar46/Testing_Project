package Functionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Elements.Attributes;

public class Login {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d1;

		d1=new ChromeDriver();
		d1.get("https://en-gb.facebook.com/");
		
		Attributes.Emailid(d1).sendKeys("abcd");
		Attributes.password(d1).sendKeys("abcd");
		Attributes.login_btn(d1).click();
	  
  }
}
