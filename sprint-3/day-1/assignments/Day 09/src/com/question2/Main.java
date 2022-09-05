package com.question2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//approach 1-of array
		Animal[] animalArray1=new Animal[3];
		animalArray1[0]=new Dog();
		animalArray1[1]=new Cat();
		animalArray1[2]=new Tiger();
		
		
		
		
		//approach 2-of array
		Dog dog=new Dog();
		Cat cat=new Cat();
		Tiger tiger=new Tiger();
		
		Animal[] animalArray2= {dog,cat,tiger};
		
		
		
		//loop animal array and call all the methods
		//try any animalArray1 or animalArray2
		for(int i=0; i<animalArray2.length; i++)
		{
			animalArray2[i].eat();
			animalArray2[i].walk();
			animalArray2[i].makeNoise();
			
			System.out.println("-----------------");
		}
		

	}

}
