package com.employee.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SalarySlipService {
	@Autowired
	private Employee employee;

	public void generateSlip() {
		double grossSalary = employee.getBasicSalary() + employee.getDa() + employee.getHra();
		double taxAmount = (grossSalary * employee.getTaxPercentage()) / 100;
		double netSalary = grossSalary - taxAmount;
		System.out.println("Salary Slip for " + employee.getId());
		System.out.println("Employee Name:" + employee.getName());
		System.out.println("Gross Salary:" + grossSalary);
		System.out.println("Tax Deducted:" + taxAmount);
		System.out.println("Net Salary: " + netSalary);

	}
}
