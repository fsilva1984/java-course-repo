package collections.list;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Number n0 = new Number(0);
		Number n1 = new Number(1);
		Number n2 = new Number(2);
		Number n3 = new Number(3);
		Number n4 = new Number(4);
		List<Number> nums = new ArrayList<>();

		// adicionando objetos a lista
		nums.add(n0);
		nums.add(n1);
		nums.add(n2);
		nums.add(n3);
		nums.add(n4);
		
		// acessar objeto por indice
		int index = nums.size() - 1;
		System.out.println("indice " + index + " temos o: " + nums.get(index));
		
		// remover objeto por indice
		 index = nums.size() - 3;
		System.out.println(nums.remove(index));
		
		// removendo um objeto diretamente passando o objeto a ser removido
		System.out.println(nums.remove(n4));
		
		// adicionando um objeto em um determinado indice
		Number n5 = new Number(5);
		nums.set(index, n5);
		
		System.out.println(nums);
		
		System.out.println(nums.contains(n2));
	}



}
