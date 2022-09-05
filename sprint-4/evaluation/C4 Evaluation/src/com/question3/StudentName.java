package com.question3;

import java.util.Comparator;

public class StudentName implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		// TODO Auto-generated method stub
		return s2.getName().compareTo(s1.getName());
	}

}
