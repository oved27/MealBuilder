package mealBuilder;

import items.ChickenBurger;
import items.Coke;
import items.Pepsi;
import items.VegBurger;

public class MealBuilder {
	public Meal prepareVegMeal(){
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
	    return meal;
	}
	public Meal prepareNonVegMeal(){
		Meal meal=new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}

}
