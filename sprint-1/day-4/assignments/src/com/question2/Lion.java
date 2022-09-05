package com.question2;

public class Lion {
	
	String name;
	boolean isHungry;
	int age;
	static int totalDeaths;
	static void printKillings(){
	System.out.println("Total killings by lion in jungle "+totalDeaths);
	}
	
	void thinking(boolean value,int age)
	{
		if(value==false)
		{
			System.out.println(name+" is sleeping");
		}else
		{
			if(age>12)
			{
				totalDeaths+=2;
				System.out.println(name+" has eaten two animal");
			}else if(age<=12 && age>=2)
			{
				totalDeaths+=1;
				System.out.println(name+" has eaten one animal");
			}else if(age<2)
			{
				System.out.println(name+" is calling Mom");
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lion lion1=new Lion();
		Lion lion2=new Lion();
		Lion lion3=new Lion();
		
		totalDeaths=0;
		
		lion1.name="Lion 1";
		lion1.isHungry=false;
		lion1.age=12;
		
		lion2.name="Lion 2";
		
		lion3.name="Lion 3";
		
		lion1.thinking(true,13);
		lion2.thinking(true, 1);
		lion1.thinking(true, 5);
		lion3.thinking(false, 25);
		printKillings();
		}


}
