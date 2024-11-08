package basic.imports;

import java.util.ArrayList;
import java.util.List;

public class Imports {

	public static void main(String[] args) {
		/*
		 * se precisamos de um metodo nativo do java ou qualque outro metodo criado pelo
		 * programador, podemos usar o import
		 */

		// exemplo: importaremos duas classe do java
		List<String> names = new ArrayList<>();
		names.add("Silva");
		names.add("marcos");
		names.add("Boston");
		names.add("Maya");
		
		for(String n : names) {
			System.out.println(n);
		}
	}

}
