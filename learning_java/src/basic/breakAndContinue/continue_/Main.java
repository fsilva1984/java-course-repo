package basic.breakAndContinue.continue_;

public class Main {

	public static void main(String[] args) {
		int[] numbersList = { 12, 37, 42, 15, 18, 93, 14, 105 };
		int i = 0;
		for (; i < numbersList.length - 1; i++) {
			if (numbersList[i] % 2 != 0)
				continue;
			System.out.println(numbersList[i]);
		}
		/*
		 * como se percebe apenas os numeros pares foram impressos conforme a logica do
		 * algoritimo, a cada iteracao ao chegar em um numero impar continue passa para
		 * a proxima ordem de execucao.
		 */
	}

}
