package com.question3;

public abstract class Evaluation {

	private final int numberOfQuestions;
	
	Evaluation(int i)
	{
		numberOfQuestions=i;
	}
	
	abstract void evaluationTiming();
	void printNoOfQuestions() {
	System.out.println("No. of Questions in Evaluation is :" +numberOfQuestions);
	}

}
