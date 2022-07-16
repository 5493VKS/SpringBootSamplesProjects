package com.springBootJPAExample1.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Y_table {
	
	@Id
	@GeneratedValue
	private int id;
	private String x_name;

	
	public Y_table(String x_name) {
		super();
		this.x_name = x_name;
	}

	public String getX_name() {
		return x_name;
	}

	public void setX_name(String x_name) {
		this.x_name = x_name;
	}
	
	

}
