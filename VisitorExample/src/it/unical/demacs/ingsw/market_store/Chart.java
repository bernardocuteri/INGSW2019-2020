package it.unical.demacs.ingsw.market_store;

import java.util.ArrayList;
import java.util.List;

import it.unical.demacs.ingsw.market_store.products.Product;
import it.unical.demacs.ingsw.market_store.visitors.ProductVisitor;
import it.unical.demacs.ingsw.market_store.visitors.TaxProductVisitor;

public class Chart {
	
	
	private List<Product> chartProducts = new ArrayList<>();
	
	public void addProduct(Product p) {
		chartProducts.add(p);
	}
	
	public double checkout() {
		double sum = 0;
		ProductVisitor taxVisitor = new TaxProductVisitor();
		for(Product p: chartProducts) {
			p.accept(taxVisitor);
			sum += p.getPrice();
		}	
		
		return sum;
	}

}
