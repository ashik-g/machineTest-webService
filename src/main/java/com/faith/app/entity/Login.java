package com.faith.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Login {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int lId;
	private String username;
	private String password;
	private String userType;
	//private Integer empId;
	
//	@JoinColumn(name="empId",insertable = false,updatable = false)
//	@OneToOne
//	private Employee employee;
	
	public Login() {
		super();
	}
	
	//parameterized constructors
	public Login(int lId, String username, String password, String userType) {
		super();
		this.lId = lId;
		this.username = username;
		this.password = password;
		this.userType = userType;
	}

	//getters and setters
	public int getlId() {
		return lId;
	}
	
	public void setlId(int lId) {
		this.lId = lId;
	}
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
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "Login [lId=" + lId + ", username=" + username + ", password=" + password + ", userType=" + userType
				+ "]";
	}
	
	

}
