package poo.relationship.compositionAndInheritance.inheritance;

public class Animal {
	private String type;
	private String eating;
	private int weight;
	private int numberOfLegs;

	public Animal(String type, String eating, int weight, int numberOfLegs) {
		this.type = type;
		this.eating = eating;
		this.weight = weight;
		this.numberOfLegs = numberOfLegs;
	}
	
	public String getType() {
		return type;
	}

	public String getEating() {
		return eating;
	}

	public int getWeight() {
		return weight;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	@Override
	public String toString() {
		return "Animal [type: " + type + ", eating: " + eating + ", weight: " + weight + ", number of legs: " + numberOfLegs
				+ "]";
	}

}
