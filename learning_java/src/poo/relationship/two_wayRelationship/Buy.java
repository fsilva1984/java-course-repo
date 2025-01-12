package poo.relationship.two_wayRelationship;

import java.util.*;

public class Buy {

	private Client client;
	private List<Item> items = new ArrayList<>();

	public Client getClient() {
		return client;
	}

// define a qual cliente pertence essa compra
	public void setClient(Client client) {
		this.client = client;
	}

// mostra todos os itens da lista
	public void showItems() {
		items.forEach(System.out::println);
		;
	}

// adiciona intancias de item a lista da classe buy
	public void addItems(Item item) {
		items.add(item);
	}

	@Override
	public String toString() {
		return "Buy [client: " + client.getName() + "ssn: " + client.getSsn() + "]";
	}

	
}
