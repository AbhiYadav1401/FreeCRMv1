 package com.login;

import java.util.ResourceBundle;

public class App {
	
	public int userLogin(String in_user , String in_pwd)
	{
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String username = rb.getString(in_user);
		String password = rb.getString(in_pwd);
		
		if(in_user.equals(username)&&in_pwd.equals(password))
			return 1;
		else
			return 0;
	}

}
