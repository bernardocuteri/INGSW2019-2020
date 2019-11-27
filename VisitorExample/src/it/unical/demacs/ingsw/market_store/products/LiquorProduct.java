package it.unical.demacs.ingsw.market_store.products;

import it.unical.demacs.ingsw.market_store.visitors.ProductVisitor;

public class LiquorProduct extends AbstractProduct {

	public LiquorProduct(double price) {
		super(price);
	}

	@Override
	public void accept(ProductVisitor visitor) {
		visitor.visit(this);
		
	}
}
