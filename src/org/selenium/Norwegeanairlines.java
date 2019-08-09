package org.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Norwegeanairlines {

	
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.norwegian.com/uk/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Robot r=new Robot();
		WebElement from=driver.findElement(By.id("airport-select-origin"));
		from.click();
		from.sendKeys("Manchester");
		for(int i=1;i<=2;i++){
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		WebElement to=driver.findElement(By.id("airport-select-destination"));
		to.sendKeys("Amster");
		to.click();
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		WebElement txt =driver.findElement(By.className("calendar__input"));
		txt.click();
		Thread.sleep(2000);
		WebElement fdate =driver.findElement(By.xpath("//span[text()='12']"));
		fdate.click();
		Thread.sleep(3000);
		WebElement tdate =driver.findElement(By.xpath("//span[text()='15']"));
		tdate.click();
		Thread.sleep(2000);
		WebElement srch=driver.findElement(By.id("searchButton"));
		srch.click();
		
		
	}


}
