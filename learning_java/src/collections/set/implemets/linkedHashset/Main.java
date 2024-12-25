package collections.set.implemets.linkedHashset;

public class Main {

	public static void main(String[] args) {

		BrowserHistory browserHistory = new BrowserHistory();

		browserHistory.visitPage("https://www.example.com");
		browserHistory.visitPage("https://www.google.com");
		browserHistory.visitPage("https://www.example.com"); // Duplicata, será ignorada
		browserHistory.visitPage("https://www.github.com");

		browserHistory.printHistory();
	}

}
