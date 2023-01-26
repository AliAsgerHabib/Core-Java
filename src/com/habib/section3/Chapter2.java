package com.habib.section3;

public class Chapter2 {

	public static void main(String[] args) {
		System.out.println("The size of byte is: " + Byte.SIZE / 8);
		System.out.println("The range of byte is: " + Byte.MIN_VALUE + " - " + Byte.MAX_VALUE);
		System.out.println();
		
		System.out.println("The size of short is: " + Short.SIZE / 8);
		System.out.println("The range of short is: " + Short.MIN_VALUE + " - " + Short.MAX_VALUE);
		System.out.println();
		
		System.out.println("The size of int is: " + Integer.SIZE / 8);
		System.out.println("The range of int is: " + Integer.MIN_VALUE + " - " + Integer.MAX_VALUE);
		System.out.println();
		
		System.out.println("The size of long is: " + Long.SIZE / 8);
		System.out.println("The range of long is: " + Long.MIN_VALUE + " - " + Long.MAX_VALUE);
		System.out.println();
		
		System.out.println("The size of float is: " + Float.SIZE / 8);
		System.out.println("The range of float is: " + Float.MIN_VALUE + " - " + Float.MAX_VALUE);
		System.out.println();	
		
		System.out.println("The size of double is: " + Double.SIZE / 8);
		System.out.println("The range of double is: " + Double.MIN_VALUE + " - " + Double.MAX_VALUE);
		System.out.println();
		
		System.out.println("The size of char is: " + Character.SIZE / 8);
		System.out.println("The range of char is: " + Character.MIN_VALUE + " - " + Character.MAX_VALUE);
		System.out.println("The range of char is: " + (int)Character.MIN_VALUE + " - " + (int)Character.MAX_VALUE);
		System.out.println();
		
		char myUnicode='\u0040';
		System.out.println(myUnicode);		

	}
}
