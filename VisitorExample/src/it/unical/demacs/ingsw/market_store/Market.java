package it.unical.demacs.ingsw.market_store;

import it.unical.demacs.ingsw.market_store.products.LiquorProduct;
import it.unical.demacs.ingsw.market_store.products.NecessityProduct;
import it.unical.demacs.ingsw.market_store.products.OrdinaryProduct;
import it.unical.demacs.ingsw.market_store.products.TobaccoProduct;

public class Market {

	
	public static void main(String[] args) {
		
		
		Chart chart = new Chart();
		chart.addProduct(new NecessityProduct(1));
		chart.addProduct(new NecessityProduct(1));
		chart.addProduct(new LiquorProduct(1));
		chart.addProduct(new TobaccoProduct(1));
		chart.addProduct(new OrdinaryProduct(1));
		
		System.out.println("The total price of the chart is: "+chart.checkout());
	}
}
