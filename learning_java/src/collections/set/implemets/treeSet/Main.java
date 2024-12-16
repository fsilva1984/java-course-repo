package collections.set.implemets.treeSet;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		/*
		 * A classe TreeSet implemetacao da inteface Set que por sua vez extendes de
		 * Collecction, traz uma maneira organizada na forma de estrututurar os dados em
		 * um conjunto
		 */
		TreeSet<Fruit> fruits = new TreeSet<>();

		Fruit manga = new Fruit("Manga");
		Fruit banana = new Fruit("Banana");
		Fruit laranja = new Fruit("Laranja");
		Fruit abacaxi = new Fruit("Abacaxi");
		Fruit caju = new Fruit("Caju");
		Fruit damasco = new Fruit("Damasco");

		fruits.add(damasco);
		fruits.add(caju);
		fruits.add(abacaxi);
		fruits.add(laranja);
		fruits.add(banana);
		fruits.add(manga);

		System.out.println(fruits.size());
		System.out.println(fruits);

		fruits.add(damasco);
		System.out.println(fruits.size());

		System.out.println(fruits.contains(banana));

		fruits.remove(caju);

		System.out.println(fruits);

		System.out.println(fruits.first());
		System.out.println(fruits.last());


	}

}
