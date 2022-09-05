package com.question6;

public class CommerceStudent implements Student{
	
	
	@Override
	public double findPercentage() {
		// TODO Auto-generated method stub
		int sum=getAccountMarks()+getBussinessStudiesMarks()+getEconomicsMarks();
		double percentage = sum/3;
		return percentage;
	}
	
	
	private int accountMarks;
	private int economicsMarks;
	private int bussinessStudiesMarks;
	
	public CommerceStudent() {
		// TODO Auto-generated constructor stub
	}

	public CommerceStudent(int accountMarks, int economicsMarks, int bussinessStudiesMarks) {
		super();
		this.accountMarks = accountMarks;
		this.economicsMarks = economicsMarks;
		this.bussinessStudiesMarks = bussinessStudiesMarks;
	}

	public int getAccountMarks() {
		return accountMarks;
	}

	public void setAccountMarks(int accountMarks) {
		this.accountMarks = accountMarks;
	}

	public int getEconomicsMarks() {
		return economicsMarks;
	}

	public void setEconomicsMarks(int economicsMarks) {
		this.economicsMarks = economicsMarks;
	}

	public int getBussinessStudiesMarks() {
		return bussinessStudiesMarks;
	}

	public void setBussinessStudiesMarks(int bussinessStudiesMarks) {
		this.bussinessStudiesMarks = bussinessStudiesMarks;
	}

	
	
	

}
