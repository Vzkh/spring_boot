package com.zk.model;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = -4076451190423137947L;
	
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
