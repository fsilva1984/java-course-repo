package basic.LocalVariables;

public class Main {

	// variavel de instancias
	public String name;

	public String hello() {
		// variavel local, apenas o metodo onde fora definida pode vela e modificala
		String formatter = "Hi, ";
		return formatter + name;
	}

	Main(String name) {
		this.name = name;
	}

	public static void main(String[] args) {

		/*
		 * variaveis de instancia sao variaveis definida no corpo da classe, variaveis
		 * local sao as variaveis definidas dentro de metodos
		 */

		Main greeting = new Main("flavio");
		System.out.println(greeting.hello());
	}

}
