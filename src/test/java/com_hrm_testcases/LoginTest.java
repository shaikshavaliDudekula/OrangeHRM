package com_hrm_testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com_hrm_pageobjects.LoginPage_Elements;

public class LoginTest extends BaseClass {
	
	
	@Test
	public void loginPage() throws InterruptedException
	{
		
		LoginPage_Elements login=new LoginPage_Elements(driver);
	login.username(config.username());
	logger.info("Entered UserName");
	login.password(config.password());
	logger.info("Entered Password");
	login.subButton();
	logger.info("Submit Button Clicked");
	boolean imgpresent=driver.findElement(By.xpath("//div[@id='branding']/a[1]/img")).isDisplayed();
		if(imgpresent==true)
		{
			logger.info("Login TestCase success");
			Assert.assertTrue(true);
		}
		else
		{
			logger.info("Login TestCase Fail");
			Assert.assertTrue(false);	
		}
		
	
	}
	

	
}
