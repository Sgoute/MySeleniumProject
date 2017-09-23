package Selenium_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class AssertTest {

	public static void main(String[] args) 
	{
	
	
		WebDriver driver= new FirefoxDriver();
		driver.navigate().to("http://google.com");
		Assert.assertEquals("Google99", driver.getTitle());

	}

}
