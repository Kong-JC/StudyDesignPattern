package builder_pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import builder_pattern.interface_.Item;

public class Meal {

	private List<Item> items = new ArrayList<Item>();

	public void addItem(Item item) {
		items.add(item);
	}

	public float getCost() {
		float cost = 0.0f;
		for (Item item : items) {
			cost += item.price();
		}
		return cost;
	}

	public void showItem() {
		for (Item item : items) {
			System.out.print("name: " + item.name());
			System.out.print(", packing: " + item.packing().packing());
			System.out.println(", price : " + item.price());
		}
	}

}
