package poo.relationship.two_wayRelationship;

import java.util.*;

public class Client {
	private long ssn;
	private String name;
	private List<Buy> myPurchases = new ArrayList<>();

	public Client(String name, long ssn) {
		this.name = name;
		this.ssn = ssn;
	}

// retorna o ssn do cliente
	public long getSsn() {
		return ssn;
	}
// retorna o nome do cliente
	public String getName() {
		return name;
	}
// adiciona intancias de buy a lista
	public void addPurchases(Buy b) {
		myPurchases.add(b);
	}
// mostra todas as instancias de buy que estao na lista
	public void showPurchases() {
		myPurchases.forEach(System.out::println);
	}

	@Override
	public String toString() {
		return "Client [ssn: " + ssn + ", name: " + name + ", myPurchases: " + myPurchases + "]";
	}
	
	
}
