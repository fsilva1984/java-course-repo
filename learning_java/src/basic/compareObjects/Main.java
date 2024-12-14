package basic.compareObjects;

public class Main {

	public static void main(String[] args) {
		Car c1 = new Car("Gol", "Branco", 13061984);
		Car c2 = new Car("Ford Ka", "Vermelho", 26052022);
		Car c3 = new Car("Gol", "Branco", 13061984);

		/*
		 * System.out.println(c1 == c3); nesse tipo de comparacao sempre teremos um
		 * valor false como resultado. A forma correta de comparar valores entre objetos
		 * deve ser usando o equals(), que por padrao faz exatamente a mesma coisa que
		 * "==", porem podemos ditar qual vai ser o criterio da comparacao.
		 */

		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));

		/*
		 * Com a comparacao por "==" dentro do java estaremos comparando os enderecos em
		 * memoria de cada objeto, e como cada objeto recebe enderecos unicos entao
		 * sempre resultara em false. cada objeto que você cria na memória heap recebe
		 * um endereço único. Esse endereço é utilizado pelo Java Virtual Machine (JVM)
		 * para acessar o objeto e gerenciá-lo.
		 */

		/*
		 * Um conseito importante na comparacao de é o "hascode" que sera usado para
		 * implementar uma funcao onde o criterio de comparacao sera o hashcode dos
		 * valores de cada objeto
		 */
	}

}
