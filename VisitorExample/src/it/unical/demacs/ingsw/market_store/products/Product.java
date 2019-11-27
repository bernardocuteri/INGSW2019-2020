package it.unical.demacs.ingsw.market_store.products;

import it.unical.demacs.ingsw.market_store.visitors.ProductVisitor;

public interface Product {

	public void accept(ProductVisitor visitor);
	
	public double getPrice();
	
}
