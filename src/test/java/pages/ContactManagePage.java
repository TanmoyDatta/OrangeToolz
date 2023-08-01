package pages;

import org.openqa.selenium.By;

public class ContactManagePage extends BasePage{
	public By AddContact= By.xpath("//a[normalize-space()='Add Contact']");
	
	public void Addcontact() throws InterruptedException {
		clickOnElement(AddContact);
		Thread.sleep(5000);
	}

}
