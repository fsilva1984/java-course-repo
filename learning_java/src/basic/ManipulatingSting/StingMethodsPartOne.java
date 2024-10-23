package basic.ManipulatingSting;

public class StingMethodsPartOne {

	public static void main(String[] args) {
		
		// metodos de string mas usados
		
		String o = new String("Ola");
		String s = "Silva";
		
		System.out.println(o + ", " + s ); // concatenando strings
		
		String m = "Monteiro";
		m = m + " ".concat(s); // metodo concat
		
		System.out.println(m);

		String city = "Rio de Janeiro";
		System.out.println(city);
		
		city = city.toUpperCase();
		System.out.println(city);
		
		
		System.out.println(city.startsWith("Rio"));
		
		System.out.println(city.endsWith("Rio"));
		
		System.out.println("'" + city.charAt(7) + "'");

		System.out.println(city.length());
		
		System.out.println(city.equalsIgnoreCase(s));
		
		System.out.println(city.contains("DE"));
		
		
	}

}
