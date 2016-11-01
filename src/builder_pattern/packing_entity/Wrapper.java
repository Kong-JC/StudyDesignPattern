package builder_pattern.packing_entity;

import builder_pattern.interface_.Packing;

public class Wrapper implements Packing {

	public String packing() {
		return "Wrapper";
	}

}
