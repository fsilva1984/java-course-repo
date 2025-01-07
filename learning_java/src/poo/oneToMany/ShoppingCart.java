package poo.oneToMany;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
	private List<Item> list = new ArrayList<>();

	public void addItem(Item i) {
		list.add(i);
	}

	public void showItems() {
		list.forEach(System.out::println);
	}
	
	
}
