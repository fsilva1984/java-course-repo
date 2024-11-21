package basic.testes.steam.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		User usr1 = new User("Mateus", 213);

		User usr2 = new User("Marcos", 223);
		User usr3 = new User("Lucas", 1114);
		User usr4 = new User("Pedro", 321);
		User usr5 = new User("Ester", 416);

		List<User> users = Arrays.asList(usr1, usr2, usr3, usr4, usr5);

		// iterando com um for normal

		System.out.println("\n-------------------- For Loop ------------------");
		for (User u : users) {
			String msg = String.format("Name: %s Score: %d", u.getName(), u.getScore());
			System.out.println(msg);
		}

		System.out.println("\n-------------------- ForEach ------------------");
		ShowName showName = new ShowName();
		users.forEach(showName);

		System.out.println("\n-------------------- Expresion Lambda ------------------");
		/*
		 * implementando uma inteface consumer para criar um metodo que
		 */
		Consumer<User> printName = name -> System.out.println(name);
		users.forEach(printName);

		System.out.println("\n-------------------- Referencia ------------------");

		users.forEach(System.out::println);
		// OU
		// users.stream().forEach(System.out::println);
	}

}
