package it.unical.demacs.ingsw.market_store.visitors;

import it.unical.demacs.ingsw.market_store.products.LiquorProduct;
import it.unical.demacs.ingsw.market_store.products.NecessityProduct;
import it.unical.demacs.ingsw.market_store.products.OrdinaryProduct;
import it.unical.demacs.ingsw.market_store.products.TobaccoProduct;

public interface ProductVisitor {

	void visit(NecessityProduct p);
	void visit(OrdinaryProduct p);
	void visit(TobaccoProduct p);
	void visit(LiquorProduct p);
}
