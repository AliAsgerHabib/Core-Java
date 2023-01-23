/*
 * Notes from chapter 2:
 * ======================
 * 
 * 1. There are 8 primitive data types:
 * 		Data Type	|	Size	|	Wrapper Class
 * 		------------------------------------------
 *  		boolean	| 	1 bit	| 	Boolean 
 *  		byte	| 	1 byte	| 	Byte
 *  		short	| 	2 byte	| 	Short
 *  		char	| 	2 byte	|	Character
 *  		int 	| 	4 byte	|	Integer
 *  		long	| 	8 byte	|	Long
 *  		float	| 	4 byte	|	Float
 *  		double	| 	8 byte	|	Double
 *  
 * 2. Underscores can be used to separate digits.
 *		Eg. 214_123_456
 * 
 * 3. Default Types:
 * ===================
 * > Whole Numbers -> int
 * > Floating Pt.  -> double
 * 
 * 4. An integer literal (ie. literal of type byte, short, char, int) shows an error if it is outside the range.
 * 	  Interestingly,
 * 		int a = 2147483647+1 ; causes overflow
 * 		but int a = 2147483648; gives error
 * 		This is because the literal 2147483647 is an integer literal and thus can be overflowed.
 * 		But 2147483648 is not an integer literal. 
 * 
 * 5. long literals should always be defined with lower case or upper case l at the end of the literal.
 *		Eg. 2147483648L
 * 
 * 6. float literals should always be defined with lower case or upper case f at the end of the literal or else they 
 * 	  would be considered as double.
 * 		Eg. 21.47f --> float
 * 	   		21.47  --> double
 * 
 * 7. It is highly recommended that we use double for floating point numbers as it is faster to process and double is 
 * 	  the default type for predefined methods and libraries.
 * 
 * 8. char is also a sub-type of int and thus is inter-convertible with (byte, short, int and long) if it is in 
 *    their respective ranges.
 * 
 * 9. To use a unicode for characters: 
 *  	Eg. char myUnicode='\u0040';
 *  
 * 10. The range of char is from 0-65535. Therefore, it cannot hold any negative values. It underflows if given 
 *     a negative value.
 *  
*/

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
		
		int a = 2147483647+1; // Works with overflow
		int b = 2147483648; // Shows errors
		
	}
}
