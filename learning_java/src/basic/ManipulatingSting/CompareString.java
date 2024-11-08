package basic.ManipulatingSting;

import java.util.Scanner;

public class CompareString {

	public static void main(String[] args) {
		/*
		 * Como o java analiza essa expressão: "A" == "A"; Em Java, a expressão "A" ==
		 * "A" compara as referências de memória das duas strings. Como ambas as strings
		 * literais "A" são armazenadas no pool de strings, elas compartilham a mesma
		 * referência de memória. Portanto, a comparação retorna true.
		 * 
		 * Se você estivesse comparando duas strings criadas de maneira diferente, como
		 * new String("A") == new String("A"), a expressão retornaria false porque as
		 * referências de memória seriam diferentes, apesar das strings terem o mesmo
		 * conteúdo. Para comparar os conteúdos de duas strings, você usaria o método
		 * .equals()
		 */
		System.out.println("A" == "A");// possuem a mesma referencia

		// referencias diferentes
		String str1 = new String("A");
		String str2 = new String("A");

		System.out.println(str1 == str2);

		// Comparando os valores das strings e nao as referencias
		System.out.println(str1.equals(str2));

		String s1 = "My String";

		Scanner sc = new Scanner(System.in);

		System.out.printf("Frase: ");
		String resp = sc.nextLine().trim();

		System.out.println(resp.equalsIgnoreCase(s1));
		System.out.println(s1 == resp);

		sc.close();
	}

}
