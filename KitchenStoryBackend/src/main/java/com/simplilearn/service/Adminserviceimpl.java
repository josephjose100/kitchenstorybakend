package com.simplilearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.model.Admin;
import com.simplilearn.repository.AdminRepository;

@Service
public class Adminserviceimpl implements Adminservice {

	@Autowired
	AdminRepository adminrepository;
	
	
	public List<Admin> validateAdmin() {
		
		List<Admin> admins=adminrepository.findAll();
		return admins;		
	}

	
	public void changeAdminPassword(Admin admin) {
	
		adminrepository.save(admin);
		
	}


	

}
