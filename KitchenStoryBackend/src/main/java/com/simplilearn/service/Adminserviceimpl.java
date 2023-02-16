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
	
	
	public boolean validateAdmin(Admin admin) {
		
		List<Admin> admins=adminrepository.findAll();
		for(Admin admin1:admins)
		{
			if((admin1.getAdminName().equals(admin.getAdminName()))&&(admin1.getAdminPassword().equals(admin.getAdminPassword())))
			{
				return true;
			}	
         		
		}
		
		 return false;		
	}

	
	public void changeAdminPassword(Admin admin) {
	
		adminrepository.save(admin);
		
	}

}
