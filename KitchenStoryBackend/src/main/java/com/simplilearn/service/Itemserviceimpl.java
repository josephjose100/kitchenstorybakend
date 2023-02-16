package com.simplilearn.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.model.Item;
import com.simplilearn.repository.ItemRepository;

@Service
public class Itemserviceimpl implements Itemservice{

	@Autowired
	ItemRepository itemrepository;
	
	public void addItem(Item item) {
		
		itemrepository.save(item);
	}


	public void removeItem(Item item) {
	
        itemrepository.delete(item);		
	}

	
	public List<Item> viewAll() {
		
		return itemrepository.findAll();
	}

	
	public List<Item> viewSorted(String name) {
		
		List<Item> items=viewAll();
		List<Item> sortedItems=new ArrayList<>();
		for(Item item:items)
		{
			if((item.getpName().equals(name))||(item.getpCategory().equals(name)))
			{
			  sortedItems.add(item);	
			}
			
		}
		return sortedItems;
	}

}
