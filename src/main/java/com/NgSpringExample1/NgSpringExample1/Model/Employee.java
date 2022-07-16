package com.NgSpringExample1.NgSpringExample1.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Emp_2020")
public class Employee {
	
	Long id;
	String ename;
	String address;
	String emails;
	
	
	public Employee() {
		
	}

	public Employee(Long id, String ename, String address, String emails) {
		this.id = id;
		this.ename = ename;
		this.address = address;
		this.emails = emails;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name="ename", nullable = false)
	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
	@Column(name="address",nullable = false)
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name="emails",nullable = false)
	public String getEmails() {
		return emails;
	}

	public void setEmails(String emails) {
		this.emails = emails;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", ename=" + ename + ", address=" + address + ", emails=" + emails + "]";
	}
	
	

}
