package pom_sabi_pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_objects_method
{

	WebDriver driver;

    By luserId = By.name("uid");

    By lpassword = By.name("password");

    By ltitleText =By.className("barone");

    By llogin = By.name("btnLogin");
    
    public LoginPage_objects_method(WebDriver driver)
    {

        this.driver = driver;
    }
    
    public void Loginpage_CommonMethod(String userName , String password)
    {
    	
    	
    	driver.findElement(luserId).sendKeys(userName);
    	driver.findElement(lpassword).sendKeys(password);
    	driver.findElement(llogin).click();	
    }
    
    public void Title()
    {
    	driver.findElement(ltitleText).getText();
    }

}
