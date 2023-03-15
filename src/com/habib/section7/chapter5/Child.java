package com.habib.section7.chapter5;

public class Child extends Parent{
	
	public Worker fun(int n) {	// Overriden function can have the same return type
		return new Worker();
	}
	
	public Employee fun(int n, int m) {	// Overriden function can have the subclass return type
		return new Employee();
	}
	
//	public Student fun(int n, String m) {	// Overriden function cannot have any other return type.
//		return new Student();
//	}
	
}
