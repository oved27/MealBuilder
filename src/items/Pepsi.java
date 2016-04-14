package items;

import itemsPrototypes.Packing;

public class Pepsi extends ColdDrink{
	private String name;
	private float price;
	public Pepsi(){
		this.name="Pepsi drink";
		this.price=5;
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
