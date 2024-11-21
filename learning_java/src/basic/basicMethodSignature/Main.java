package basic.basicMethodSignature;

public class Main {
	public static void main(String[] args) {
		/*
		 * apenas pelos parametros o compilador sabe qual metodo esta sendo invocado
		 */
		Calc calculator = new Calc();

		System.out.println(calculator.calc(32, 23));

		System.out.println(calculator.calc(32.2, 23.8));
	}
}
