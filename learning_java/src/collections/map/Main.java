package collections.map;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		User u1 = new User("Roberto", 36);
		User u2 = new User("Marcelo", 42);
		User u3 = new User("Julia", 23);
		User u4 = new User("Ingredi", 32);
		User u5 = new User("Anna", 25);
		User u6 = new User("Fabio", 35);

		Map<Integer, User> db = new HashMap<>();

		db.put(2345, u1);// adicionando um par de chave-valor
		db.put(2346, u2);
		db.put(2347, u3);
		db.put(2348, u4);
		db.put(2349, u5);
		db.put(2350, u6);

		int key = 2347;
		System.out.println("key: " + key + " object: " + db.get(key));

		for (Map.Entry<Integer, User> entry : db.entrySet()) {
			System.out.println("Key - " + entry.getKey() + " value - " + entry.getValue());
		}

		System.out.println("");

		if (!db.isEmpty()) {
			for (Map.Entry<Integer, User> entry : db.entrySet()) {
				System.out.println(entry.getValue().getName());
			}

		}

	}

}
