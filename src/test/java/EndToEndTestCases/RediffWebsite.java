package EndToEndTestCases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RediffWebsite extends base {
	
	public static Logger log= LogManager.getLogger(RediffWebsite.class.getName());
	
  @BeforeTest
  public void initializingTest() throws IOException
  {
	  driver=initializedDriver();
		driver.get(prop.getProperty("url"));
  }
	@Test(dataProvider="getData")
	
	public void HomePageLogin(String Username, String Password) throws IOException
	{
		
	
	PageobjectHomePage hp = new PageobjectHomePage(driver);
	
	Assert.assertTrue(hp.getTitle().isDisplayed());
	
	
	//System.out.println(hp.getTitle().getText());
	hp.HomeSign().click();
	PageobjectLoginPage lp = new PageobjectLoginPage(driver);
	lp.user().sendKeys(Username);
	lp.passwd().sendKeys(Password);
	lp.checkboxstatus().click();
	lp.go().click();	 //error - as giving sendkeys instead of click on Signin link
	log.info("test case completed");
		
}
	
	 @AfterTest
	 public void tearDown()
	 {
		 driver.close();
		 driver=null;
	 }
	 
	//Parameterized the data with help of TestNG (with DataProvider Annotation)
  
	 @DataProvider
	 public Object[][] getData()
	 {
		 //Row stands for how many different data types test should run
		 
		 // here we need to set an array
		 
		 Object[][] data = new Object[1][2];
           data[0][0]="abcde";
           data[0][1]="1234";
           return data;		 
	 }
// Assertions Concept	
	 
}









