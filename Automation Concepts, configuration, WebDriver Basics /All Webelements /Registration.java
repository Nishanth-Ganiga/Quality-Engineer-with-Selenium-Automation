import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;


public class Registration    //DO NOT Change the class Name
{
	
	static String baseUrl = "http://webapps.tekstac.com/InvoiceUpdates/" ; //Assign the value for baseUrl
	
	public WebDriver createDriver()       //DO NOT change the method signature
	{
	   //Implement code to create Driver from DriverSetup and return it
	   //use getWebDriver method
	   return DriverSetup.getWebDriver();
	   
	   
	}
	
	public void navigate(WebDriver driver)   //DO NOT change the method signature
	{
	    // set the url to baseUrl and navigate ("http://webapps.tekstac.com/InvoiceUpdates/") 
	    driver.get(baseUrl);
	     
	}
	
	public Select getCategoryElement(WebDriver driver)  //DO NOT change the method signature
	{
	   /*Replace this comment by the code statement to get the driver*/
	   
	   /* Select Value "Utility Invoice" from 'Category' (drop-down) and return the select element  
             * Declare the drop-down element as an instance of the Select class. 
             * Return select object    */
             
             WebElement categoryDropdown = driver.findElement(By.tagName("select"));
             Select select = new Select(categoryDropdown);
             select.selectByValue("utility invoice");
             return select;
            
             
        
       
	}
	public void setFormValues(WebDriver driver)  //DO NOT change the method signature
	{
	    /*Using the driver, Find the elements by id and send the values to the elements */
      
      /*  Send 'Rakesh' for 'name'  
               '123' for 'number'
                'new user' for user type 
                'Utility Invoice' for select 
                '1000' for 'amount'
                '9876543210' for phone 
                'New User Invoice' for 'comments'
      */ 
      driver.findElement(By.id("name")).sendKeys("Rakesh");
        driver.findElement(By.id("number")).sendKeys("123");
        driver.findElement(By.id("newUser")).click(); 
        Select categoryDropdown = getCategoryElement(driver);
        categoryDropdown.selectByVisibleText("Utility Invoice");
        driver.findElement(By.name("amount")).sendKeys("1000");
        driver.findElement(By.name("num")).sendKeys("9876543210");
        driver.findElement(By.name("comments")).sendKeys("New User Invoice");
        driver.findElement(By.id("submit")).click();
      
        
      
    
	}
	
	public WebElement getSuccessMessageElement(WebDriver driver) //DO NOT change the method signature
	{
	    //Get the message element and return it
	    //After registration a success message is displayed. Identify and return the WebElement of the same. 
	   return driver.findElement(By.id("result"));
	  
	}

	public String getSuccessMessage(WebElement element)  //DO NOT change the method signature
	{
	    //Get the attribute value from the WebElement of success message displayed and return it. 
	     return element.getText();
	    
	    
	}

    public static void main(String[] args){
	    Registration reg=new Registration();
	    //Add required code
	    WebDriver driver = reg.createDriver();
        reg.navigate(driver);
        Select categoryDropdown = reg.getCategoryElement(driver);
        categoryDropdown.selectByValue("utility invoice");
        reg.setFormValues(driver);
        driver.findElement(By.id("submit")).click(); 
        WebElement successMessageElement = reg.getSuccessMessageElement(driver);
        String successMessage = reg.getSuccessMessage(successMessageElement);
        System.out.println("Success Message: " + successMessage);
        driver.quit();
	    
	    
	}
}

