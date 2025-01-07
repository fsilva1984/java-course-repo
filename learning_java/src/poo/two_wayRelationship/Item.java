package poo.two_wayRelationship;

public class Item {
	private int amount;
	private String name;
	private double price;

	public Item(String name, double price, int amount) {
		this.name = name;
		this.price = price;
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Product [name: " + name + ", price: " + price + ", amount: " + amount + "]";
	}

}
