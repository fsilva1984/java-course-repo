package arrays.declarationOfArray;

import java.util.Arrays;

public class Numbers {
	private int[] numbers = new int[6];

	// metodo para adicionar um numero ao array passando um  indice
	public void setNumbers(int i, int n) {
		numbers[i] = n;
	}

	// metodo que soma todo o array
	public int sumAll() {
		int total = 0;
		for (int n : numbers) {
			total += n;
		}
		return total;
	}

	@Override
	public String toString() {
		return "Numbers " + Arrays.toString(numbers);
	}

}
