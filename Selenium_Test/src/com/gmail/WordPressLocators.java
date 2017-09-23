/**
 * 
 */
package com.gmail;

import java.sql.Driver;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.pages.LoginPage;

/**
 * @author KRISHNA
 *
 */
public class WordPressLocators {
	WebDriver driver;
	By lUsername = By.id("user_login");
	By lpassword = By.id("user_pass");
	

 public WordPressLocators(WebDriver idriver)
 {
	 this.driver = idriver;
 } 
	 public void WPApplicationLogin(String wpUserId ,String wpPassword) throws InterruptedException
	 {
		 
		 driver.findElement(lUsername).sendKeys(wpUserId);
		 driver.findElement(lpassword).sendKeys(wpPassword);
		
		 
		 Thread.sleep(5000);
	 }
	

}
