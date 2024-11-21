package basic.constructores.constructorDefault;

public class Main {

	public static void main(String[] args) {
		
		// constructor defaul
		Product01 productOne = new Product01();
		System.out.println(productOne.getClass());
		
		// constructor definido
		Product02 productTwo = new Product02();
		System.out.println(productTwo.getClass());
	}

}
