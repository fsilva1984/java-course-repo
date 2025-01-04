package collections.stack;

import java.util.ArrayDeque;

public class Library {
	private ArrayDeque<Book> stack = new ArrayDeque<>();

	public void stackAdd(Book b) {
		stack.push(b);
	}

	public void showAllBooks() {
		stack.forEach(System.out::println);
	}

	
}
