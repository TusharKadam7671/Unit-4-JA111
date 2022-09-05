package com.question1;

public class Main {
	
	public static Person generatePerson(Person person)
	{
		Person s = person;
		return s;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1=new Person();
		p1.setAddress(new Address());
		
		p1.getAddress().setCity("Mumbai");
		p1.getAddress().setState("Maharashtra");
		p1.getAddress().setPincode("415401");
		
		Person newStudent=generatePerson(new Student("tushar","male",12,"fsd",21));

//		Person newTeacher=generatePerson(new Instructor("tush","male",34,330000));
		
		System.out.println(newStudent+" address=Address["+"city="+p1.getAddress().getCity()+", state="+p1.getAddress().getState()+", pincode="+p1.getAddress().getPincode());
		
		
		Person p2=new Person();
		p2.setAddress(new Address());
		
		p2.getAddress().setCity("Pune");
		p2.getAddress().setState("Maharashtra");
		p2.getAddress().setPincode("415503");
		
		Person newTeacher=generatePerson(new Instructor("tushar","male",12,21000));

//		Person newTeacher=generatePerson(new Instructor("tush","male",34,330000));
		
		System.out.println(newTeacher+" address=Address["+"city="+p2.getAddress().getCity()+", state="+p2.getAddress().getState()+", pincode="+p2.getAddress().getPincode());
		
	}

}
