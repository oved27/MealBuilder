package items;

import itemsPrototypes.Packing;

public class Coke extends ColdDrink{
	private String name;
	private float price;
	public Coke(){
		this.name="Coke drink";
		this.price=9;
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
