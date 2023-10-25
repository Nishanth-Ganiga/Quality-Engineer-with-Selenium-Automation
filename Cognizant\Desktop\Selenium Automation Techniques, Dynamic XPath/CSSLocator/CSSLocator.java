//Add required imports
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CSSLocator     //DO NOT change the class name
{
	public WebDriver createDriver()  //DO NOT change the method signature
	{
	   //Implement code to create Driver from DriverSetup and return it
	   return DriverSetup.getWebDriver();
	}
	
	public WebElement getCSSLocator(WebDriver driver)  //DO NOT change the method signature
	{
	   /*Replace this comment by the code statement to get the Web element of username*/
	   /*Find and return the element */ 
	   return driver.findElement(By.cssSelector("input#username"));
       
	}
	
	public String getName(WebElement element)  //DO NOT change the method signature
	{
	    //Get the attribute value from the element and return it
	    return element.getAttribute("placeholder");
	}
	
    public static void main(String[] args){
	    CSSLocator pl=new CSSLocator();
	    //Add required code
	    WebDriver driver = pl.createDriver();
	    WebElement usernameElement = pl.getCSSLocator(driver);
	    String placeholderValue = pl.getName(usernameElement);
	    System.out.println("Placeholder Value: " + placeholderValue);
	    driver.quit();
	    
	}
}

