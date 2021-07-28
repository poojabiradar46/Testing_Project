package Webdrivers;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenshotAlert {
	
	
  @Test
  public void script1() throws InterruptedException, AWTException, IOException
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Deepa\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver d1;

		d1=new ChromeDriver();
		
		d1.get("http://www.leafground.com/pages/Alert.html");
		d1.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button")).click();
		Thread.sleep(5000);
		
		
		Robot robot1=new Robot();
		Dimension screen_size=Toolkit.getDefaultToolkit().getScreenSize();
		
		Rectangle rect1=new Rectangle(screen_size);
		BufferedImage Source=robot1.createScreenCapture(rect1);
		File destination=new File("C:\\Users\\Deepa\\Desktop\\Assignments\\screen1.jpg");
		ImageIO.write(Source, "jpg", destination);
		Alert a=d1.switchTo().alert();
		a.accept();
		
		}
}
