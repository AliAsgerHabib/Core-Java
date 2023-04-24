package com.habib.section7.chapter4;

public record Student(String name, int age, int standard, String dateOfBirth) {
	
	private static boolean isHuman = true; // Static fields can be created.
	
	void print() {	// Methods can be created.
		System.out.println("%s is %d years old.".formatted(name, age));
	}
	
	public String toString() // hashCode(), equals() and toString() methods can be overriden.
	{
		return "This is a record for Student.";
	}
	
//	public Student(String name, int age, int standard, String dateOfBirth) // Overriden the canonical constructor.
//	{
//		this.name = name + "Ali";	// Values need to be assigned to all the fields.
//		this.age = age;
//		this.standard = standard;
//		this.dateOfBirth = dateOfBirth;
//		System.out.println("Hello World");
//	}
	
	public Student{	// Created a compact constructor.
		print();
		age+= 10;
		System.out.println(age);
		if(age > 30 ) age = -1;
		print();
	}
	
	public Student(String name, int age)	// Custom constructor.
	{
		this(name, age, 10, "1-1-2000");	// Call to the canonical constructor.
	}
	
	
}
