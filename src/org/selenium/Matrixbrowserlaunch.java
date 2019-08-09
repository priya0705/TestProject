package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Matrixbrowserlaunch {

	
		public static void main(String[] args) throws InterruptedException, AWTException {
			System.setProperty("webdriver.chrome.driver","D:\\Eclipse workspace\\selenium\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
			Thread.sleep(6000);
			
			WebElement search=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
			search.sendKeys("MatrixCare");
			
			Robot r=new Robot();
		
		    r.keyPress(KeyEvent.VK_ENTER);
		    r.keyRelease(KeyEvent.VK_ENTER);
		    
		    Set<String> w=driver.getWindowHandles();
	        List<String> l=new ArrayList<String>(w);
	        driver.switchTo().window(l.get(0));
	        Thread.sleep(2000);
	        driver.switchTo().window(l.get(1));
	        Thread.sleep(2000);
		    
		   
		    
		    
}
}