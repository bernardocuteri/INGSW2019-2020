package it.unical.ingsw2019.tests;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.ingsw2019.MyMath;

public class MyMathTest {

	private static MyMath myMath;

	@BeforeClass
	public static void prepareAll() {
		System.out.println("before class");
		myMath = new MyMath();
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("after class");
	}

	@Before
	public void prepareTest() {
		System.out.println("before");
	}

	@After
	public void cleanTest() {
		System.out.println("after");
	}

	@Test(expected = IllegalArgumentException.class)
	public void fibonacciThrowsException() {
		myMath.fibonacci(-1);
	}

	@Test
	public void fibonacciWorks() {
		System.out.println("testing that fibonacci works");
		assertEquals(1, myMath.fibonacci(1));
		assertEquals(8, myMath.fibonacci(5));
		assertEquals(13, myMath.fibonacci(6));
	}

	@Test
	public void factorialWorks() {
		System.out.println("testing that factorial works");
		assertEquals(1, myMath.factorial(0));
		assertEquals(120, myMath.factorial(5));
	}

	@Test(timeout = 5000)
	public void fibonacciIsFastEnough() {
		myMath.fibonacci(1);
	}

	@Test
	public void testOnDoubles() {
		assertEquals(0.3, 0.1 + 0.1 + 0.1, 0.001);
	}

}
