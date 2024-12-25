package collections.set.implemets.linkedHashset;

import java.util.LinkedHashSet;
import java.util.Set;

public class BrowserHistory {
	/*
	 * LinkedHashSet: Implementação que mantém a ordem de inserção dos elementos. É
	 * útil quando você precisa manter a ordem de inserção.
	 */
	private Set<String> history;

	public BrowserHistory() {
		history = new LinkedHashSet<>();
	}

	public void visitPage(String url) {
		history.add(url);
	}

	public void printHistory() {
		System.out.println("Histórico de Navegação:");
		for (String url : history) {
			System.out.println(url);
		}
	}

}
