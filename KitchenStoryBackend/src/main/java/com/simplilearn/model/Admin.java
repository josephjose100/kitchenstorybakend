package com.simplilearn.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Admin {
    
	@Id
	private int id;
	private String adminName;
	private String adminPassword;
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Admin(int id, String adminName, String adminPassword) {
		super();
		this.id = id;
		this.adminName = adminName;
		this.adminPassword = adminPassword;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getAdminName() {
		return adminName;
	}
	
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	
	public String getAdminPassword() {
		return adminPassword;
	}
	
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	
	
}
