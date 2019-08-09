package org.selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertprac {
	
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver", "D:\\Eclipse workspace\\selenium\\driver\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		 WebElement cnfrmAlrt=driver.findElement(By.name("confirmation"));
		 cnfrmAlrt.click();
		 Thread.sleep(3000);
		 driver.switchTo().alert().accept();
		 

}}
