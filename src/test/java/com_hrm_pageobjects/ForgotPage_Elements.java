package com_hrm_pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ForgotPage_Elements {
	WebDriver driver;
	
	
	@FindBy(how=How.XPATH,using = "//a[text()='Forgot your password?']")
	WebElement forgotLink;
	@FindBy(how=How.XPATH,using="//input[@name='securityAuthentication[userName]']")
	WebElement old_uname;
	@FindBy(how=How.XPATH,using="//input[@type='submit']")
	WebElement restButton;
	public ForgotPage_Elements(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void forgotPwd()
	{
		forgotLink.click();
	}
	public void securityName(String uname)
	{
	 
		old_uname.sendKeys(uname);
	}
	public void resetButton()
	{
	 
		restButton.click();
	}
	

}