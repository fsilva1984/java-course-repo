package matriz.declarationOfMatriz;

public class Assessment {

	private double[][] matriz;
	
	public Assessment(double[][] matriz) {
		super();
		this.matriz = matriz;
	}
	
	public void assessmentStudent() {
		for(int i = 0; i < matriz.length; i++) {
			System.out.println("\n");
			for(int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		}
	}
	
}
