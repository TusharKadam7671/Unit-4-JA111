package com.question3;

import java.util.Comparator;

public class StudentMarks implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		int s1marks=s1.getEngMarks()+s1.getMathsMarks()+s1.getScienceMarks();
		int s2marks=s2.getEngMarks()+s2.getMathsMarks()+s2.getScienceMarks();
		
//		System.out.println(s1.getName());
//		System.out.println(s2.getName());
		
		if(s1marks>s2marks)
		{
			return +1;
		}else
		{
			return -1;
		}
	}

}
