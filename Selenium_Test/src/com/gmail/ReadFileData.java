package com.gmail;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.xml.internal.fastinfoset.sax.Properties;

public class ReadFileData {

	public static void main(String[] args) throws FileNotFoundException 
	{
		File obj = new File("E:\\Selenium eclipse workbench\\Selenium_Test\\src\\datafile.properties");
		
		FileInputStream fileInput = new FileInputStream(obj);
		
		try
		{
			fileInput = new FileInputStream(obj);
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		java.util.Properties prop = new java.util.Properties();
		
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get(prop.getProperty("URL"));
		
		System.out.println("URL ::" + prop.getProperty("URL"));
		System.out.println("User name::" +prop.getProperty("username"));
	    System.out.println("Password::" +prop.getProperty("password"));
		
		
		
		driver.findElement(By.id("Email")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("Passwd")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.id("SignIn")).click();
		
		
	
	}

}
