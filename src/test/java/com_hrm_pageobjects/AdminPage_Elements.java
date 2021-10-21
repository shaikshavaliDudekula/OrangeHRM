package com_hrm_pageobjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AdminPage_Elements {
	WebDriver driver;
	@FindBy(how=How.LINK_TEXT,using="Admin")
	WebElement admin;
	
	@FindBy(how=How.LINK_TEXT,using="User Management")
	WebElement umanagement;
	
	@FindBy(how=How.LINK_TEXT,using="Users")
	WebElement user;
	@FindBy(how=How.XPATH,using="//div[@class='head']//h1[contains(text(),'System Users')]")
	WebElement actual;
	
	@FindBy(how=How.XPATH,using="//input[@id='searchSystemUser_userName']")
	WebElement serch_user;
	@FindBy(how=How.XPATH,using="//select[@id='searchSystemUser_userType']")
	WebElement userRoleDropdown;
	@FindBy(how=How.XPATH,using="//select[@id='searchSystemUser_status']")
	WebElement statusDropdown;
	@FindBy(how=How.XPATH,using="//input[@id='searchBtn']")
	WebElement search_button;
	
	
public AdminPage_Elements( WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
}

public void searchButton()
{
	search_button.click();
}
public void admin(WebDriver driver)
{
	
	new Actions(driver).moveToElement(admin).build().perform();
}

public void usermanagement(WebDriver driver)
{
	
	new Actions(driver).moveToElement(umanagement).build().perform();
}

public void user(WebDriver driver)
{
	
	new Actions(driver).moveToElement(user).click().build().perform();
	
}
public void serchUser(String name)
{
	serch_user.sendKeys(name);

}
public void status()
{
	Select drop=new Select(statusDropdown);
drop.selectByVisibleText("Enabled");	
}

public void userrole(int index)
{
	Select drop=new Select(userRoleDropdown);
drop.selectByIndex(index);	
}




public String  actual()
{
	String text=actual.getText();
	return text;
	
}



}
