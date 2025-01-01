package collections.map.implementation.treeMap;

public class User {
	private String name;
	private int age;

	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "User [ name =" + name + ", age =" + age + " ] \n";
	}
	
	

}