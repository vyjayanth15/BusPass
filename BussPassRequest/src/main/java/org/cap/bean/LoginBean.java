package org.cap.bean;

public class LoginBean {
	private String userName;
	private String userPassword;
	
	public LoginBean() {
		
	}
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public LoginBean(String userName, String userPassword) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
	}

	@Override
	public String toString() {
		return "LoginBean [userName=" + userName + ", UserPassword=" + userPassword + "]";
	}
	
	
}
