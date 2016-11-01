package builder_pattern.foodstuff_abstract;

import builder_pattern.interface_.Item;
import builder_pattern.interface_.Packing;
import builder_pattern.packing_entity.Wrapper;

public abstract class Burger implements Item {

	public String name() {
		return null;
	}

	public Packing packing() {
		return new Wrapper();
	}

	public float price() {
		return 0;
	}

}
