package com.springeg1.springeg1.model;

public class Persons {
	
	private int id;
	private String pname;
	private String address;
	private String company;
	
	public Persons(int id, String pname, String address, String company) {
		super();
		this.id = id;
		this.pname = pname;
		this.address = address;
		this.company = company;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	@Override
	public String toString() {
		return "Persons [id=" + id + ", pname=" + pname + ", address=" + address + ", company=" + company + "]";
	}
	

}
