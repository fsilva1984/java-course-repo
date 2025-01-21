package poo.relationship.compositionAndInheritance.composition;

import java.util.ArrayList;

public class Buy {

	/* a class compras tem uma lista de produtos que serao adicionados */
	private Client client;
	private ArrayList<Product> products = new ArrayList<>();

	public Buy(Client client) {
		super();
		this.client = client;
	}

	public void addProducts(Product p) {
		products.add(p);
	}

	@Override
	public String toString() {
		return "Buy [client: " + client.getName() + ", Products list: " + products + "]";
	}

	public String getClient() {
		return client.getName();
	}


}
