package it.unical.ingsw2019.tests;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import it.unical.ingsw2019.MyMath;

@RunWith(Parameterized.class)
public class ParameterizedMathTest {
	
	private int expected;
	private int n;
		
	public ParameterizedMathTest(int expected, int n) {
		super();
		this.expected = expected;
		this.n = n;
	}


	@Parameters
	public static Collection<Object[]> getParameters() {		
		return Arrays.asList(new Object[][] {{1,0}, {1,1}, {5,4}});
	}
	
	@Test
	public void fibonacciWorks() {
		MyMath myMath = new MyMath();
		assertEquals(expected, myMath.fibonacci(n));
	}

}
