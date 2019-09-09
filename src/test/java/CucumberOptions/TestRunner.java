package CucumberOptions;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//feature
//@RunWith(Cucumber.class)
@CucumberOptions(  //CucumberOptions takes two inputs - path and package
		
		features="src/test/java/features",
		glue="stepDefinations") // parameter to define stepDefinations file - here we will provide the package name of stepdefinations, no need to provide entire path

public class TestRunner extends AbstractTestNGCucumberTests
{

}
      