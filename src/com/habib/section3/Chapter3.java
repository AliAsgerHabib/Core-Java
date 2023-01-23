/*
 * Notes from chapter 3:
 * ======================
 * 
 * Implicit Type Conversion of byte, char and short to int:
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * byte, short and char are automatically converted to int when used in an arithmetic or bitwise expression.
 * Implicit Conversion does not work for relational expression. 
 * Does not work for increment / decrement operator.
 * Does not work for compound assignment.
 * Eg. look in part1()
 * 
 * Implicit Type Conversion happens:
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 *  > boolean	-> Not possible
 *  > byte		-> short , char , int , long , float , double
 *  > short 	-> int , long , float , double
 *  > char		-> int , long , float , double
 *  > int		-> long , float , double
 *  > long		-> float , double
 *  > float		-> double
 *  > double	-> Not possible
 *  
*/

package com.habib.section3;

public class Chapter3 {
	
	public static void part1() {
		byte a = 20 , b = 30;
//		byte c = a + b; Error
		short d = 25;
		short f=d++;
		d+=a;
	}
	
	public static void main(String[] args) 
	{
		byte a=10;
		short b=5000;
		int c=50000;
		long d=500000;
		char e = 'A';
		float f=12.2f;
		double g=20.1;
		float trial=d;
		System.out.println(trial);
	}

}
