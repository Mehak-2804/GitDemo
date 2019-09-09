package EndToEndTestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class base {
	

	
  //here public use is to access the driver in other classes as well as globally
	public static WebDriver driver; 
	public static Properties prop;
  
   @Test
	public WebDriver initializedDriver() throws IOException
  
	{
		prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Mehak\\EndToEndFramework\\src\\main\\java\\EndToEndTestCases\\data.properties");
         prop.load(fis);
        String browserName= prop.getProperty("browser");
         
	if (browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mehak\\Desktop\\selenium\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	else
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mehak\\Desktop\\selenium\\chromedriver.exe");
		driver= new FirefoxDriver();
	}
	    driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	    return driver;
	}
   
   public void getScreenshot(String result) throws IOException
   {
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src, new File("C://Users//Mehak//Desktop//"+result+"screenshot.png"));
   }
   }
        

