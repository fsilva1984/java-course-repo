package poo.relationship.two_wayRelationship;

public class Main {

	public static void main(String[] args) {
		
		Client silva = new Client("Silva", 10161950442L);
		Buy buySilva = new Buy();
		
		Item item1 = new Item("Jogo de Sofa", 2.800, 1);
		Item item2 = new Item("Jogo de Cama", 185.0, 2);
		Item item3 = new Item("SmartTv 32 pol.", 1.350, 2);
		Item item4 = new Item("Travesseiro", 26.0, 6);
		
		buySilva.addItems(item1);
		buySilva.addItems(item2);
		buySilva.addItems(item3);
		buySilva.addItems(item4);
		
		buySilva.setClient(silva);
		
		silva.addPurchases(buySilva);
		
		
		
		System.out.println(buySilva.getClient());
		buySilva.showItems();
		
	}

}
