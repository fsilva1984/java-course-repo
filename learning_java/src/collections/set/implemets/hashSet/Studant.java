package collections.set.implemets.hashSet;

public class Studant  {

	private String name;
	private int score;

	public Studant(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	@Override
	public String toString() {
		return "Studant [name: " + name + ", score: " + score + "]\n";
	}

	
}