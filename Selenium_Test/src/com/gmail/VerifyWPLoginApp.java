/**
 * 
 */
package com.gmail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.pages.LoginPage;

/**
 * @author KRISHNA
 *
 */
public class VerifyWPLoginApp 
{
	@Test
	public void Verifyvalidlogin() throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.get("http://demosite.center/wordpress/wp-admin/");
		driver.get(Logincrediantials.wpUrl);
		WordPressLocators wpLogin = new WordPressLocators(driver);
		
		wpLogin.WPApplicationLogin(Logincrediantials.userId, Logincrediantials.password);
		
		
		//loc.WordPress("admin", "demo123");
		//LoginPage login = new LoginPage(driver);
		//login.GmailLogin("saikrishna.goute@gmail.com", "Sai@@@2016");
		
		//LoginPage l= new LoginPage();
	}

}
