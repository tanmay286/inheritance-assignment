package com.capgemini.employee.model;

public class MarketingExecutive extends Employee  {
	private double distanceTravelled;
	private double executiveGrossSalary;

	public MarketingExecutive() {
		super();
	
	}

	public double getDistanceTravelled() {
		return distanceTravelled;
	}

	public void setDistanceTravelled(double distanceTravelled) {
		this.distanceTravelled = distanceTravelled;
	}

	public MarketingExecutive(int employeeId, String employeeName, double employeeBasicSalary, double employeeMedical ,double distanceTravelled) {
		super(employeeId, employeeName, employeeBasicSalary, employeeMedical);
		this.distanceTravelled=distanceTravelled;
	}
	
	@Override
	public double getEmployeeGrossSalary() {
		double telephoneAllowance=1500;
		executiveGrossSalary= super.getEmployeeGrossSalary()+telephoneAllowance+(getDistanceTravelled()*5);
	return executiveGrossSalary;
	}

	
}
	


