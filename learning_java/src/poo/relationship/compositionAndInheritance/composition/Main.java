package poo.relationship.compositionAndInheritance.composition;

public class Main {

	public static void main(String[] args) {
		
		Client fabio = new Client("Fabio");
		Buy buyFabio = new Buy(fabio);
		
		// primeira compra
		Product escovaDental = new Product("Escova dent. média", 23.55);
		Product cremeDental = new Product("Creme dental", 5.75);
		Product desodorante = new Product("Desodorant Axe", 10.40);
		Product sabonete = new Product("Sabonete dove pac.", 12);
		
		// segunda compra
		Product tvsmart = new Product("SmartTv", 2300.0);
		Product arcondicionado = new Product("Splint 32btus", 1800.0);
		
		
		
		buyFabio.addProducts(escovaDental);
		buyFabio.addProducts(cremeDental);
		buyFabio.addProducts(desodorante);
		buyFabio.addProducts(sabonete);
		buyFabio.addProducts(tvsmart);
		buyFabio.addProducts(arcondicionado);
		
		
		fabio.setMyBuy(buyFabio);
		System.out.println("");
		System.out.println(buyFabio.getClient());
		System.out.println("");
		System.out.println(fabio);
		System.out.println("");
		System.out.println(buyFabio);
	}

}
