package com.config.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfigFile
{
	Properties pro ;
	String config_file_path = "C:\\Users\\hp\\eclipse-workspace\\free_crm\\config.properties";

	public ReadConfigFile() throws Exception
	{
		try
		{
		pro = new Properties();
		FileInputStream fis = new FileInputStream(config_file_path); // config file  path provide
		pro.load(fis); // load config file
		
		}
		catch(FileNotFoundException e )
		{
			System.out.println("Config file not found");
		}

	}
		public String getUrl()
		{
					String url =pro.getProperty("url");  // read key value
					if(url!=null) // return value checked
						return url;
					else
						throw new RuntimeException("URL not specifed in config file");
		}
		
		public String getUserName()
		{
			String username_config =pro.getProperty("username");
			if(username_config!=null)
				return username_config;
			else 
				throw new RuntimeException("UserName not specifed in config file");
		}
		public String getPassword()
		{
			String password_config = pro.getProperty("password");
			if(password_config !=null)
				return password_config;
			else
				throw new RuntimeException("Password not specifed in config file");
		}
}
	
