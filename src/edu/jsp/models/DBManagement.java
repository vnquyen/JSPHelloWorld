package edu.jsp.models;

public class DBManagement {
	public boolean checkUser(String username, String password) {
		if(username.equals("Pikachou") && password.equals("123456")) {
	    	return true;
	    } else {
	    	return false;
	    }  
	}
}
