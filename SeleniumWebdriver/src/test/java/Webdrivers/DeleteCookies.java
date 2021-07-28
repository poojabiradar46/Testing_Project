package Webdrivers;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeleteCookies {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d1;
		

		d1=new ChromeDriver();
		d1.navigate().to("http://flipkart.com/");
		d1.manage().deleteAllCookies();
		Set<Cookie> cookiesList = d1.manage().getCookies();
		for(Cookie getcookies:cookiesList) {
			System.out.println(getcookies);
		}
		
  }
}
