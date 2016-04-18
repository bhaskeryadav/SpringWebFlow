package com.test.flow;

import java.io.Serializable;

public class LoginCredentials implements Serializable{
 
	private static final long serialVersionUID = 6182390898687671093L;
 
	private String loginName;
	private String password;
	private String id;
	
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
 
}
