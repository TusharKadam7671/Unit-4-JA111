package com.question5;

public class B implements A{

	void methosB()
	{
//		i= 222;  //this will give compile time error
	}
}



/*
Ans- Here is compile time error is occuring because in interface all the data
we write are "static and final by default".

and we are trying to change the value of that final data into the B class, so changing
the value of final data is not possible, thats why here compile time error is coming.

if we declare any data as "int number = 10;" then jvm will convert this into 
"public static final int number = 10;" 
and for method jvm will add public abstract before the method,
void method(); --> public abstract method();
*/