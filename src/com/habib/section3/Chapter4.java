package com.habib.section3;

@SuppressWarnings("unused")
public class Chapter4 {
	
	public static void main(String[] args) {
		String myString = "Hello";
		String myString2 = "Hello";
		String myString3 = new String(myString);
		String myString4 = myString;
		char[] charArray = {'H','e','l','l','o'};
		String myString5 = new String(charArray);
		String myString6 = new String("Hello");
		
		if(myString == myString6)
			System.out.println("Equal");
		else 
			System.out.println("Not Equal");
		
		if(myString.equals(myString3))
			System.out.println("Equal");
		else 
			System.out.println("Not Equal");
		
		if(myString.contentEquals(myString5))
			System.out.println("Equal");
		else 
			System.out.println("Not Equal");
	}
}

