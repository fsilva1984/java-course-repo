package collections.map.implementation.linkedHashMap;

public class Vehicle {
	private String model;
	private long AgeRelease;

	public Vehicle(String model, long ageRelease) {
		super();
		this.model = model;
		AgeRelease = ageRelease;
	}

	@Override
	public String toString() {
		return " [ model: " + model + ", AgeRelease: " + AgeRelease + " ]";
	}

}
