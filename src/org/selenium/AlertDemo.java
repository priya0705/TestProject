package org.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","D:\\Eclipse workspace\\selenium\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		WebElement confirm=driver.findElement(By.name("confirmation"));
		confirm.click();
		Alert alt=driver.switchTo().alert();
		Thread.sleep(2000);
		alt.accept();
		Thread.sleep(3000);
		WebElement prompt=driver.findElement(By.name("prompt"));
		prompt.click();
	
		Alert palt=driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(palt.getText());
		palt.dismiss();
		Thread.sleep(3000);
		
		
	
		 
	}

}
