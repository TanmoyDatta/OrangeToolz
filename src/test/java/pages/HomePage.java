package pages;

import static utilities.DriverSetUp.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HomePage extends BasePage{
	
public By DeshBoard = By.xpath("/html/body/div[2]/div/main/aside[1]/div[1]/ul/li[4]/a/i");
public By ContactManage = By.xpath("//*[@id=\"main-sidebar\"]/div[1]/ul/li[4]/a/span");


public void HoverInContactManager() throws InterruptedException {
	

	WebElement deshboard = getElement(DeshBoard);
	Actions actions = new Actions(getDriver());
	actions.clickAndHold(deshboard).build().perform();

	clickOnElement(DeshBoard);
	Thread.sleep(2000);
   }

}
