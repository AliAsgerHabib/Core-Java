package com.habib.billBurger1;

public class Main {
	public static void main(String[] args) {
//		MealOrder m1 = new MealOrder();
////		m1.addBurgerToppings("CHEESE", "TIKKA", "MAYO");
////		m1.setDrinkSize("LARGE");
////		m1.printItemizedList();
//		
//		m1 = new MealOrder("Deluxe", "7-UP", "chili");
//		m1.addBurgerToppings("CHEESE", "TIKKA", "MAYO","Paneer","Paneer");
//		m1.setDrinkSize("SMALL");
//		m1.printItemizedList();
		
		DeluxeBurger b1 = new DeluxeBurger("Deluxe", 10);
		b1.printItem();
		System.out.println("\n\n");
		b1.addToppings("CHEESE", "CHEESE", "CHEESE","PAPAYA","CARAMEL");
		b1.printItem();

	}
}