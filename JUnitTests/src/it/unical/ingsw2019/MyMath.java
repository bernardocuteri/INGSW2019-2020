package it.unical.ingsw2019;

public class MyMath {
	
	public int fibonacci(int n) {
		
		if(n<0) {
			throw new IllegalArgumentException("Illegal value "+n);
		}
		if(n == 0 || n == 1) {
			return 1;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	} 
	
	public int factorial(int n) {
		
		if(n == 0) {
			return 1;
		}
		return n*factorial(n-1);
		
		
		
	}

}
