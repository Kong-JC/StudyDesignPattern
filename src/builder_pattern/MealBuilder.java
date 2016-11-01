package builder_pattern;

import builder_pattern.foodstuff_entity.ChickenBurger;
import builder_pattern.foodstuff_entity.Coke;
import builder_pattern.foodstuff_entity.Pepsi;
import builder_pattern.foodstuff_entity.VegBurger;

public class MealBuilder {

	public Meal prepareVegMeal(){
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());	
		return meal;
	}
	
	public Meal prepareNotVegMeal(){
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
	
	public Meal prepareChickenCokeMeal(){
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Coke());
		return meal;
	}
	
}
