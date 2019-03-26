package com.capgemini.training.model;

public class CorporateTraining extends Training {
	private int days;

	public CorporateTraining() {
		super();
		
	}

	public CorporateTraining(int trainingId, String name, double fees, int days) {
		super(trainingId, name, fees);
		this.days=days;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	@Override
	public double getOrderValue() {
		
		return getFees()*days;
	}
	
	
}
