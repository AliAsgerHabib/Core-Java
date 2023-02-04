package com.habib.section3;

import java.awt.Checkbox;

@SuppressWarnings("unused")
public class Chapter3 {
	
	
	public static void part1() 
	{
		byte a = 20 , b = 30;
//		byte c = a + b;   // Throws an error : Arithmetic Operation
//		byte c = a & b;	  // Throws an error : Bitwise Operation
		short f = a++;	  // Works : increment / decrement operations.
		b += a;			  // Works : compound assignment operation.
		short d = 25; 	  // Works :  relational operations 
		if(d < 100) System.out.println("Hello");
		short e = d;
	}
	
	public static void main(String[] args) 
	{
		byte a = 10;
		short b = 5000;
		int c = 50000;
		long d = 500000;
		char e = 'A';
		float f = 12.2f;
		double g = 20.1;
		long trial = e;
		System.out.println(trial);
	}
	
}
