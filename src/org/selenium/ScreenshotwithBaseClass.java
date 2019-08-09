package org.selenium;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ScreenshotwithBaseClass extends BaseClass{

	
	public static void main(String[] args) throws IOException {
		
		getDriver("https://www.facebook.com/");
		getScreenShot(driver," homepage");
		
		WebElement user=driver.findElement(By.id("email"));
		getScreenShot(driver," userpage");
		typeKey(user, "b.priya@gmail.com");
		
		WebElement password=driver.findElement(By.id("pass"));
		getScreenShot(driver," pswdpage");
		typeKey(password, "abc");
		
		WebElement login= driver.findElement(By.xpath("//input[@value='Log In']"));
		getScreenShot(driver," loginpage");
		loginKey(login);
		

	}

}
