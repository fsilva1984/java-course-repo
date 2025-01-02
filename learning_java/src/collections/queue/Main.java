package collections.queue;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		User u1 = new User("Marcos", 237856);
		User u2 = new User("Lucas", 237853);
		User u3 = new User("Julia", 237890);
		User u4 = new User("Anna", 237887);
		User u5 = new User("Monike", 237862);

		Queue<User> fila = new LinkedList<>();

		fila.offer(u1);
		fila.offer(u3);
		fila.offer(u5);
		fila.offer(u4);
		fila.offer(u2);

		System.out.println(fila.peek());
		System.out.println(fila.size());
		System.out.println(fila.isEmpty());

		fila.forEach(System.out::println);

		System.out.println("");

		Browser visitedSites = new Browser();

		visitedSites.dataCache("www.google.com");
		visitedSites.dataCache("www.microsoft.com");
		visitedSites.dataCache("www.youtube.com");
		visitedSites.dataCache("www.google.com");
		visitedSites.dataCache("www.yahoo.com");
		visitedSites.dataCache("www.youtube.com");
		visitedSites.dataCache("www.examle.com");

		visitedSites.showDataCache();

	}

}
