package collections.stack;

public class Main {

	public static void main(String[] args) {
		Library programmerBooks = new Library();
		
		Book java = new Book("Think Java", "2009-1-18");
		Book tomcat = new Book("Tomcat Java", "2013-8-13");
		Book springboot = new Book("Springboot", "2012-2-18");
		Book python = new Book("Think Python 3", "2013-6-13");
		Book tkinter = new Book("Python and Tkinter", "2011-8-12");
		
		programmerBooks.stackAdd(java);
		programmerBooks.stackAdd(tomcat);
		programmerBooks.stackAdd(springboot);
		programmerBooks.stackAdd(python);
		programmerBooks.stackAdd(tkinter);
		
		programmerBooks.showAllBooks();
		
	}

}
