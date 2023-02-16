package com.simplilearn.service;

import com.simplilearn.model.Admin;

public interface Adminservice {

	public boolean validateAdmin(Admin admin);
	public void changeAdminPassword(Admin admin);
	
}
