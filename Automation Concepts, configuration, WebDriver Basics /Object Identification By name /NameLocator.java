import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;


public class NameLocator 
{
	String fName;  
	static WebDriver driver;  
	
	public WebDriver setupDriver()
	{
	    /*Invoke the getWebDriver method from the DriverSetup File*/
	   driver = DriverSetup.getWebDriver();
        return driver;
	    
	   
	}
	public String getNameLocator()
	{
       /*Identify the Firstname
	     Get the placeholder value
         Store the placeholder value in the static variable fName.*/
         
         fName = driver.findElement(By.name("fname")).getAttribute("placeholder");
        return fName;
         
	}
	
	public static void main(String[] args)
	{
	    NameLocator namLocator=new NameLocator();
	    namLocator.setupDriver();
	    String name=namLocator.getNameLocator();
	    System.out.println("The name is "+name);
	          

	}

}

