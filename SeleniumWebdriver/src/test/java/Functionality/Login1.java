package Functionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import Elements.Attributes1;

public class Login1 {
  @Test
  public void f1() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d1;

		d1=new ChromeDriver();
		d1.get("https://en-gb.facebook.com/");
		PageFactory.initElements(d1,Attributes1.class);
		Attributes1.Emailid.sendKeys("abcd");
		Attributes1.Password.sendKeys("abcd");
		Attributes1.Login_btn.click();
		
		
		
	  
  }
}
