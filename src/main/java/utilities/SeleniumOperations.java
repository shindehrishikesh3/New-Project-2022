package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumOperations 
{

public static WebDriver driver=null;	
public static Actions act=null;
public static void LaunchBrowser(Object[] inputparameters)
{
	String a=(String) inputparameters[0];
	
	if(a.equalsIgnoreCase("Chrome"))
	{
	System.setProperty("webdriver.chrome.driver", "E:\\2022\\Automation Support 1\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	}
	else if(a.equalsIgnoreCase("Edge"))
	{
	System.setProperty("webdriver.edge.driver", "E:\\2022\\Automation Support 1\\msedgedriver.exe");
	driver=new EdgeDriver();
	driver.manage().window().maximize();
	}
}

public static void OpenURL(Object[]inputparameters)
{
	String a=(String)inputparameters[0];
	driver.get(a);
}

public static void MoveToElement(Object[]inputparameters)
{
	String b=(String) inputparameters[0];
	WebElement a=driver.findElement(By.id(b));
	act.moveToElement(a).build().perform();
}
	
public static void DropDown(Object[]inputparameters)
{
	
	String b=(String)inputparameters[0];
	Select s=new Select(driver.findElement(By.id("searchDropdownBox")));
	s.selectByVisibleText(b);	
}
	
public static void SendKeys(Object[]inputparameters)
{
	String a=(String)inputparameters[0];
	String b=(String)inputparameters[1];
	
	driver.findElement(By.xpath(a)).sendKeys(b);
}

public static void Click(Object[]inputparameters)
{
	String a=(String)inputparameters[0];
	driver.findElement(By.xpath(a)).click();
}



public static void Validation()
{
	WebElement a=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]"));
	
	if(a.equals("Comics"))
	{
		System.out.println("pass");
	}else
	{
		System.out.println("fail");
	}
	
}
	
	
	
public static void main(String[] args) 
{
	
         Object[] input=new Object[1];
         input[0]="Edge";
         LaunchBrowser(input);
	
         Object[] input1=new Object[1];
         input1[0]="https://www.amazon.in/";
         OpenURL(input1);
	
         Object[] input2=new Object[1];
         input2[0]="Books";
         DropDown(input2);
	
         Object[] input3=new Object[2];
         input3[0]="//*[@type='text']";
         input3[1]="Comics";
         SendKeys(input3);
         
         Object[] input4=new Object[1];
         input4[0]="//*[@type='submit']";
         Click(input4);
	
         Validation();
             
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
}
