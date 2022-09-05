package com.question6;

public class ArtStudent implements Student{
	
	
	@Override
	public double findPercentage() {
		// TODO Auto-generated method stub
		
		int sum=getHindiMarks()+getEnglishMarks()+getHistoryMarks();
		double percentage = sum/3;
		return percentage;
	}
	
	
	private int hindiMarks;
	private int englishMarks;
	private int historyMarks;
	
	public ArtStudent() {
		// TODO Auto-generated constructor stub
	}

	public ArtStudent(int hindiMarks, int englishMarks, int historyMarks) {
		super();
		this.hindiMarks = hindiMarks;
		this.englishMarks = englishMarks;
		this.historyMarks = historyMarks;
	}

	public int getHindiMarks() {
		return hindiMarks;
	}

	public void setHindiMarks(int hindiMarks) {
		this.hindiMarks = hindiMarks;
	}

	public int getEnglishMarks() {
		return englishMarks;
	}

	public void setEnglishMarks(int englishMarks) {
		this.englishMarks = englishMarks;
	}

	public int getHistoryMarks() {
		return historyMarks;
	}

	public void setHistoryMarks(int historyMarks) {
		this.historyMarks = historyMarks;
	}

	
	
	

}
