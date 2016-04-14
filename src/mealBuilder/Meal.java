package mealBuilder;
import items.ChickenBurger;
import items.VegBurger;
import itemsPrototypes.Item;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	
	List<Item> items = new ArrayList<Item>();
	
	
	private Meal (MealBuilder builder)
	{
		this.items=builder.getItems();
	}
	
	public void addItem(Item item)
	{
		items.add(item);
	}
	
	public float getCost()
	{
		float totalCost=0;
		
		for(Item tmp : items )
		{
			totalCost+=tmp.price();
		}
		return totalCost;
	}
	
	public void showItems()
	{
		for(Item tmp : items )
		{
			System.out.println("Product Name: "+tmp.name());
			System.out.println("Packing: "+tmp.packing().pack());
			System.out.println("Price: "+tmp.price());
		}
	}
	
	public static class MealBuilder
	{
		List<Item> items = new ArrayList<Item>();
		public MealBuilder getMeal(String mealType){
			if(mealType == null){
		         return null;
		      }	
			if(mealType.equalsIgnoreCase("VegBurger")){
				addItem(new VegBurger());
				return this;
				
			}
			else if(mealType.equalsIgnoreCase("Burger")){
				addItem(new ChickenBurger());
				return this;
			}
			return null;
		}
	
		public Meal build()
		{
			return new Meal(this);
		}
	
		public MealBuilder addItem(Item item)
		{
			items.add(item);
			return this;
		}

		public List<Item> getItems() {
			return items;
		}
		public void setItems(List<Item> items) {
			this.items = items;
		}
		
		
		
		
	}
	
	
	

}
