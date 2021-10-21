package com_hrm_testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com_hrm_pageobjects.ForgotPage_Elements;

public class ForgotPassword_Testcase extends BaseClass {
@Test
	public void forgotpassword() throws InterruptedException
	{

		ForgotPage_Elements fpwd=new ForgotPage_Elements(driver);
		fpwd.forgotPwd();
		logger.info("forgot Link Clicked");
		fpwd.securityName(config.username());
		logger.info("Entered Old User Name");
		fpwd.resetButton();
		logger.info("Clicked Reset Buttton");
		WebElement msg=driver.findElement(By.xpath("//div[@class='message warning fadable']"));
		String actual=msg.getText();
		String expected="There is a password reset request already in the system.";
		if(actual.contains(expected))
		{
			Assert.assertTrue(true);
		}
		else
			Assert.assertTrue(false);
	}
	
}
