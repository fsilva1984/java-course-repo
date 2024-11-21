package basic.staticMethod;

public class Main {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		Calculator calcSum = new Calculator();

		// utilizando um metodo statico atraveis de uma instacia
		System.out.println(calcSum.sum(12, 22));
		System.out.println(calcSum.resultZero(8));

		Calculator calcDiv = new Calculator();

		//utilizando um metodo statico atraveis de uma instacia
		System.out.println(calcDiv.div(32.26, 13.18));
		System.out.println(calcDiv.resultZero(82));

		// nao precisa ser instanciado para usar um metodo statico
		System.out.println(Calculator.resultZero(23));
	}

}
