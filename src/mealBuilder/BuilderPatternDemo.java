package mealBuilder;

import items.Burger;
import items.ChickenBurger;
import items.Coke;
import items.Pepsi;

public class BuilderPatternDemo {

	public static void main(String[] args) {

				Coke cola= new Coke();
				Pepsi pep= new Pepsi();
				Burger beefBurger = new ChickenBurger ();
				
				Meal newMeal= new Meal.MealBuilder().getMeal("VegBurger").addItem(beefBurger).build();
				newMeal.showItems();


	}

}
