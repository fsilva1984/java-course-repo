package arrays.declarationOfArray;

public class Main {

	public static void main(String[] args) {

		Numbers num = new Numbers();
		
		num.setNumbers(0, 14);
		num.setNumbers(1, 32);
		num.setNumbers(2, 18);
		num.setNumbers(3, 13);
		num.setNumbers(4, 16);
		num.setNumbers(5, 27);
		
		
		System.out.println(num.sumAll());
		
	System.out.println(num.toString());
	}

}
