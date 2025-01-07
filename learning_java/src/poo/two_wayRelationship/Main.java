package poo.two_wayRelationship;

public class Main {

	public static void main(String[] args) {
		
		Client silva = new Client();
		Buy buySilva = new Buy();
		
		Item item1 = new Item("Jogo de Sofa", 2.800, 1);
		Item item2 = new Item("Jogo de Cama", 185.0, 2);
		Item item3 = new Item("SmartTv 32 pol.", 1.350, 2);
		Item item4 = new Item("Travesseiro", 26.0, 6);
		
		buySilva.addItem(item1);
		buySilva.addItem(item2);
		buySilva.addItem(item3);
		buySilva.addItem(item4);
	
		silva.myCart();
		

	}

}
