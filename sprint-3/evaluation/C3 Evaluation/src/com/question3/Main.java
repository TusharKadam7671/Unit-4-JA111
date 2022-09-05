package com.question3;

public class Main {
	
	public static void messageToStudents(Evaluation evaluation)
	{
		if(evaluation instanceof DsaEvaluation)
		{
			System.out.println("Its a DSA Evaluation");
			DsaEvaluation dsa = (DsaEvaluation)evaluation;
			dsa.printNoOfQuestions();
			dsa.evaluationTiming();
		}
		if(evaluation instanceof CodingEvaluation)
		{
			System.out.println("Its a Coding Evaluation");
			CodingEvaluation coding = (CodingEvaluation)evaluation;
			coding.printNoOfQuestions();
			coding.evaluationTiming();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		messageToStudents(new DsaEvaluation(5));
		
		System.out.println("=========================");
		
		messageToStudents(new CodingEvaluation(4));
		
		System.out.println("=========================");
	}

}
