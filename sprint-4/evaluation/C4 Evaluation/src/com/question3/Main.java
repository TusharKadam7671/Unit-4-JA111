package com.question3;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<>();
		
		
			
		students.add(new Student(5,"Vikram",90,60,75));
		students.add(new Student(1,"Ramesh",45,50,55));
		students.add(new Student(6,"Ashish",45,50,55));
		students.add(new Student(3,"Ashutosh",50,50,55));
		
		Collections.sort(students,new StudentMarks());
//		Collections.sort(students,new StudentRoll());
//		Collections.sort(students,new StudentName());
		

		
		for(int i=0; i<students.size(); i++)
		{
			if(i!=students.size()-1)
			{
				int s1=students.get(i).getEngMarks()+students.get(i).getMathsMarks()+students.get(i).getScienceMarks();
				int s2=students.get(i+1).getEngMarks()+students.get(i+1).getMathsMarks()+students.get(i+1).getScienceMarks();
				if(s1==s2)
				{
					Student s3 = students.get(i);
					Student s4 = students.get(i+1);
					students.set(i, s4);
					students.set(i+1, s3);
					
				}
			}
//			if(students.get(i))
		}
		
		Iterator<Student> iter = students.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
	}

}
