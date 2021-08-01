package Factory;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory
{
	public WebDriver driver;
	
	public WebDriver initDriver(String browserName, Properties prop)
	{
		 System.out.println("browsername = " + browserName);
		 
		 switch(browserName.toLowerCase())
		 {
		 case "chrome" :
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			 break;
		 case "firefox" :
			 WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
			 
		 default :
			 System.out.println("please pass the right browser Name and current browserName = " + browserName);
			 break;
		 }
		 driver.get(prop.getProperty("url"));
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 
		 return driver;
	}
}
