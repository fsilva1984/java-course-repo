package collections.set.implemets.treeSet;

public class Fruit implements Comparable<Fruit> {
	private String fruit;

	public Fruit(String fruit) {
		super();
		this.fruit = fruit;
	}

	public String getFruit() {
		return fruit;
	}

	@Override
	public int compareTo(Fruit o) {
		return this.fruit.compareTo(o.fruit);
	}

	@Override
	public String toString() {
		return  fruit + " \n";
	}
	
	

}
