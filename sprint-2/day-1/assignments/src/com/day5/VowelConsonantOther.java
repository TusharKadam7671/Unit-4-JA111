package com.day5;

public class VowelConsonantOther {
	int x=10;
	
	void myfunction(char ch) {
		
		if(Character.isAlphabetic(ch))
		{
			switch(ch)
			{
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':
				System.out.println("Character is Vowel");
				break;
				
			default: System.out.println("Character is Consonant");
			}
		}else
		{
			System.out.println("Error");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VowelConsonantOther s = new VowelConsonantOther();
		System.out.println(s);
		char ch='I';
		
		s.myfunction(ch);

	}

}
