package com.address.sbeans;

import org.springframework.beans.factory.annotation.Autowired;

public class Student
{
	private String name;

	private Address address;

	public void setName(String name) {
		this.name = name;
	}

	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}
	public void showStudentDetails()
	{
		 System.out.println("Student Name: " + name);
	        System.out.println("Student Address: " + address);	}
}
