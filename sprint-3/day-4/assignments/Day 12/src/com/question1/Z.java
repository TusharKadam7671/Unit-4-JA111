package com.question1;

public interface Z extends X,Y{

	//one abstract method
	void methodZ();
	
	
	//default method of interface X should override(in question)
	@Override
	default void method2() {
		// TODO Auto-generated method stub
		X.super.method2();
	}
}
