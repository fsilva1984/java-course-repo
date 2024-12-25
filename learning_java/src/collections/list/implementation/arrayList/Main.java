package collections.list.implementation.arrayList;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		/*
		 * Descrição: ArrayList é uma implementação de lista baseada em array. Ela
		 * permite acesso rápido aos elementos por índice, mas pode ser menos eficiente
		 * para operações de inserção e remoção no meio da lista. Uso Comum: Utilizado
		 * quando há necessidade de acesso rápido aos elementos e quando as operações de
		 * inserção e remoção são menos frequentes.
		 */
		User u1 = new User("Marcos");
		User u2 = new User("Lucas");
		User u3 = new User("Mateus");
		User u4 = new User("Paulo");
		User u5 = new User("João");
		List<User> users = new ArrayList<>();
		
		users.add(u1);
		users.add(u2);
		users.add(u3);
		users.add(u4);
		users.add(u5);
		users.add(u1);// aceita objetos duplicados
		
		int i = 0;
		for(User u : users) {
			System.out.println( i + " - ".concat(u.getName()));
			i++;
		}
	}

}
