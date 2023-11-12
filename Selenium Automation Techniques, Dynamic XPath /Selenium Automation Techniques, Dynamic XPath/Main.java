import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Main { //Do not change the class name

	public static WebDriver driver;
	public static WebElement element;
	public static String alertMessage; // Store the alert error message in this variable

	public static WebDriver setDriver()	{
		// Create the driver using 'getDriver' method. Assign it to variable 'driver'
		// Return the variable driver
		driver = DriverSetup.getDriver();
		return driver;
	}

	public static void Name(String Name) throws Exception {
		// Method to locate text box Name by its Relative xpath (id) & pass the parameter as input
		element = driver.findElement(By.id("textname"));
		element.sendKeys(Name); 
		
	}

	public static void fatherName(String fatherName) throws Exception{
		// Method to locate text box FatherName by its Absolute xpath & pass the parameter as input
		element = driver.findElement(By.id("fatherName"));
		element.sendKeys(fatherName);
		
	}

	public static void postalAddress(String Address) throws Exception{
		// Method to locate text box PostalAddress by its cssSelector & pass the parameter as input
		element = driver.findElement(By.id("paddress")); 
		element.sendKeys(Address);
		
	}

	public static void personalAddress(String Address) throws Exception{ 
		// Method to locate text box PersonalAddress by its Relative xpath (id) & pass the parameter as input
		element = driver.findElement(By.id("personaladdress")); 
		element.sendKeys(Address);
		
	}

	public static void gender() throws Exception{ 
		// Method to locate radio button "Male" by its Relative xpath (name) & select it
		element = driver.findElement(By.name("sex")); 
		element.click(); 
		
	}

	public static void selectCity(String cityName) throws Exception{ 
		// Method to locate dropdown City by its name & pass the parameter as input
		// Use Select while locating element & to access the value in it
		Select cityDropdown = new Select(driver.findElement(By.name("City"))); 
		cityDropdown.selectByVisibleText(cityName);
		
	}

	public static void selectCourse(String courseName) throws Exception{ 
		// Method to locate dropdown Course by its name & pass the parameter as input
		// Use Select while locating element & to access the value in it
		Select courseDropdown = new Select(driver.findElement(By.name("Course"))); 
		courseDropdown.selectByVisibleText(courseName);
		
	}

	public static void selectState(String stateName) throws Exception{ 
		// Method to locate dropdown State by its name & pass the parameter as input
		// Use Select while locating element & to access the value in it
		Select stateDropdown = new Select(driver.findElement(By.name("State"))); 
		stateDropdown.selectByVisibleText(stateName);
		
	}

	public static void pincode(String pincode) throws Exception {  
		// Method to locate text box PinCode by its Absolute xpath & pass the parameter as input
		element = driver.findElement(By.id("pincode")); 
		element.sendKeys(pincode);
		
	}

	public static void emailID(String emailID) throws Exception { 
		// Method to locate text box EmailId by its cssSelector (name) & pass the parameter as input
		element = driver.findElement(By.id("emailid")); 
		element.sendKeys(emailID); 
		
	}

	public static void dob(String dob) throws Exception { 
		// Method to locate text box DOB by its Relative xpath (id) & pass the parameter as input
		element = driver.findElement(By.id("dob")); 
		element.sendKeys(dob);
	
	}

	public static void phoneNumber(String phoneNumber) throws Exception { 
		// Method to locate text box MobileNo by its Relative xpath (id) & pass the parameter as input
		element = driver.findElement(By.id("mobileno")); 
		element.sendKeys(phoneNumber);
		
	}


	public static void clickSubmitButton() throws Exception{ 
		// Method to locate the Submit Form Button by its Absolute xpath & click it
		element = driver.findElement(By.xpath("//input[@type='submit']")); 
		element.click();
		
	}

	public static void displayAlertMessage() throws Exception{ 
		// Store the warning message displayed in alert window in a string 'alertMessage' & print it; 
		// And click Ok
		Alert alert = driver.switchTo().alert(); 
		alertMessage = alert.getText(); 
		System.out.println(alertMessage); 
		alert.accept();
		
	}

	public static void successMessage() throws Exception { 
		// Method to locate the message content using its Absolute xpath
		// Capture & print the success message
		element = driver.findElement(By.xpath("//div[@id='myModal']//p")); 
		String Message = element.getText(); 
		System.out.println(Message);
		
	}

	public static void closeBrowser() { 
		// Method to close the Browser
		driver.quit();
		
	}

	public static void main(String[] args) throws Exception {
		// Invoke all the above methods
		// Pass Valid inputs Name as "John", FatherName as "Zayas", Postal & Personal Address as "11,xyz Street", 
		// City as "MUMBAI", Course as "MBA",  State as "MUMBAI", Pincode as "230532"
		// Email as "jackZayas112@mail.com", DOB as "26/07/1999", 
		// Invalid PhoneNumber as "hgdhgch"
		// Later valid PhoneNumber as "9223432128"
		setDriver(); 
		Name("John");
		fatherName("Zayas");
		String Address = "11,xyz Street";
		postalAddress(Address);
		personalAddress(Address);
		gender();
		selectCity("MUMBAI");
		selectCourse("MBA");
		selectState("MUMBAI");
		pincode("230532");
		emailID("jackZayas112@mail.com");
		dob("12/12/2000");
		phoneNumber("hgdhgch");

		clickSubmitButton();
		displayAlertMessage();

		phoneNumber("9223432128");
		clickSubmitButton();
		successMessage();
		closeBrowser();
		
	}

}
