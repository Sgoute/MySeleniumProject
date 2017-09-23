package GitHubTest.GitHubTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


/**
 * Unit test for simple App.
 */
public class AppTest 
   
{
	WebDriver driver;
	  @Test
	  public void Home() 
	  {
		  driver.get("http://demo.guru99.com/selenium/guru99home/");  
			String title = driver.getTitle();				 
			Assert.assertTrue(title.contains("Demo Guru99 Page")); 
	  }
	  @BeforeTest
	  public void beforeTest()
	  {
		  driver = new FirefoxDriver();  
		  
	  }
}
