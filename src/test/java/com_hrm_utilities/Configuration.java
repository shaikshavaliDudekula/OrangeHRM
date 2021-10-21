package com_hrm_utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class Configuration {
	Properties pro;
	public Configuration() 
	{
		try
		{
		String filepath=System.getProperty("user.dir")+"/utilities/config.properties";
		FileInputStream file=new FileInputStream(filepath);
		pro=new Properties();
		pro.load(file);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	public String baseurl()
	{
		String base=pro.getProperty("baseUrl");
		return base;
	}
	public String chromepath()
	{
		String chrome=pro.getProperty("chromePath");
		return chrome;
	}
	public String username()
	{
		String uname=pro.getProperty("userName");
		return uname;
	}
	public String password()
	{
		String pwd=pro.getProperty("password");
		return pwd;
	}

}
