package com.capgemini.training.model;

public abstract class Training {
	
	private int trainingId;
	private String name;
	private double fees;
	public Training() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Training(int trainingId, String name, double fees) {
		super();
		this.trainingId = trainingId;
		this.name = name;
		this.fees = fees;
	}
	public int getTrainingId() {
		return trainingId;
	}
	public void setTrainingId(int trainingId) {
		this.trainingId = trainingId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	
	public abstract double getOrderValue();
	@Override
	public String toString() {
		return "Training [trainingId=" + trainingId + ", name=" + name + ", fees=" + fees + "]";
	}
	

}
