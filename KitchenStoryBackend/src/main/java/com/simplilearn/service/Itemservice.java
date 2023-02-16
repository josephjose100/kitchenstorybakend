package com.simplilearn.service;

import java.util.List;

import com.simplilearn.model.Item;

public interface Itemservice {
	
	public void addItem (Item item);
	public void removeItem(int id);
	public List<Item> viewAll();


}
