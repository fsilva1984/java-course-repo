package basic.dotNotation;

public class Main {

	public static void main(String[] args) {
		// notacao de ponto quando se quer chamar o metodo do objeto
		// o que nao e primitivo tem metodos
		
		// ex:
		String s = "Ola x";
		s = s.replace("x", "Senhor");
		System.out.println(s);
		
		s = s.toUpperCase();
		System.out.println(s);
		
		s = s.repeat(3).concat(" = []");
		System.out.println(s);
	}

}
