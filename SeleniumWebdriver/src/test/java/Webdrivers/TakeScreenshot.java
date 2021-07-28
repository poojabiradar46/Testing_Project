package Webdrivers;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class TakeScreenshot {
  @Test
  public void script() throws IOException {
	  
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver d1;
		d1=new ChromeDriver();
		d1.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		d1.get("http://demo.automationtesting.in/Selectable.html");
	
		d1.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		List<WebElement> ele1=d1.findElements(By.xpath("//ul[@class='SerializeFunc']/li"));
		int size_list=ele1.size();
		System.out.println(size_list);
		Actions act1=new Actions(d1);
		act1.keyDown(Keys.CONTROL)
		.click(ele1.get(0))
		.click(ele1.get(2))
		.click(ele1.get(4))
		.click(ele1.get(6))
		.build().perform();
		
		TakesScreenshot s1=(TakesScreenshot) d1;
		File Source = s1.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Deepa\\Desktop\\Assignments\\screen1.jpg");
		FileHandler.copy(Source, destination);
		
		
  }


	
}

