package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import EndToEndTestCases.PageobjectHomePage;
import EndToEndTestCases.PageobjectLoginPage;
import EndToEndTestCases.RediffWebsite;
import EndToEndTestCases.base;

@RunWith(Cucumber.class)

public class stepDefination extends RediffWebsite { 
		
		@Given("^Initialize the browser with Chrome$")
		public void initialize_the_browser_with_Chrome() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			driver=initializedDriver();
		}

		@Given("^Navigate to the \"([^\"]*)\" site$")
		public void navigate_to_the_site(String arg1) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			driver.get(arg1);
		}

		@Given("^Click on Login link to land on signin page$")
		public void click_on_Login_link_to_land_on_signin_page() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			PageobjectHomePage hp = new PageobjectHomePage(driver);
	    	hp.HomeSign().click();
	   
		}

		
		@When("^User enters (.+) and (.+) and logsin$")
	    public void user_enters_and_and_logsin(String username, String password) throws Throwable {
	        	PageobjectLoginPage lp = new PageobjectLoginPage(driver);
		    	lp.user().sendKeys(username);
		    	lp.passwd().sendKeys(password);
		    	lp.go().click();
		}

		@Then("^verify that user is successfully logged in$")
		public void verify_that_user_is_successfully_logged_in() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			 System.out.println(driver.getTitle());
			 driver.quit();
		}


}
