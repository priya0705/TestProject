package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse workspace\\selenium\\driver\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		  WebElement en=driver.findElement(By.id("enable-button"));
		  en.click();
		  WebDriverWait w=new WebDriverWait(driver,15);
		  w.until(ExpectedConditions.elementToBeClickable(By.id("disable")));
		 
		  
		  WebElement ds=driver.findElement(By.id("display-other-button"));
		  ds.click();
		  w.until(ExpectedConditions.elementToBeClickable(By.id("hidden")));
		  
		  
	}
}

