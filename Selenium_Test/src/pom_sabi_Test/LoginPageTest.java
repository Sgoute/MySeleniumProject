package pom_sabi_Test;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.gmail.Logincrediantials;

import pom_sabi_TestData.LoginDataFile;
import pom_sabi_pages.LoginPage_objects_method;
@Test
public class LoginPageTest 
{

WebDriver driver = new FirefoxDriver();

public void TestLoginAppliation()
{
	driver.get(LoginDataFile.guruUrl);
LoginPage_objects_method loginTest = new LoginPage_objects_method(driver);

loginTest.Loginpage_CommonMethod(LoginDataFile.guruId, LoginDataFile.gurupassword);
}
}
