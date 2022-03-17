package com.userservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	private int userID;
	private String userName;
	private String address;
	private int deptId;
	
	public User() {}

	public User(String userName, int userID, String address, int deptId) {
		super();
		this.userName = userName;
		this.userID = userID;
		this.address = address;
		this.deptId = deptId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", userID=" + userID + ", address=" + address + ", deptId=" + deptId
				+ "]";
	}
	
	

}
