package com.habib.section6;

@SuppressWarnings("unused")
public class Chapter1 {
	
	public static void part1()
	{
		final int var = 3;
		int a = 2, b = 25;
		
		switch(a)
		{
		case 1 : System.out.println("One"); break; 			// Works for a literal
		case 1 + 1  : System.out.println("Two"); break; 	// Works for a constant expression
		case var : System.out.println("Three"); break; 		// Works for final variable
//		case 2 : System.out.println("Pair"); break; 		// Does not work for duplicate values
//		case "Sherlock" : System.out.println("Pair"); break;// Type incompatible
		}
	}
	
	public static void part2()
	{
		String day = "Wednesday";

		double dayNumber = 
			switch(day)
		{
		case "Monday" -> 1.2; 
		case "Tuesday" , "tuesday" -> 2;
		case "Wednesday"-> 
			{
				System.out.println("I will eat an egg today");
				yield 3;
			}
//		case "Thursday -> yield 4; // Error : yield works only in a code block
		case "Thursday"-> 
			{
				yield 4;
			}
		default -> -1;
		};
				
		System.out.println(dayNumber);
	}
}
