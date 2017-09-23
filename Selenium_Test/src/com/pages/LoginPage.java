/**
 * 
 */
package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author KRISHNA
 *
 */
public class LoginPage 
{
	WebDriver driver;
	
	By lusername = By.id("Email");
	By lnextbutton = By.id("next");
	By lpassword = By.xpath(".//*[@id='Passwd']");
	By llogbutton = By.xpath(".//*[@id='signIn']");
	
	public LoginPage(WebDriver idriver)
	{
		this.driver = idriver;
		
	}
	public void GmailLogin(String userName ,String password) throws InterruptedException
	{
		driver.findElement(lusername).sendKeys(userName);
		driver.findElement(lnextbutton).click();
		Thread.sleep(5000);
		
		driver.findElement(lpassword).sendKeys(password);	
		driver.findElement(llogbutton).click();
		Thread.sleep(5000);
		
		
	}
	

}
