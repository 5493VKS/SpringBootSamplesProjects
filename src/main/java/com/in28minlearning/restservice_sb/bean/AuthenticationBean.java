package com.in28minlearning.restservice_sb.bean;

public class AuthenticationBean {
	
	private String username;
	//private String password;
	
	public AuthenticationBean(String username) {
		super();
		this.username = username;
		//this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	/*
	 * public String getPassword() { return password; }
	 * 
	 * public void setPassword(String password) { this.password = password; }
	 */
	
	

}
