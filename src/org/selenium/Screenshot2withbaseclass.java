package org.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Screenshot2withbaseclass extends BaseClass {

	
	public static void main(String[] args) throws IOException {
	 
		getDriver("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		getScreenShot(driver, "examplepage");
		
		 WebElement cnfrm=driver.findElement(By.name("confirmation"));
		 getScreenShot(driver,"cnf.jpg");
		 cnfrmKey(cnfrm);
		 
	}

	
			
	}


