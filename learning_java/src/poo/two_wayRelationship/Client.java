package poo.two_wayRelationship;

public class Client {
	private Buy buy;

	public void myCart() {
		buy.showItems();
	}

	public Buy getBuy() {
		return buy;
	}

	public void setBuy(Buy buy) {
		this.buy = buy;
	}
	
}
