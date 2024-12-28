package collections.list.implementation.linkedList;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		Car caminhao = new Car("Volvo", 2020);
		Car gol = new Car("Gol", 2019);
		Car vectra = new Car("Vectra", 2009);
		Car chevrolet = new Car("Classic", 2008);
		
		List<Car> lista = new LinkedList<>();
		
		lista.add(chevrolet);
		lista.add(caminhao);
		lista.add(1, vectra);
		lista.add(gol);
		
		System.out.println(lista.get(3));// obter elemento por indice.
		lista.remove(2); // Remove o elemento na posição especificada.
		
		System.out.println(lista);
		lista.remove(caminhao); // Remove a primeira ocorrência do elemento especificado.
	
	
	}

}
