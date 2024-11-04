package basic.thrustyTable;

public class Main {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		System.out.println("\nTabela verdade E (AND)\n");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);

		System.out.println("\nTabela verdade OU (OR)\n");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);

		System.out.println("\nTabela veradde OU Exclusivo (XOR)\n");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);

	}

}
