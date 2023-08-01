package testcases;

import org.testng.annotations.Test;

import pages.AddContactPage;
import pages.ContactManagePage;
import pages.HomePage;
import pages.LoginPage;
import utilities.Dataset;
import utilities.DriverSetUp;

public class testcases extends DriverSetUp{
	LoginPage loginPage = new LoginPage();
	HomePage homePage = new HomePage();
	ContactManagePage contactManagePage = new ContactManagePage();
	AddContactPage addContact = new AddContactPage();
	
	@Test(priority = 0, description = "Showing Login Page")
	public void loginpages() throws InterruptedException {
		getDriver().get(loginPage.Home_URL);
		Thread.sleep(5000);
	}
	
	@Test(priority = 1, description = "Login with valid value", dataProvider = "ValidCredensial", dataProviderClass = Dataset.class)
	public void loginpageswithValidCredensialUsingDataprovider(String usrname, String password) throws InterruptedException {
		getDriver().get("http://159.89.38.11/login");
		loginPage.dologin(usrname, password);
		Thread.sleep(5000);
		
		
	}
	
	@Test(priority = 2,description = "Contact Manage Page")
	public void contactManagePage() throws InterruptedException {
		getDriver().get("http://159.89.38.11/contact/manage");
		homePage.HoverInContactManager();
		contactManagePage.Addcontact();
		addContact.AddContactAllInformation();
		Thread.sleep(4000);
	}
	
}
