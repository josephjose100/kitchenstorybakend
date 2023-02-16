package com.simplilearn.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String pName;
	private String pCategory;
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Item(int id, String pName, String pCategory) {
		super();
		this.id = id;
		this.pName = pName;
		this.pCategory = pCategory;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpCategory() {
		return pCategory;
	}
	public void setpCategory(String pCategory) {
		this.pCategory = pCategory;
	}
	
	
	
}
