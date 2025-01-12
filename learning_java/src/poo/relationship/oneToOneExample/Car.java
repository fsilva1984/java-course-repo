package poo.relationship.oneToOneExample;

public class Car {
	private int factor = 0;
	private boolean connected = false;

	// ligar o carro
	public boolean start() {
		connected = true;
		return connected;
	}

	// injecao de combustivel no motor
	public int accelerate() {
		if (connected)
			factor += 1;
		return factor;
	}

}
