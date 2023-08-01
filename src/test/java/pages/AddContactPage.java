package pages;



import static utilities.DriverSetUp.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class AddContactPage extends BasePage{
	
	public By SeletTag = By.xpath("//input[@id='checkbox-4-0356']");
	public By Enter_Number = By.cssSelector("[name=\"number\"]"); 
	public By Email = By.xpath("//input[@placeholder='Enter Email address']");
	public By First_Name = By.cssSelector("input[placeholder='Enter First name']");
	public By Last_Name = By.cssSelector("[name=\"last_name\"]");	
	public By Birthday = By.xpath("//input[@placeholder='Enter your birthday']");
	
    public By City = By.xpath("//input[@placeholder='Enter your city']");
    public By State = By.xpath("//input[@placeholder='Enter your state']");
    public By ZipCode = By.xpath("//input[@placeholder='Enter your Zip']");
    
    
    public By Country = By.cssSelector("input[placeholder='Enter your country']");
    public By Address = By.xpath("//textarea[@placeholder='Enter your address']");
    
    public By AddContact_BTN = By.xpath("//button[normalize-space()='Add Contact']");
    
    
    public void AddContactAllInformation() throws InterruptedException {
    	clickOnElement(SeletTag);
    	
    	writeTextOnElement(Enter_Number,"56");
    	Thread.sleep(2000);
    	
    	WebElement email = getElement(Email);
    	
    	Thread.sleep(2000);
    	
    	email.sendKeys("tonmoydatta45@gmail.com");
    	Thread.sleep(2000);
    	
    	Thread.sleep(2000);
    	writeTextOnElement(First_Name,"Tanmoy");
    	Thread.sleep(2000);
    	writeTextOnElement(Last_Name,"Datta");
    	Thread.sleep(2000);
    	
    	WebElement birthday = getElement(Birthday);
    	birthday.sendKeys("1997-11-04");
    	Thread.sleep(2000);
    	
    	writeTextOnElement(City,"Dhaka");
    	Thread.sleep(2000);
    	writeTextOnElement(State,"Dhaka");
    	Thread.sleep(2000);
    	
    	writeTextOnElement(ZipCode,"1216");
    	Thread.sleep(2000);
    	writeTextOnElement(Country,"Bangladesh");
    	Thread.sleep(2000);
    	writeTextOnElement(Address,"Mirpur 1");
    	Thread.sleep(2000);
    	
    	WebElement addcontact_btn = getElement(AddContact_BTN);
    	Actions actions = new Actions(getDriver());
    	actions.moveToElement(addcontact_btn).build().perform();
    	clickOnElement(AddContact_BTN);
    	Thread.sleep(2000);
    	
    	
	}	
}
