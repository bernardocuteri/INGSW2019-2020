package it.unical.demacs.ingsw.market_store.products;

import it.unical.demacs.ingsw.market_store.visitors.ProductVisitor;

public class TobaccoProduct extends AbstractProduct {

	public TobaccoProduct(double price) {
		super(price);
	}

	@Override
	public void accept(ProductVisitor visitor) {
		visitor.visit(this);
		
	}
}
