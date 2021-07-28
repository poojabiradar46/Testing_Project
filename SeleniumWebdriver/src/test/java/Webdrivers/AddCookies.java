package Webdrivers;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddCookies {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d1;
		

		d1=new ChromeDriver();
		d1.get("https://www.flipkart.com/");
		d1.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Cookie cookie=new Cookie("customeCookie","12345");
		d1.manage().addCookie(cookie);
		Set<Cookie> cookies=d1.manage().getCookies();
		for(Cookie cook:cookies)
		{
			System.out.println(cook);
		}
		d1.close();
		
  }
}
