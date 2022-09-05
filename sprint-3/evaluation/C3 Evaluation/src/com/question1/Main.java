package com.question1;

public class Main {
	
	public Object changeArray(Object[] arr)
	{
		Object[] arr2 = new Object[4];
		
		Student s = (Student)arr[0];
		int marks = s.getMarks();
		int newMarks = marks+10;
		s.setMarks(newMarks);
		
		Employee e = (Employee)arr[1];
		double salary = e.getSalary();
		double newSalary= salary+10000;
		e.setSalary(newSalary);
		
		System.out.println(s);
		System.out.println(e);
		
		String str = (String)arr[2];
		char[] ch = str.toCharArray();
		
		StringBuilder sb = new StringBuilder("");
		
		for(int i=ch.length-1; i>=0; i--)
		{
			sb.append(ch[i]);
		}
		
		System.out.println(sb.toString());
		
		Integer i = (Integer)arr[3];
		System.out.println(i+20);
		
		arr2[0]=s;
		arr2[1]=e;
		arr2[2]="empty";
		arr2[3]="value";
	
		
		return arr2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Object[] arr = {new Student(23, "rakesh", 450),new Employee(12, "Lokesh", 84000),"String",50};
		
		
		Main main = new Main();
		Object obj = main.changeArray(arr);
		
		
		
		
	}

}
