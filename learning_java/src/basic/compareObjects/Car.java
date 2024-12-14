package basic.compareObjects;

public class Car {

	private String mod;
	private String color;
	
	private int release;

	public Car(String mod, String color, int release) {
		super();
		this.mod = mod;
		this.color = color;
		this.release = release;
	}

	public String getMod() {
		return mod;
	}

	public String getColor() {
		return color;
	}

	public int getRelease() {
		return release;
	}
	
	
}
