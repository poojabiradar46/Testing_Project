package StepDefnition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.By;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefn {
	
	 WebDriver d1;
		@Given("Open chrome and url of the application")
		public void open_chrome_and_url_of_the_application()  {
			 
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
			  
				d1=new ChromeDriver();
			d1.get("https://www.facebook.com/");
		}
	@When("Enter Username and Password")
	public void enter_username_and_password() {
		d1.findElement(By.id("email")).sendKeys("user_name");
		d1.findElement(By.id("pass")).sendKeys("password");
		d1.findElement(By.name("login")).click();
		
	}

	 @Then("Login to account")
		public void login_to_account()
		{
			System.out.println("Login_to_account");
		
	}
	}



