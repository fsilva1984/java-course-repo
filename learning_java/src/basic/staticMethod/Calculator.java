package basic.staticMethod;

public class Calculator {

	/*
	 * metodo statico que pertence a class. esse metodo por ser statico nao sera
	 * copiado pelas instancias da class
	 */
	static boolean resultZero(int t) {
		boolean result;
		if (t % 2 == 0)
			result = true;
		else
			result = false;
		return result;
	}
	
	// esse metodo publico sera instanciado pelos objetos da class
	public int sum(int n1, int n2) {
		return n1 + n2;
	}
	
//esse metodo publico sera instanciado pelos objetos da class
	public double div(double n1, double n2) {
		return n1 / n2;
	}
}
