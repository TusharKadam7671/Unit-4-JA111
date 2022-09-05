package com.question3;

import java.util.Comparator;

public class StudentRoll implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		if(s1.getRollNo()>s2.getRollNo())
		{
			return +1;
		}else
		{
			return -1;
		}
	}

}
