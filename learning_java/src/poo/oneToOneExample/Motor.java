package poo.oneToOneExample;

public class Motor {
	private int inject = 1;
	private int rpm = 0;

	/*
	 * se o carro der a partida o motor recebe um factor de injecao, 30 e a rotacao
	 * do motor que sera retornado pelo metodo
	 */
	public int starting(boolean connected) {
		if (connected) {
			rpm = inject * 30;
		}
		return rpm;
	}

	/*
	 * o metodo recebe um inteiro
	 */
	public int mileage(int accelerate) {
		rpm = accelerate * 30;
		int speed = (rpm * 10) / 100;
		return speed;
	}

}
