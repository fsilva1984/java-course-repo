package collections.list.implementation.stack;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Book b1 = new Book("Star Wars");
		Book b2 = new Book("Star Wars II");
		Book b3 = new Book("Madagascar");
		Book b4 = new Book("Programmer Python");
		Book b5 = new Book("Thinke on Java");

		Stack<Book> library = new Stack<>();

		library.push(b1);// metodo para adicionar.
		library.push(b2);
		library.push(b3);
		library.push(b4);
		library.push(b5);

		System.out.println("\nFoi removido: " + library.pop()); // Remove e retorna o elemento do topo
																														// da pilha

		System.out.println("\nEsta no topo da pilha: " + library.peek()); // Retorna o elemento do topo
																																			// da pilha sem removê-lo.
		System.out.println("\n" + library);

		System.out.println(); // Retorna a posição do elemento na pilha, contando a partir de 1. Se o
													// elemento não estiver na pilha, retorna -1.

		Object obj = b3;
		System.out.println("Posicao do objeto: " + obj + ": " + library.search(b3));// Retorna a posição do elemento na pilha, contando a
																						// partir de 1. Se o elemento não estiver na pilha,
																						// retorna -1.
	}

}
