package com_hrm_pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_Elements  {
	static WebDriver driver;
	
@FindBy(how=How.XPATH,using="//input[@id='txtUsername']")	
WebElement uname;
@FindBy(how=How.XPATH,using="//input[@id='txtPassword']")	
WebElement pwd;
@FindBy(how=How.XPATH,using="//input[@id='btnLogin']")	
WebElement button;

public LoginPage_Elements(WebDriver driver)
{
	LoginPage_Elements.driver=driver;
	PageFactory.initElements(driver, this);
}
public void username(String uName)
{
	uname.sendKeys(uName);
}
public void password(String Pwd)
{
	pwd.sendKeys(Pwd);
}
public void subButton()
{
	button.click();
}

}
