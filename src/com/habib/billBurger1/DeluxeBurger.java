package com.habib.billBurger1;

public class DeluxeBurger extends Burger{
	private Item deluxe1;
	private Item deluxe2;

	public DeluxeBurger(String name, double price) {
		super(name, price);
	}

	@Override
	public String getName() {
		return super.getName() + " DELUXE";
	}

	@Override
	public double getExtraPrice(String toppingName) {
		return 0;
	}

	public void addToppings(String extra1, String extra2, String extra3, String deluxe1, String deluxe2) {
		// TODO Auto-generated method stub
		super.addToppings(extra1, extra2, extra3);
		this.deluxe1 = new Item(deluxe1, "TOPPING",getExtraPrice(deluxe1));
		this.deluxe2 = new Item(deluxe2, "TOPPING",getExtraPrice(deluxe2));
	}

	@Override
	public void printItemizedList() {
		super.printItemizedList();
		if(deluxe1 != null) deluxe1.printItem();
		if(deluxe2 != null) deluxe2.printItem();	
	}
	
}
