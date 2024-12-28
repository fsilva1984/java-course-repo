package collections.map.implementation.treeMap;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		User u1 = new User("Joao", 34);
		User u2 = new User("Marcelo", 32);
		User u3 = new User("Silvia", 45);
		User u4 = new User("JMarta", 34);
		User u5 = new User("Pedro", 30);
		User u6 = new User("JGabriel", 28);
		Map<Integer, User> db = new TreeMap<>();
		
		db.put(3456, u6);
		db.put(3452, u2);
		db.put(3454, u4);
		db.put(3453, u3);
		db.put(3451, u1);
		db.put(3455, u5);
		
		for(Map.Entry<Integer, User> entry : db.entrySet()) {
			System.out.println("key: " + entry.getKey() + " | " +  entry.getValue());
		}
	}

}
