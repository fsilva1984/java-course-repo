package poo.relationship.compositionAndInheritance.inheritance;

public class Main {

	public static void main(String[] args) {
		Animal dog = new Dog("Dog", "Racao", 26, 4);
		
		Animal horse = new Horse("Horse" , "Racao e Capim", 276, 4);

		
		System.out.println(dog);
		
		System.out.println(horse);
	}

}
