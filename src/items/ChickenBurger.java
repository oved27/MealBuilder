package items;

import itemsPrototypes.Packing;

public class ChickenBurger extends Burger {
	private String name;
	private float price;
	public ChickenBurger(){
		this.name="Chicken Burger";
		this.price=22;
	}

	public Packing packing(){
		return super.pack();
	}

	
	public String name() {
		return name;
	}

	
	public float price() {
		return price;
	}

}
