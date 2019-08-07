package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactorialTest {

	@Test
	public void testCalculateFactorial() {
		Factorial factorial= new Factorial();
		//case1: for positive numbers
		int actual=factorial.calculateFactorial(5);
		int expected=120;
		assertEquals(actual,expected);
		//case 2: for zero
		 actual=factorial.calculateFactorial(0);
		 expected=1;
		assertEquals(actual,expected);
		
	}

}
