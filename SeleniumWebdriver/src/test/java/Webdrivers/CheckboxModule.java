package Webdrivers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

public class CheckboxModule {
	

@Test
	
	public void script1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
	
		WebDriver d1;
		

		d1=new ChromeDriver();
		d1.get("http://www.leafground.com/pages/checkbox.html");
		Thread.sleep(3000);
		d1.findElement(By.xpath("//input[@type='checkbox']")).click();
		Thread.sleep(5000);
		List<WebElement> AllCheckboxes= d1.findElements(By.xpath("//input[@type='checkbox']"));
		int size=AllCheckboxes.size();
		System.out.print(size);
		for(int i=0; i<size; i++)
		{
			AllCheckboxes.get(i).click();
		}
	
	d1.close();
			

}
}
