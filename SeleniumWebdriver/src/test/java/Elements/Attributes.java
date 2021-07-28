package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Attributes {
  
  public static WebElement Emailid(WebDriver d1) {
	  return d1.findElement(By.id("email"));
  }
  public static WebElement password(WebDriver d1)
  {
	  return d1.findElement(By.id("pass"));
  }
  
  public static WebElement login_btn(WebDriver d1)
  {
	  return d1.findElement(By.name("login"));
  }
  
}
