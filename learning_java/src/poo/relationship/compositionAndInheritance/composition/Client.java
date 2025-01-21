package poo.relationship.compositionAndInheritance.composition;

import java.util.ArrayList;

public class Client {
	/*
	 * Este cliente tem nome e um array de compras
	 */
	private String name;
	private ArrayList<Buy> myBuy = new ArrayList<>();

	public Client(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Client [name: " + name + ", Buy Lists" + myBuy + "]";
	}

	public void setMyBuy(Buy b) {
		myBuy.add(b);
	}

	public String getName() {
		return name;
	}
}
