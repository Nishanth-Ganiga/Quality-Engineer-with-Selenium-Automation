import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Registration 
{
	static WebDriver driver;
	static String baseUrl = "http://webapps.tekstac.com/Shopify/"; 
	
	public WebDriver setupDriver()
	{
	    //Assign the value for baseUrl
	    /* Get the driver, and launch the app using get() with baseUrl */
	    driver = DriverSetup.getWebDriver();
        driver.get(baseUrl);
        return driver;
	    
	}
	
	public void setElements()
	{
	    /*Using the driver, Find the elements by id and send the values to the elements*/
	    driver.findElement(By.id("firstname")).sendKeys("Mithali");
	    driver.findElement(By.id("lastname")).sendKeys("Raj");
	    driver.findElement(By.id("username")).sendKeys("Mithali Raj");
	    Select cityDropdown = new Select(driver.findElement(By.id("selectcity")));
        cityDropdown.selectByValue("mas");
        driver.findElement(By.cssSelector("input[value='female']")).click();
        driver.findElement(By.id("pass")).sendKeys("MR@123");
        driver.findElement(By.id("reg")).click();
	   
	}
	
	 public void registerUser()
    {
        
        driver.findElement(By.id("reg")).click();
    }
	
	public static void main(String[] args)
	{
	    Registration reg=new Registration();
	    //Implement Code Here
	    reg.setupDriver(); 
        reg.setElements(); 
        reg.registerUser(); 
	    
	}

}

