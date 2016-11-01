package builder_pattern;

/**
 * 建造者模式
 * 
 * @author Kong
 * 
 */
public class BuilderPatternDemo {

	public static void main(String[] args) {

		MealBuilder mealBuilder = new MealBuilder();

		Meal vegMeal = mealBuilder.prepareVegMeal();
		System.out.println("VegMeal");
		vegMeal.showItem();
		System.out.println("Cost: " + vegMeal.getCost());

		Meal notVegMeal = mealBuilder.prepareNotVegMeal();
		System.out.println("\n\nNotVegMeal");
		notVegMeal.showItem();
		System.out.println("Cost: " + notVegMeal.getCost());

		Meal CCM = mealBuilder.prepareChickenCokeMeal();
		System.out.println("\n\nChickenCoke");
		CCM.showItem();
		System.out.println("Cost: " + CCM.getCost());

	}

}
