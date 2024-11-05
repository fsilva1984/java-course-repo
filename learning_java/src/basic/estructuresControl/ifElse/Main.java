package basic.estructuresControl.ifElse;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.printf("Media do Aluno: ");

		double media = sc.nextDouble();

		if (media > 0 && media >= 6.5 && media < 8.5)
			System.out.println("Parabens aprovado");
		else if (media >= 8.5)
			System.out.println("Aprovado Conceito 'A'");
		else
			System.out.println("Recuperacao");
		sc.close();
	}

}
