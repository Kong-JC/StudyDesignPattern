package builder_pattern.foodstuff_abstract;

import builder_pattern.interface_.Item;
import builder_pattern.interface_.Packing;
import builder_pattern.packing_entity.Bottle;

public abstract class ColdDrink implements Item {

	public String name() {
		return null;
	}

	public Packing packing() {
		return new Bottle();
	}

	public float price() {
		return 0;
	}

}
