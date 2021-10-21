package com_hrm_testcases;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com_hrm_pageobjects.AdminPage_Elements;
import com_hrm_pageobjects.LoginPage_Elements;

public class AdminPage_Testcases extends BaseClass {
	

	@Test
	public void adminPage() throws IOException, InterruptedException
	{
	
	LoginPage_Elements login=new LoginPage_Elements(driver);
	login.username(config.username());
	logger.info("Entered UserName");
	login.password(config.password());
	logger.info("Entered Password");
	login.subButton();
	logger.info("Submit Button Clicked");
	
	
	AdminPage_Elements admpage=new AdminPage_Elements(driver);
	
	admpage.admin(driver);
	logger.info("Moves over to Admin");
	Thread.sleep(1000);
	admpage.usermanagement(driver);
	logger.info("Moves over to User Management");
	Thread.sleep(1000);
	
	admpage.user(driver);
	logger.info("Clicked User");
	
	Thread.sleep(1000);
	String actual=admpage.actual();
	//System.out.println(admpage.actual());
	String expected="System Users";
	if(actual.contains(expected))
	{
		
		admpage.serchUser("AutoFcc");
		logger.info("search user with name Admin");
		admpage.userrole(2);
		logger.info("selected user role from the dropdown list");
		admpage.status();
		logger.info("selected status from the dropdown list");
		admpage.searchButton();
		logger.info("search button clicked");
		String actual_result=driver.findElement(By.xpath("//tbody//tr//td[2]//a[contains(text(),'AutoFCC')]")).getText();
		String expected_result="AutoFCC";
		if(actual_result.contains(expected_result))
		{
			
			WebElement ele=driver.findElement(By.xpath("//table[@id='resultTable']"));
			File scrile=ele.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrile,new File ("./successScreenshot/"+actual_result+".png"));
		
			
		}
	}
	else
		Assert.assertTrue(false);
}
	}
