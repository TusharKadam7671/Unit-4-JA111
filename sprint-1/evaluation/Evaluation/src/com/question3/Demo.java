package com.question3;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 64;
		int b = 70;
		byte c = (byte)(a+b);//typecast (a+b) to byte
		System.out.println(c);  //Output is '-122'
	}

}

/*
 
Explanation-

--here after arithmetic operations like "a+b" the output is in "int" datatype so first 
	we have to type cast the "a+b"
--and we are assigning int datatype value to the byte so we have to use the 'explicit type cast' here
--if we did in the way like byte c=(byte)a+b; --> then again this will show error because single number is also considered as
	integer type, so we need to put brackets to "a+b" operation like--> byte c=(byte)(a+b);
	
	
--This type of arithmetic operation follow one rule, ans according to this rule the resultant datatype is decided-->

	max(int, type1, type2, ...), 
	
	so according to this rule the answer is int in this case..so thats why we need type cast here.


--Result is '-122' is because the range of 'byte' datatype is between '-128 to 127' so here 64+70 is 134 so this will
	become as '-122'.
*/