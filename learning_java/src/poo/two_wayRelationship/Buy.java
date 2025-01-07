package poo.two_wayRelationship;

import java.util.ArrayList;

public class Buy {
private Client client;

	// A lista que ira receber os itens da compra
	private ArrayList<Item> list = new ArrayList<>();

	// Metodo para adicionar itens a lista
	public void addItem(Item i) {
		list.add(i);
	}

	// Aqui nesse ponto relacionamos a compra ao cliente
	public void setClient() {
		client.setBuy(this);
	}

	public void sumPriceItens(Item i) {
		double total = 0.0;
		for(Item item : list) {
			total +=  item.getPrice() * item.getAmount();
		}
		System.out.println(total);
	}
	
	public void showItems() {
		list.forEach(System.out::println);
	}
}
