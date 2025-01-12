package poo.relationship.oneToMany;

public class Item {
	private String name;
	private int amount;

	public Item(String name, int amount) {
		super();
		this.name = name;
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public int getAmount() {
		return amount;
	}

	@Override
	public String toString() {
		return "Product [name: " + name + ", amount: " + amount + "]";
	}

}
