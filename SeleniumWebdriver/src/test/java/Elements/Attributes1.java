package Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class Attributes1 {
  @FindBy(id="email")
  public static WebElement Emailid;
  
  
  @FindBy(id="pass")
  public static WebElement Password;
  
  @FindBy(name="login")
  public static WebElement Login_btn;
  
  }

