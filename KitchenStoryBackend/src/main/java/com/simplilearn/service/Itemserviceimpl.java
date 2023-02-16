package com.simplilearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.exception.ResourceNotFoundException;
import com.simplilearn.model.Item;
import com.simplilearn.repository.ItemRepository;

@Service
public class Itemserviceimpl implements Itemservice{

	@Autowired
	ItemRepository itemrepository;
	
	public void addItem(Item item) {
		
		itemrepository.save(item);
	}


	public void removeItem(int id) {
	
		Item item = itemrepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not exist with id :" + id));
	
		 itemrepository.delete(item);
	}
	

	
	public List<Item> viewAll() {
		
		return itemrepository.findAll();
	}


	


	
		
	
	

	
	

}
