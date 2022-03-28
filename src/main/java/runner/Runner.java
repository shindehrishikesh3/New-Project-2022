package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		           features="src/main/resources/BusinessLogic",
		           glue="cucumbermap",
		           tags="@SmokeTest"		        
		       )
      

public class Runner {

}
