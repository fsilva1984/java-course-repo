package basic.console;

import java.util.Scanner;

public class ScannerEntrye {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.printf("\nNome: ");
		String name = sc.nextLine();

		System.out.printf("\nSobre nome : ");
		String lastname = sc.nextLine();

		System.out.printf("\nIdade : ");
		int age = sc.nextInt();

		String userinfo = String.format("\nnome: %s\nsobrenome: %s\nidade: %d", name, lastname, age);
		System.out.println(userinfo);

		sc.close();
	}
}
