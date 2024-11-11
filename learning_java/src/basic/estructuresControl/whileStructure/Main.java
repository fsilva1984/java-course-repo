package basic.estructuresControl.whileStructure;

public class Main {

	public static void main(String[] args) {
		/*
		 * estrutura de repeticao while, enquanto uma condicao retornar true o while
		 * sera chamado ate que se torne false
		 */

		int count = 1;
		while (count <= 5) {
			System.out.printf("\nnumero: %d", count);
			count++;
		}

	}

}
