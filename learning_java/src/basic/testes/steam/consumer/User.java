package basic.testes.steam.consumer;

public class User {
	private String name;
	private int score;
	private boolean moderate = false;

	public User(String name, int score) {
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

	public boolean isModerate() {
		return moderate;
	}

	public void setModerate(boolean moderate) {
		this.moderate = moderate;
	}

	@Override
	public String toString() {
		return "\nname: " + name + " score: " + score;
	}

}
