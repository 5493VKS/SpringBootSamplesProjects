package com.in28minlearning.restservice_sb.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Subject {
	
	@Id
	@GeneratedValue
	private int id;
	
	private String sub_name;
	private String type;
	private double price;
	
	public Subject() {
		
	}

	public Subject(int id, String sub_name, String type, double price) {
		super();
		this.id = id;
		this.sub_name = sub_name;
		this.type = type;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSub_name() {
		return sub_name;
	}

	public void setSub_name(String sub_name) {
		this.sub_name = sub_name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Subject [id=" + id + ", sub_name=" + sub_name + ", type=" + type + ", price=" + price + "]";
	}
	
	
}
