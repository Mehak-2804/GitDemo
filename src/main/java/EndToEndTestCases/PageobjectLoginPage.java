package EndToEndTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageobjectLoginPage {

	public WebDriver driver;

	public PageobjectLoginPage(WebDriver driver) {

		this.driver = driver;
	}

	By username = By.id("login1");
	By Password = By.name("passwd");
	By checkbox = By.id("remember");
	By Go = By.name("proceed");

	public WebElement user() {
		return driver.findElement(username);
	}

	public WebElement passwd() {
		return driver.findElement(Password);
	}

	public WebElement checkboxstatus() {
		return driver.findElement(checkbox);
	}

	public WebElement go() {
		return driver.findElement(Go);
	}

}
