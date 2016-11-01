package builder_pattern.foodstuff_entity;

import builder_pattern.foodstuff_abstract.Burger;

public class ChickenBurger extends Burger {

	@Override
	public String name() {
		return "ChickenBurger";
	}
	
	@Override
	public float price() {
		return 50.5f;
	}
	
}
