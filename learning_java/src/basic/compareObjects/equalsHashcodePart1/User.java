package basic.compareObjects.equalsHashcodePart1;

public class User {
	private String name;
	private String email;

	public User(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

// implementando um equals simples
	@Override
	public boolean equals(Object obj) {
		/*
		 * faremos um cast do objeto que receberemos no parametro convertendo para um
		 * objeto do tipo User
		 */
		
		if (obj instanceof User) {
			User other = (User) obj;
			boolean userName = other.name.equalsIgnoreCase(this.name);
			boolean userEmail = other.email.equalsIgnoreCase(this.email);
			
			return userName && userEmail;
		} else {
			return false;
		}
	}

}
