package basic.ManipulatingSting;

public class StringMethodsPartTwo {

	public static void main(String[] args) {
		// formatacoes de sting

		String name = "Moraes";

		System.out.printf("nome: " + name + ", sobrenome: " + "Silva");

		String personInfo = "\nnome: " + name + "\nsobrenome: " + "Silva";

		System.out.println("\n" + personInfo + "\nidade: 35");

		String lastname = "Silva";
		int age = 35;
		double salary = 6813.45;
		boolean holiday = false;

		String formattedInfo = String.format(
				"\nName: %s \nLastname: %s \nAge: %d \nSalary: %.2f \nStatus Holiday: %b",
				name, lastname, age, salary, holiday
				);

		System.out.println(formattedInfo);

	}

}
