package com.question4;

public class EvenOddError {
	
	public void evenOdd(int number)
	{
		if(number%2==1)
		{
			System.out.println(number);
		}else if(number%2==0)
		{
//			int output=number+(10-(number%10));
			int output=(number-number%10)+10;
			System.out.println(output);
		}else if(number<0)
		{
			System.out.println("Error");
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
EvenOddError e=new EvenOddError();
		
		e.evenOdd(44);

	}

}
