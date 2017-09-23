package pageObjectModel_BASE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBaseSetup 
{
	private WebDriver driver;
	static String driverPath = "E:\\downloads\\";

	public WebDriver getDriver()
	{
		return driver;
	}
	private void setDriver(String browserType, String appURL)
	{
		switch (browserType)
		{
		case "chrome":
			driver = initiateChromeDriver(appURL);
			break;
		case "firefox":
			driver = initFirefoxDriver(appURL);
			break;
		default:
			System.out.println("browser : " + browserType
					+ " is invalid, Launching Firefox as browser of choice..");
			driver = initFirefoxDriver(appURL);
		}
	}
	private WebDriver initFirefoxDriver(String appURL) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}
	private WebDriver initiateChromeDriver(String appURL) 
	{
		System.setProperty("webdriver.chrome.driver" , driverPath +"chrome.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}
	



}
