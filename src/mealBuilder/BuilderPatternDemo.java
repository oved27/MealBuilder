package mealBuilder;

import items.Burger;
import items.ChickenBurger;
import items.Coke;
import items.Pepsi;

public class BuilderPatternDemo {

	public static void main(String[] args) {

		MealBuilder mealBuilder=new MealBuilder();
		Meal vegMeal=mealBuilder.prepareVegMeal();
		System.out.println("vegiterien meal");
		vegMeal.showItems();
		System.out.println("Meal cost is: " + vegMeal.totalCost());
		
		Meal nonMeal=mealBuilder.prepareNonVegMeal();
		System.out.println("Non vegiterien meal");
		nonMeal.showItems();
		System.out.println("Meal cost is: " + nonMeal.totalCost());
		

	}

}
