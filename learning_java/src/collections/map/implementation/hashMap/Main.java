package collections.map.implementation.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		// Criação de um HashMap
		Map<String, Integer> map = new HashMap<>();

		// Inserção de pares chave-valor
		map.put("Alice", 25);
		map.put("Bob", 30);
		map.put("Charlie", 35);

		// Acesso a valores
		System.out.println("Idade de Alice: " + map.get("Alice"));

		// Verificação de existência de chave
		System.out.println("Contém Bob? " + map.containsKey("Bob"));

		// Remoção de um par chave-valor
		map.remove("Charlie");

		// Iteração sobre o mapa
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		// Tamanho do mapa
		System.out.println("Tamanho do mapa: " + map.size());

		// Verificação se o mapa está vazio
		System.out.println("O mapa está vazio? " + map.isEmpty());

		// Limpeza do mapa
		map.clear();
		System.out.println("O mapa está vazio após limpeza? " + map.isEmpty());

	}

}
