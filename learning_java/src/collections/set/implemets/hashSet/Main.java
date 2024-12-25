package collections.set.implemets.hashSet;

import java.util.HashSet;

public class Main {

	public static void main(String[] args) {

		Studant gustavo = new Studant("Gustavo", 320);
		Studant alberto = new Studant("Alberto", 210);
		Studant ricardo = new Studant("Ricardo", 350);
		Studant beatriz = new Studant("Beatriz", 305);
		Studant Marta = new Studant("Marta", 216);
		Studant julia = new Studant("Julia", 318);
		
		HashSet<Studant> studants = new HashSet<>();
		
		studants.add(gustavo);
		studants.add(alberto);
		studants.add(ricardo);
		studants.add(beatriz);
		studants.add(Marta);
		studants.add(julia);
		
		
		System.out.println(studants);
		
	}

}
