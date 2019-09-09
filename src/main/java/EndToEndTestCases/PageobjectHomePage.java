package EndToEndTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageobjectHomePage {

	
	 public WebDriver driver;
	
	 public PageobjectHomePage(WebDriver driver)
	 {
			
		 this.driver=driver;
	 }
	 By Home=By.className("signin");
	 By title=By.className("bookicon");
	 
	public WebElement HomeSign()
	 {
		 return driver.findElement(Home);
	 }
	
	public WebElement getTitle()
	 {
		 return driver.findElement(title);
	 }
}
