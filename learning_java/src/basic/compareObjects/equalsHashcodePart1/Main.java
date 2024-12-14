package basic.compareObjects.equalsHashcodePart1;

//import java.util.*;

public class Main {
	public static void main(String[] args) {

		User u1 = new User("Marcos", "marcos@mail.com");
		User u2 = new User("Marta", "marta@mail.com");
		User u3 = new User("Vinicios", "vinicios@mail.com");
		User u4 = new User("Ana", "ana@mail.com");
		User u5 = new User("Raquel", "raquel@mail.com");
		User u6 = new User("Antonio", "antonio@mail.com");
		User u7 = new User("Marcos", "marcos@mail.com");
		
		//List<User> users = Arrays.asList(u1, u2, u3, u4, u5, u6, u7);
		
	
		System.out.println(u1.equals(u6));
		System.out.println(u1.equals(u7));
		System.out.println(u7.equals(u3));
	}
}
