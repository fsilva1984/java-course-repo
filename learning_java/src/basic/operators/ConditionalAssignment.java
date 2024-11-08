package basic.operators;

public class ConditionalAssignment {

	public static void main(String[] args) {
		// atribuicao condicional

		String name = "Silva";
		int age = 40;

		// ternario
		String andLegalAge = age >= 18.0 ? "Maio de idade" : "Menor de idade";

		System.out.println(andLegalAge);

		boolean firstLetter = name.startsWith("F") || name.startsWith("S");
		System.out.println(firstLetter);

		boolean userLogad = name == "Silva" && age == 40;
		System.out.println(userLogad);
	}

}
