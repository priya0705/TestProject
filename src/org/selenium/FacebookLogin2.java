package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class FacebookLogin2 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Eclipse workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement user= driver.findElement(By.id("email"));
		user.sendKeys("Priya");
		
	 Actions a =new Actions(driver);
		a.doubleClick(user).perform();
		a.contextClick(user).perform();
		Thread.sleep(3000);
		
	 Robot r=new Robot();
		for(int i=1;i<=6;i++)
		{
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(1000);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	 WebElement pswd=driver.findElement(By.id("pass"));
	   a.click(pswd).perform();
	 
	   r.keyPress(KeyEvent.VK_CONTROL);
	   r.keyPress(KeyEvent.VK_V);
	   
	   r.keyRelease(KeyEvent.VK_CONTROL);
	   r.keyRelease(KeyEvent.VK_V);
		
		
	}

}
