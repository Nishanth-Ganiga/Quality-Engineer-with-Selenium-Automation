//Add required imports
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement; 


public class AbsoluteXpathLocator  //DO NOT Change the class Name
{
	public WebDriver createDriver()
	{
	   
	   //Implement code to create Driver from DriverSetup and return it
	   return DriverSetup.getWebDriver();
	}
	public WebElement getAbsoluteXpathLocator(WebDriver driver)//DO NOT change the method signature
	{
	   
	   
    /*Replace this comment by the code statement to get the Web element of logo */
	   /*Find and return the element */ 
	   return driver.findElement(By.xpath("/html/body/form/div[1]/img"));
       
	}
	public String getName(WebElement element)    //DO NOT change the method signature
	{
	    
	    //Get the attribute value from the element and return it
	    return element.getAttribute("src");
	}

    public static void main(String[] args){
	    AbsoluteXpathLocator pl=new AbsoluteXpathLocator();
	    
	   //Add required code    
	   WebDriver driver=pl.createDriver();
	WebElement element=pl.getAbsoluteXpathLocator(driver);
	System.out.println("The WebElement is "+ element);
	
	System.out.println("The name is "+pl.getName(element));
	driver.close();
	   
	}

}

