package primeNumbers;

class TestPrime {
	boolean b;

	/* O algoritimo basea-se no Crivo de números primos do matemático Eratóstenes */
	boolean isPrime(int n) {

		if (n <= 1) {
			b = false;
		} else if (n <= 3) {
			b = true;
		} else if (n % 2 == 0 || n % 3 == 0) {
			b = false;
		} else if (n % 5 != 0 || n % 7 != 0) {
			b = true;
		} else if (n % 5 == 0 || n % 7 == 0) {
			b = false;
		}
		return b;
	}
}

public class Main {

	public static void main(String[] args) {

		TestPrime tp = new TestPrime();

		System.out.println(tp.isPrime(48));
		System.out.println(tp.isPrime(71));
		System.out.println(tp.isPrime(8));
		System.out.println(tp.isPrime(2));

	}

}
