package collections.generics.diamond;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		/*
		 * Antes do operador diamante, a instanciação de uma classe genérica exigia a
		 * repetição dos tipos genéricos. Com o operador diamante, a declaração pode ser
		 * simplificada: O operador diamante permite que o compilador infira os tipos
		 * genéricos a partir do contexto em que o objeto está sendo instanciado
		 */

		// Antes do operador diamante
		List<String> listaAntiga = new ArrayList<String>();
		listaAntiga.add("Java");
		listaAntiga.add("Python");

		// Com o operador diamante
		List<String> listaNova = new ArrayList<>();
		listaNova.add("Java");
		listaNova.add("Python");

		// Imprimindo as listas
		System.out.println("Lista Antiga: " + listaAntiga);
		System.out.println("Lista Nova: " + listaNova);
	}
}
