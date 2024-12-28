package collections.list.implementation.CopyOnWriteArrayList;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Cria uma instância de CopyOnWriteArrayList
		List<String> list = new CopyOnWriteArrayList<>();

		// Adiciona elementos à lista
		list.add("Elemento 1");
		list.add("Elemento 2");
		list.add("Elemento 3");

		// Itera sobre a lista
		for (String element : list) {
			System.out.println(element);
		}

		// Modifica a lista
		list.set(1, "Elemento Modificado");

		// Itera novamente para ver a modificação
		for (String element : list) {
			System.out.println(element);
		}
	}

}
