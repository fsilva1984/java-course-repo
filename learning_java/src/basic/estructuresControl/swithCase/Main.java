package basic.estructuresControl.swithCase;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		String name = JOptionPane.showInputDialog("Name: ");
		String gender = JOptionPane.showInputDialog("Gender: ");

		switch (gender) {
		case "feminino":
			System.out.printf("Ola sra.: %s", name);
			break;
		case "masculino":
			System.out.printf("Ola sr.: %s", name);
			break;
		default:
			System.out.println("Preencha os campos corretamente");
			break;
		}
	}
}
