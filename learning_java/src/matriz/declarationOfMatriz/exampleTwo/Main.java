package matriz.declarationOfMatriz.exampleTwo;

class DataBase {

	private String[][] matriz;

	/*
	 * Aqui iniciamos a instancia da class DataBase passando o tamanho da matriz
	 */
	public DataBase(int row, int col) {
		super();
		matriz = new String[row][col];
	}

	// adiciona valores a matriz
	void pushMatriz(int row, int col, String value) {
		matriz[row][col] = value;
	}

	// seleciona um item na determinada linha e coluna
	void select(int row, int col) {
		System.out.println(matriz[row][col]);
	}

	// imprime todas as linhas e colunas
	void selectAll() {
		for (int i = 0; i < matriz.length; i++) {
			System.out.println("");
			for (int x = 0; x < matriz[i].length; x++) {
				System.out.println(matriz[i][x]);
			}
		}
	}

}

public class Main {

	public static void main(String[] args) {
		DataBase db = new DataBase(2, 3);

		db.pushMatriz(0, 0, "value1");
		db.pushMatriz(0, 1, "value2");
		db.pushMatriz(0, 2, "value3");

		db.pushMatriz(1, 0, "value4");
		db.pushMatriz(1, 1, "value5");
		db.pushMatriz(1, 2, "value6");

		db.select(0, 1);
		db.select(1, 2);
		db.selectAll();
	}

}
