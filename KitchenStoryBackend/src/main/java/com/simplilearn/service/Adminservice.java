package com.simplilearn.service;

import java.util.List;

import com.simplilearn.model.Admin;

public interface Adminservice {

	public List<Admin> validateAdmin();
	public void changeAdminPassword(Admin admin);
	
}
