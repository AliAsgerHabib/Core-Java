package com.habib.section3;

@SuppressWarnings("unused")
public class Chapter2 {
	
	public static void part1()
	{
		int a = Integer.MAX_VALUE + 1; // integer + integer gives an integer.
//		int b = 2147483648; // Is not an integer
		
//	integer + integer gives an integer. But to assign an int to a byte, assignment narrowing takes place.:
//  Rules: 
//	1. Variable should be byte, short or char.	
//	2. Should be inside the range of the variable type.
// 		byte d = 127 + 1;
		byte e = 125 + 1;	
	}
	
	public static void main(String[] args) 
	{
		char myUnicode='\u0040';
		System.out.println(myUnicode);		
	}
}
