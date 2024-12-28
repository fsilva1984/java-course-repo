package collections.list.implementation.linkedList;

public class Car {

	private String modelo;
	private int ano;

	public Car(String modelo, int ano) {
		super();
		this.modelo = modelo;
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public int getAno() {
		return ano;
	}

	@Override
	public String toString() {
		return "Car [ modelo = " + modelo + ", ano = " + ano + " ]\n";
	}

}
