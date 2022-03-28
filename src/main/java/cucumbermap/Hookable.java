package cucumbermap;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hookable 
{

@Before
public void BeforeMethod(Scenario scenario)
{
		System.out.println("START");
}
	
@After	
public void AfterMethod(Scenario scenario)
{
	System.out.println("END");
}

	
	
	
	
	
}
