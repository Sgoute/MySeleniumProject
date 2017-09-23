package Selenium_Package;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.sun.jna.platform.FileUtils;

public class Capturescreenshot
{
	
	public static void Getscreenshot(WebDriver driver , String capturescren) 
	{
		  TakesScreenshot scrShot =((TakesScreenshot)driver);

	        //Call getScreenshotAs method to create image file

	                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	         //     FileUtils.  (SrcFile,"C:\\Users\\KRISHNA\\Desktop\\screenshot");
		
	}

}
