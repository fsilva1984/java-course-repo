package poo.relationship.two_wayRelationship;

public class Item {

	private int amount;
	private String name;
	private double price;
	private Buy buy;

	// controi uma instancia do item
	public Item(String name, double price, int amount) {
		this.name = name;
		this.price = price;
		this.amount = amount;
	}

	// relaciona a instancia de item com a instancia de buy
	public Buy getBuy() {
		return buy;
	}
	// relaciona a instancia com a class Buy

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
