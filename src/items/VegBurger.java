package items;

import itemsPrototypes.Packing;

public class VegBurger extends Burger {
	private String name;
	private float price;
	public VegBurger(){
		this.name="Vegiterien Burger";
		this.price=22;
	}
	public float price(){
	      return price;
	   }

	public Packing packing(){
		return super.pack();
	}

	
	public String name() {
		return name;
	}

	


}
