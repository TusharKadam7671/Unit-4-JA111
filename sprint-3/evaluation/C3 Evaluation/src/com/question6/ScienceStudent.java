package com.question6;

public class ScienceStudent implements Student{
	
	
	@Override
	public double findPercentage() {
		// TODO Auto-generated method stub
		int sum=getChemistryMarks()+getMathMarks()+getPhysicsMarks()+getBiologyMarks();
		double percentage = sum/4;
		return percentage;
	}
	
	
	private int physicsMarks;
	private int chemistryMarks;
	private int mathMarks;
	private int biologyMarks;
	
	public ScienceStudent() {
		// TODO Auto-generated constructor stub
	}

	public ScienceStudent(int physicsMarks, int chemistryMarks, int mathMarks, int biologyMarks) {
		super();
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathMarks = mathMarks;
		this.biologyMarks = biologyMarks;
	}

	public int getPhysicsMarks() {
		return physicsMarks;
	}

	public void setPhysicsMarks(int physicsMarks) {
		this.physicsMarks = physicsMarks;
	}

	public int getChemistryMarks() {
		return chemistryMarks;
	}

	public void setChemistryMarks(int chemistryMarks) {
		this.chemistryMarks = chemistryMarks;
	}

	public int getMathMarks() {
		return mathMarks;
	}

	public void setMathMarks(int mathMarks) {
		this.mathMarks = mathMarks;
	}

	public int getBiologyMarks() {
		return biologyMarks;
	}

	public void setBiologyMarks(int biologyMarks) {
		this.biologyMarks = biologyMarks;
	}

	
	
	

}
