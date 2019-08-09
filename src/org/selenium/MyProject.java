package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyProject {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.turkishairlines.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Robot r=new Robot();
		WebElement ckie=driver.findElement(By.id("cookieWarningAcceptId"));
		ckie.click();
		WebElement from =driver.findElement(By.xpath("//input[@class='port-input scroll-mobile-to-parent-focus']"));
		from.click();
		from.sendKeys("Madu");
		
		//*r.keyPress(KeyEvent.VK_DOWN);
		//r.keyRelease(KeyEvent.VK_DOWN);
		//r.keyPress(KeyEvent.VK_ENTER);
		//r.keyRelease(KeyEvent.VK_ENTER);
		//Thread.sleep(2000);
		//WebElement to =driver.findElement(By.xpath("//div[@id='destinationSelector']"));
		//to.click();
		//Thread.sleep(2000);
		//WebElement des=driver.findElement(By.xpath("//input[@data-type='from_input']"));
		//des.click();
       // to.sendKeys("Coimbatore");
		//Thread.sleep(3000);
        driver.quit();
		
		
	}

}
