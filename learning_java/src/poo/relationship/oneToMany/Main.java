package poo.relationship.oneToMany;

public class Main {

	public static void main(String[] args) {

		ShoppingCart cart = new ShoppingCart();

		Item item1 = new Item("Sofa 3 lugares", 1);
		Item item2 = new Item("Fogao 4 bocas", 1);
		Item item3 = new Item("Colchao solteiro", 2);
		Item item4 = new Item("Tv lg 42 pol.", 2);

		cart.addItem(item1);
		cart.addItem(item3);
		cart.addItem(item2);
		cart.addItem(item4);

		cart.showItems();
	}

}
