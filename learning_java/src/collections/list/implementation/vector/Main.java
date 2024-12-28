package collections.list.implementation.vector;

import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		// Cria uma instância de Vector
		Vector<String> vector = new Vector<>();

		// Adiciona elementos ao Vector
		vector.add("Elemento 1");
		vector.add("Elemento 2");
		vector.add("Elemento 3");

		// Itera sobre o Vector
		for (String element : vector) {
			System.out.println(element);
		}

		// Modifica o Vector
		vector.set(1, "Elemento Modificado");

		// Itera novamente para ver a modificação
		for (String element : vector) {
			System.out.println(element);
		}
		
		System.out.println("");

		/*
		 * Ao criar um Vector, você pode especificar a capacidade inicial e o incremento
		 * de capacidade
		 */
		Vector<String> vector2 = new Vector<>(3, 5); // Capacidade inicial de 3, incremento de 5

		 vector2.add("elemento - 1");
		 vector2.add("elemento - 2");
		 vector2.add("elemento - 3");
		 vector2.add("elemento - 4 >> aumentou a capacidade");
		 vector2.add("elemento - 5 >> capacidade maxima ");
		 
			for (String element : vector2) {
				System.out.println(element);
			}
	}

}
