package com.habib.billBurger1;

public class MealOrder {
	private Burger burger;
	private Item drink;
	private Item side;
	
	public MealOrder()
	{
		this("regular", "coke", "fries");
	}
	
	public MealOrder(String burger, String drink, String side)
	{
		if(burger.equalsIgnoreCase("deluxe"))
			this.burger = new DeluxeBurger(burger, 10);
		else
			this.burger = new Burger(burger, 4.0);
		
		this.drink = new Item(drink, "drink", 1.0);
		this.side = new Item(side, "side", 1.50);
	}
	
	public double getTotalPrice()
	{
		if(burger instanceof DeluxeBurger) return burger.getAdjustedPrice();
		return side.getAdjustedPrice() + burger.getAdjustedPrice() + drink.getAdjustedPrice();
	}
	
	public void printItemizedList()
	{
		burger.printItem();
		drink.printItem();
		side.printItem();
		System.out.println("=".repeat(40));
		Item.printItem("TOTAL PRICE", getTotalPrice());
	}
	
	public void addBurgerToppings(String t1,String t2, String t3,String t4, String t5)
	{
		if(burger instanceof DeluxeBurger db)
			db.addToppings(t1, t2, t3,t4,t5);
		burger.addToppings(t1, t2, t3);
	}
	
	public void addBurgerToppings(String t1,String t2, String t3)
	{
		if(burger instanceof DeluxeBurger db)
			db.addToppings(t1, t2, t3,null,null);
		burger.addToppings(t1, t2, t3);
	}
	
	public void setDrinkSize(String size)
	{
		drink.setSize(size);
	}
}
