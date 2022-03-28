package cucumbermap;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.SeleniumOperations;

public class Amazon 
{

	@Given("user launch the browser {string}")
	public void user_launch_the_browser(String string) 
	{
		Object[] input=new Object[1];
        input[0]="Edge";
        SeleniumOperations.LaunchBrowser(input);
	}

	@When("user open URL as {string}")
	public void user_open_url_as(String string) 
	{
		  Object[] input1=new Object[1];
	         input1[0]="https://www.amazon.in/";
	         SeleniumOperations.OpenURL(input1);
	}

	@When("user select {string} from dropdown")
	public void user_select_from_dropdown(String string) 
	{
		Object[] input2=new Object[1];
        input2[0]="Books";
        SeleniumOperations.DropDown(input2);
	}

	@When("user enter {string} in searchbox")
	public void user_enter_in_searchbox(String string) 
	{
		 Object[] input3=new Object[2];
         input3[0]="//*[@type='text']";
         input3[1]="Comics";
         SeleniumOperations.SendKeys(input3);
	}

	@When("user click on search")
	public void user_click_on_search() 
	{
		 Object[] input4=new Object[1];
         input4[0]="//*[@type='submit']";
         SeleniumOperations.Click(input4);
	}

	@Then("user can view the results")
	public void user_can_view_the_results() 
	{
		SeleniumOperations.Validation();
	}	
	
}
