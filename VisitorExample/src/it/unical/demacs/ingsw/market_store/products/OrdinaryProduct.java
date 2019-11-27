package it.unical.demacs.ingsw.market_store.products;

import it.unical.demacs.ingsw.market_store.visitors.ProductVisitor;

public class OrdinaryProduct extends AbstractProduct {

	public OrdinaryProduct(double price) {
		super(price);
	}

	@Override
	public void accept(ProductVisitor visitor) {
		visitor.visit(this);
		
	}


	
}
