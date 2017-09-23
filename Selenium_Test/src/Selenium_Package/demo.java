package Selenium_Package;

import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class demo
{
	@Test

	public void verifyTitle(){		

		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://www.naukri.com");		

		String Pagetitle =driver.getTitle();

		System.out.println(Pagetitle);	

		//Set<String> windowslist= driver.getWindowHandle();

		//System.out.println("Another Window-"+windowslist);		

	}


}
