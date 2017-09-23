package Selenium_Package;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class WindowHandle {

	public static void main(String[] args) {
		int failedCount = 0;
		
		
		// TODO Auto-generated method stub
		WebDriver d= new FirefoxDriver();
		String pUrl="http://seleniumpractise.blogspot.in/";
		d.get(pUrl);
		String pageSource=d.getPageSource();
		System.out.println("Page sourece is : =>  " +pageSource);
		d.findElement(By.xpath("*//a[contains(@href,'http://www.google.com')]")).click();
		String parentWindow = d.getWindowHandle();
		System.out.println("parent window is "+parentWindow);
		Set<String> winCount = d.getWindowHandles();
		int count = winCount.size();
		System.out.println("number of windows are : "+count);
		
		//Capturescreenshot src = new Capturescreenshot();
		//src.Getscreenshot(d, "capturescren");
		
		Webtablehandling.webtable(22);
		for (String a : winCount)
		{
			if (!parentWindow.equalsIgnoreCase(a))
			{
				d.switchTo().window(a);
				d.findElement(By.name("q")).sendKeys("sabitha goute");
				
				failedCount++;
				
				
				
			}
			else 
			{
				System.out.println("failed");
					}
			 
		}
		
		if (failedCount>0)
		{
			
			
		}
		
		
	}

}
