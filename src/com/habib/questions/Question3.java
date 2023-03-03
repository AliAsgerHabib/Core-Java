package com.habib.questions;
/*
 * Write a program to print the diagonals of a square.
 * For eg: For printSquareStar(8): 
 * >>	********
 * >>	**    **
 * >>	* *  * *
 * >>	*  **  *
 * >>	*  **  *
 * >>	* *  * *
 * >>	**    **
 * >>	********
 * 
 * Print Invalid Input for values less than 5
*/
public class Question3 {
	
	public static void printSquareStar(int number)
	{
		 if(number < 5 )
		 {
			 System.out.println("Invalid Value");
			 return;
		 }

		 for(int i = 0 ; i < number ;  i++)
		 {
			 for (int j= 0; j < number ; j++)
				 if (i == j || i == 0 || j ==0 || i == number - 1 || j == number - 1 || i + j == number - 1) {
					System.out.print("*");
				}
				 else System.out.print(" ");
			 System.out.println();
		 } 
	}
}
