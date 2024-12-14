package matriz.declarationOfMatriz;

public class Student {

	/*
	 * a class aluno tera o nome do aluno e sua pontuacao em cada materia a matriz
	 * trara o indice equivalente a materia e os pontos ganhos em cada materia
	 */
	private String name;
	
//o indice sera a meteria, e em seguida a nota
	private double[][] gradeOfTheSubjects = new double[3][3];
	
	public Student(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public double[][] getMatriz() {
		return gradeOfTheSubjects;
	}
	
	// metodo para gravar a pontuacao do aluno escolhendo o indice
	public void studentGrid(int index, int score, double valor) {
		gradeOfTheSubjects[index][score] = valor;
	}

}
