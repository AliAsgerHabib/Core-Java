package com.habib.section9;

public class Chapter4 {

	public static void main(String[] args) {
/*		PART 1 : 
		==========*/
		print("Hello","World","Chess");
		System.out.println("* ".repeat(10));
		print(new String[]{"Hello","World","Chess"});
		
		
/*		PART 2 : 
		==========*/
		fun(true, false);
		fun(true);
//		fun(1,2,3,4,5); // Causes ambiguity (1 & 3).
//		fun(7); 		// Causes ambiguity (1 & 3).
		fun(1,2);		// Calls fun4 as it is given priority
//		fun(); 			// Causes ambiguity (1 & 2).
	}
	
	public static void print(String ... args)
	{
		for (String x : args) {
			System.out.println(x);
		}
	}
	
	
	// fun 1
	public static void fun(int ... args ) {
		System.out.println("Integers");
	}
	// fun 2
	public static void fun(boolean ... args ) {
		System.out.println("Boolean");
	}
	// fun 3
	public static void fun(int x, int ...is)
	{
		System.out.println("With args");
	}
	// fun 4
	public static void fun(int x, int y)
	{
		System.out.println("No Varargs");
	}
}
