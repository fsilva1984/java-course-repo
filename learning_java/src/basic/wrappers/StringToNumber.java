package basic.wrappers;

import javax.swing.JOptionPane;

public class StringToNumber {

	public static void main(String[] args) {
		// convertendo strings para numero

		String n1 = JOptionPane.showInputDialog("Digite um numero: ");
		String n2 = JOptionPane.showInputDialog("Digite um segundo numero: ");

		Double sum = Double.parseDouble(n1) + Double.parseDouble(n2);

		System.out.printf("Total: %.2f", sum);
	}
}
