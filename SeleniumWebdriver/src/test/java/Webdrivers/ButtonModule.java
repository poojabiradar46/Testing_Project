package Webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ButtonModule {
	
	@Test
	
	public void script1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver d1;

		d1=new ChromeDriver();
		
		d1.get("http://www.leafground.com/");
		d1.findElement(By.cssSelector("img[alt='Buttons']")).click();
		Thread.sleep(5000);
		
		d1.findElement(By.xpath("//button[@id='home']")).click();
		
		d1.close();
		
		

}
}
