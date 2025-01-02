package collections.queue;

public class User {
	private String name;
	private long id;

	public User(String name, long id) {
		super();
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + "]";
	}

}
