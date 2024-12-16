package collections.set;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		/*
		 * Trabalhando com set, no uso do set podemos agrupar dados heterogenicos mas
		 * que e uma pratica nao recomendada por deixar o codigo muito poluido. o
		 * conjunto set estrutura objetos recebendo um tipo generico no momento da sua
		 * construcao. Caracteristicas do Set: os objetos em uma estrutura set nao seram
		 * indexados, tambem nao serao ordenados, objetos duplicados sao ignorados
		 */
		Set<Car> cars = new HashSet<>();

		Car gol = new Car("Branco", "Gol", 18051984);
		Car brasilia = new Car("Amarela", "Brasilia", 18051986);
		Car chevete = new Car("Branco", "Chevete", 13061982);

		// metodo para adicionar um objeto ao conjunto set
		cars.add(gol);
		cars.add(brasilia);
		cars.add(chevete);

		// ** metodos mais usados **

		// retorna um boolean
		System.out.println(cars.isEmpty());

		// retorna um inteiro
		System.out.println(cars.size());

		// retorna um boolean
		System.out.println(cars.contains(brasilia));

		// retorna um boolean se o objeto for encontrado para a remocao
		System.out.println(cars.remove(gol));

		System.out.println(cars.size());

		// limpa todo o conjunto
		cars.clear();

		System.out.println(cars.size());
	}

}
