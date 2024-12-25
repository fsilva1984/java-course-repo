package collections.list.implementation.arrayList;

public class User {
private String name;

public User(String name) {
	super();
	this.name = name;
}

public String getName() {
	return name;
}

@Override
public String toString() {
	return "User [name: " + name + "]\n";
}


}
