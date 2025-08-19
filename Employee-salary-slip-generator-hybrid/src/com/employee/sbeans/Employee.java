package com.employee.sbeans;

public class Employee {
	private int id;
	private String name;
	private double basicSalary;
	private double hra;
	private double da;
	private double taxPercentage;

	public Employee(int id, String name, double basicSalary, double hra, double da, double taxPercentage) {
		super();
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
		this.hra = hra;
		this.da = da;
		this.taxPercentage = taxPercentage;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public double getHra() {
		return hra;
	}

	public double getDa() {
		return da;
	}

	public double getTaxPercentage() {
		return taxPercentage;
	}

}
