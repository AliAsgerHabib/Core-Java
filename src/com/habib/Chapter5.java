package com.habib;

public class Chapter5 {

	public static void main(String[] args) {
		
		int a = 10;
		boolean check = false;
		if(check && a++ > 2)
			System.out.println(a);
		System.out.println(a);
		
		check = true;
		if(check || a++ > 2)
			System.out.println(a);
		System.out.println(a);
	}

}
