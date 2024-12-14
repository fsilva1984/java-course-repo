package matriz.declarationOfMatriz;

public class Main {

	public static void main(String[] args) {

		Student noe = new Student("Noe");

		noe.studentGrid(0, 0, 8.2);
		noe.studentGrid(0, 1, 7.5);
		noe.studentGrid(0, 2, 7.2);

		noe.studentGrid(1, 0, 8.2);
		noe.studentGrid(1, 1, 6.5);
		noe.studentGrid(1, 2, 8.0);

		noe.studentGrid(2, 0, 8.5);
		noe.studentGrid(2, 1, 8.9);
		noe.studentGrid(2, 2, 5.0);

		Assessment as = new Assessment(noe.getMatriz());
		as.assessmentStudent();
	}

}
