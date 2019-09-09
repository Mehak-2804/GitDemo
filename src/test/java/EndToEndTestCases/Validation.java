package EndToEndTestCases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Validation extends base {
	public static Logger log= LogManager.getLogger(Validation.class.getName());
	
  @BeforeTest
  public void initializingTest() throws IOException
  {
	  driver=initializedDriver();
	  log.info("browser is opened");
		driver.get(prop.getProperty("url"));
		log.info("Rediff website is accessible");
  }
  @Test
	public void Validation()
	{
			
	PageobjectHomePage hp = new PageobjectHomePage(driver);
	
	Assert.assertTrue(hp.getTitle().isDisplayed());
	log.info("text is successfully retrieved");
	
	}
	 	
	@AfterTest
	 public void tearDown()
	 {
		 driver.close();
		 driver=null;
	 }
	 
  
}









