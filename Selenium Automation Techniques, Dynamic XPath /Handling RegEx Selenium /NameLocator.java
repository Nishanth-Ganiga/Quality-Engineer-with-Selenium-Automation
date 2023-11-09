import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NameLocator {      //DO NOT change the class name
 
    public static String baseUrl = "http://webapps.tekstac.com/Handling_Regular_Expression/" ; 
    public static WebDriver driver;
	
	public WebDriver createDriver()
	{
	    //Create driver. Assign it to static variable 'driver' and return it
	    return DriverSetup.getWebDriver();
	    
	}
	
	public void navigate(WebDriver driver){
	     //Navigate to the baseUrl
	    driver.get(baseUrl);
	     
	}
	
   	public void setFormValues(WebDriver driver)
	{
	    //set the value for 'Shipment for user' and submit form
	    driver.findElement(By.id("userId")).clear(); 
	   driver.findElement(By.id("userId")).sendKeys("Shamili");
	   driver.findElement(By.id("track")).click();
	    
	}

    public WebElement getNameResultElement(WebDriver driver) {
        //Find the element of 'Shamili' and return it
        return driver.findElement(By.xpath("/html/body/div/table/tbody/tr[1]/td[2]")); 
        
        
    }
    public WebElement getShipmentResultElement(WebDriver driver) {
         //Find the element of 'SHIP1236' and return it
         return driver.findElement(By.id("shipment")); 
         
    }
    public WebElement getEmailResultElement(WebDriver driver) {
        
        //Find the element of 'shamili93@gamil.com' and return it
       return driver.findElement(By.xpath("//div[contains(@id,\"mail\")]"));
         
    }
    
    public boolean validateEmail(String eMailID) {
       //Validate email using regex. 
       return eMailID.matches("\\b[A-Z0-9a-z-]+@[a-z]+\\.[a-z]{2,4}\\b"); 
       
        
    }
    public boolean validateShipmentId(String shipmentId) {
        //Validate shipmentId using regex
        return shipmentId.matches("[A-Z0-9]{8}"); 
        
        
    }    
        
        
       
  
    public static void main(String[] args)
	{
	    NameLocator reg=new NameLocator();
	     //Add required code here
	     WebDriver driver=reg.createDriver();
	     reg.navigate(driver);
	     reg.setFormValues(driver);
	     WebElement element=reg.getEmailResultElement(driver);
	     
	     System.out.println(element.getText());
	     System.out.println(driver.findElement(By.id("shipment")).getText());
	     System.out.println(driver.findElement(By.id("e- mail")).getText());
	     
	     driver.close();
	     
	     
	}

  
}
