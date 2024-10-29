package basic.primitivesAndObjects;

public class PrimitiveAndObject {

	public static void main(String[] args) {

		// primitivos vs objetos

		/*
		 * primitivos não possuem metodos ah não ser que use o wrapper,
		 * 
		 */
		int i = 32;

		// objetos podem posuir diversos metodos
		String s = "Hello, World";

		System.out.println(i);

		System.out.println(s.toUpperCase());
		System.out.println(s.concat("!"));

	}

}
