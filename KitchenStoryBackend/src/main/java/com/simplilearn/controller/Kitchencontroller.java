package com.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.model.Admin;
import com.simplilearn.model.Item;
import com.simplilearn.service.Adminserviceimpl;
import com.simplilearn.service.Itemserviceimpl;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/kitchen/")
public class Kitchencontroller {
	
	@Autowired
	Adminserviceimpl adminservice;
	
	@Autowired
	Itemserviceimpl itemservice;
	
	@GetMapping("/validateAdmin")
	public List<Admin> checkAdmin()
	{
		return adminservice.validateAdmin();
		
	}
	
	@PostMapping("/changePassword")
	public void changePassword(@RequestBody Admin admin)
	{
		 adminservice.changeAdminPassword(admin);
	}
	
	
	@PostMapping("/addItem")
	public void addItem(@RequestBody Item item)
	{
		itemservice.addItem(item);
	}
	
	@DeleteMapping("/deleteItem/{id}")
	public void deleteItem(@PathVariable Integer id){
		
		itemservice.removeItem(id);		
	}
	
	
	@GetMapping("/getItems")
	public List<Item> getItem()
	{
		return itemservice.viewAll();
	}
	
	
}
