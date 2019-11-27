package it.unical.demacs.ingsw.market_store.products;

public abstract class AbstractProduct implements Product {

	private double price;

	public AbstractProduct(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
