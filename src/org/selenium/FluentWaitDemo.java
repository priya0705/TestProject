package org.selenium;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse workspace\\selenium\\driver\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		  WebElement en=driver.findElement(By.id("enable-button"));
		  en.click();
		  Wait<WebDriver> w=new FluentWait<WebDriver>(driver)
				            .withTimeout(30, TimeUnit.SECONDS)
				            .pollingEvery(10, TimeUnit.SECONDS)
				            .ignoring(NoSuchElementException.class);
		  w.until(ExpectedConditions.elementToBeClickable(By.id("disable")));
		  WebElement enable=driver.findElement(By.id("disable"));
		  enable.click(); 
	}

}
