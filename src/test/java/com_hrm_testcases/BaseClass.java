package com_hrm_testcases;



import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import com_hrm_utilities.Configuration;
@Listeners(com_hrm_testreport.TestListner.class)
public class BaseClass {
	public  static WebDriver driver;
	public static Logger logger;
	Configuration config=new Configuration();
	@SuppressWarnings("deprecation")
	@BeforeClass
	public void setup()
	{
		logger=LogManager.getLogger(BaseClass.class.getMethods());
	
		System.setProperty("webdriver.chrome.driver",config.chromepath());
		
		driver=new ChromeDriver();
		logger.info("Browser launched");
		driver.manage().window().maximize();
		logger.info("Browser maximized");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get(config.baseurl());
		logger.info("Url Opened");
	}
	@AfterClass
	public void tearUp()
	{
		driver.close();
	}

}
