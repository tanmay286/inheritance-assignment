package com.capgemini.employee.model;

public class Manager extends Employee {
	private double petrolAllowance;
	private double foodAllowance;
	private double otherAllowance;
	private double managerGrossSalary;
	
	public Manager() {
		super();
	
	}

	public Manager(int employeeId, String employeeName, double employeeBasicSalary, double employeeMedical) {
		super(employeeId, employeeName, employeeBasicSalary, employeeMedical);
	
	}

	@Override
	public double getEmployeeGrossSalary() {
		petrolAllowance=getEmployeeBasicSalary()*0.08;
		foodAllowance=getEmployeeBasicSalary()*0.13;
		otherAllowance=getEmployeeBasicSalary()*0.03;
		
		managerGrossSalary=petrolAllowance+foodAllowance+otherAllowance+super.getEmployeeGrossSalary();
	return managerGrossSalary;
	}
	

}
