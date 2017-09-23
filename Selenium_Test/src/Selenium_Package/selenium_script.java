package Selenium_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class selenium_script {

	public static void main(String[] args)
	{
	
		WebDriver driver = new FirefoxDriver();
		String url ="https://www.facebook.com/";
		driver .get(url);
		String page =  driver.getCurrentUrl();
		System.out.println("current url is "+page);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='u_0_7']")).sendKeys("Test");
		driver.findElement(By.id("u_0_9")).sendKeys("Selenium");
		driver.findElement(By.xpath(".//*[@id='u_0_4']")).click();
		driver.findElement(By.id("u_0_p")).click();
		Select obj = new Select(driver.findElement(By.id("day")));
		obj.selectByIndex(3);
		//driver.quit();
			
		
	}

}
