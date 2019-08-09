package org.selenium;


import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinHandlDemo {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver","D:\\Eclipse workspace\\selenium\\driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.hdfcbank.com/");
			WebElement popclose=driver.findElement(By.className("popupCloseButton"));
			popclose.click();
			Thread.sleep(2000);
			WebElement login=driver.findElement(By.id("loginsubmit"));
			login.click();
			Thread.sleep(3000);
			Set<String> s=driver.getWindowHandles();
		    List<String> l= new ArrayList<String>(s);
		    driver.switchTo().window(l.get(0));
		    Thread.sleep(3000);
		    driver.switchTo().window(l.get(1));
		    Thread.sleep(3000);
		    driver.switchTo().window(l.get(0));
		    Thread.sleep(3000);

	}

}
