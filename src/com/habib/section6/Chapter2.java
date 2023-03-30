package com.habib.section6;

@SuppressWarnings("unused")
public class Chapter2 {
	
	public static void part1(int i)	// Set i = 1 | 2 | 3
	{
		l1:
		{
			System.out.println("Inside 1");
		}
		l2:
		{
			System.out.println("Before 2");
			l3:
			{
				System.out.println("Before 3");
//				if(i == 1) break l1; // Cannot break to l1 as it is does not enclose the break statement
				if(i == 2) break l2; // Breaks out of the block of code labeled b2
				else if(i == 3) break l3; // Breaks out of the block of code labeled b3
				System.out.println("After 3");
			}
			System.out.println("After 2");
		}
		System.out.println("Always executes");
	}
	
	public static void part2(int check) // Set check = 1 | 2 | 3 | 4
	{
		System.out.println("Before the i loop");
		ol:
		for(int i = 0 ; i < 4; i++)ola:
		{
			System.out.println("Before the j loop");
			il:
			for(int j = 0; j < 4; j++)ila:
			{
				System.out.println("Before the break --- " + i + j);
				if (check == 1 && j == 2) break ol;
				else if (check == 2 && j == 2) break il;
				else if (check == 3 && j == 2) break ila; // Point No 3. 
				else if (check == 4 && j == 2) break ola; // Point No 3.
				System.out.println("After the break --- " + i + j);
			}
			System.out.println("After the j loop");
		}
		System.out.println("After the i loop");
	}

	public static void part3(char check) // Set check = x | y
	{
		x:
		for(int i = 0; i < 5 ; i++)
		{
			y:
			for (int j = 0; j < 5 ; j++)
			{
				if(j == 2 && check == 'x') continue x;
				else if (j == 2 && check == 'y') continue y;
				System.out.print(i + ":" + j + " ");
			}
			System.out.println("\n end of i loop");
		}
	}	

}
