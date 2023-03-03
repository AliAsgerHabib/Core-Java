package com.habib.questions;
/*
 * Write a method named getLargestPrime with one parameter of type int named number. 
 * If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid 
 * value.
 * The method should calculate the largest prime factor of a given number and return it.
*/

public class Question2 {
	
	public static int getLargestPrime(int number)
	{
		 if(number < 2 ) return -1;
		 
		 int i = 2;
		 while (i <= number / 2)
		 {
			 if(number % i == 0)
			 {
				 number /= i;
				 continue;
			 }
			 i++;
		 }
		 return number;
	}
}
