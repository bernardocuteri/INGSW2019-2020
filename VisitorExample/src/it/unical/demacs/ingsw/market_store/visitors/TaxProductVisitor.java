package it.unical.demacs.ingsw.market_store.visitors;

import it.unical.demacs.ingsw.market_store.products.LiquorProduct;
import it.unical.demacs.ingsw.market_store.products.NecessityProduct;
import it.unical.demacs.ingsw.market_store.products.OrdinaryProduct;
import it.unical.demacs.ingsw.market_store.products.TobaccoProduct;

public class TaxProductVisitor implements ProductVisitor {

	@Override
	public void visit(NecessityProduct p) {
		p.setPrice(p.getPrice()*1.05);
		
	}

	@Override
	public void visit(OrdinaryProduct p) {
		p.setPrice(p.getPrice()*1.22);
		
	}

	@Override
	public void visit(TobaccoProduct p) {
		p.setPrice(p.getPrice()*1.5);
		
	}

	@Override
	public void visit(LiquorProduct p) {
		p.setPrice(p.getPrice()*1.6);
		
		
	}

}
