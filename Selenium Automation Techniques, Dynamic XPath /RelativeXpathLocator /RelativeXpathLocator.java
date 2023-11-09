//Add required imports
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RelativeXpathLocator    //DO NOT Change the class Name
{
	public WebDriver createDriver()    //DO NOT change the method signature
	{
	   //Implement code to create Driver from DriverSetup and return it
	    return DriverSetup.getWebDriver();
	   
	}
	public WebElement getRelativeXpathLocator(WebDriver driver)//DO NOT change the method signature
	{
	   /*Replace this comment by the code statement to get the Web element */
	   /*Find and return the element */
	   WebElement element = driver.findElement(By.xpath("//td[contains(text(), 'SivaKumar')]"));
        return element;
       
	}
	public String getName(WebElement element)//DO NOT change the method signature
	{
	    //Get the attribute value from the element and return it
	    return element.getText();
	}

    public static void main(String[] args){
	    RelativeXpathLocator pl=new RelativeXpathLocator();
	    //Add required code
	    
	}
}

