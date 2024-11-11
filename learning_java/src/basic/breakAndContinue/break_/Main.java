package basic.breakAndContinue.break_;

public class Main {

	public static void main(String[] args) {

		/*
		 * O algoritimo de iteracao sobre a lista diz que quando um numero divisivel por
		 * dois tiver um resultado diferente de zero, o loop deve ser interrompido
		 */
		int[] numbersList = { 12, 37, 42, 15, 18, 93, 14, 105 };
		int i = 0;
		while (numbersList.length - 1 > i) {
			if (numbersList[i] % 2 != 0)
				break;
			System.out.println(numbersList[i]);
			i++;
		}
	}
	/*
	 * como se persebe foi imprimido no console apenas o primeiro valor da lista
	 * porque o segundo valor da lista e um numero impar
	 */
}
