import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PrintOptions {        //Do not change the class name

	WebElement element;
	static Select select;
	static WebDriver driver;
	List<WebElement>  size;
	
	public WebDriver setDriver(){
		/*Create the Webdriver. Assign to variable 'driver' and return it. */
		driver = DriverSetup.getDriver(); 
    return driver;
	}
	public String[] getOptions( ){
		/*Identify the Name dropdown
		     print all the drop down values using List
	         By using loop select the given Name */
		//Select ' city' drop down box ( Use Name locator to identify the element )
		
		//Get all the options for the selected drop down box
		// Setting up the loop to get all the options
		/* Storing the value of the option in a string array 
		    Declare a string array with the size of the drop down list. Ex: String[] resultList=new String[SIZE OF THE DROPDOWN LIST]  */
		// Printing the stored value
		//return the string array. 
		
		WebElement cityDropdown = driver.findElement(By.name("city"));
		Select select = new Select(cityDropdown);
        List<WebElement> options = select.getOptions();
        
        String[] resultList = new String[options.size()];

        for (int i = 0; i < options.size(); i++) {
        resultList[i] = options.get(i).getText();
        System.out.println(resultList[i]);
    }

    
    return resultList;

	}


   public void closeBrowser(){
	   //close browser
	   driver.quit();
   }


	public static void main(String[] args)
	{
		PrintOptions printOptions=new PrintOptions();
		//Add required code
		WebDriver driver = printOptions.setDriver();
		String[] cityOptions = printOptions.getOptions();
		printOptions.closeBrowser();
	}

}




