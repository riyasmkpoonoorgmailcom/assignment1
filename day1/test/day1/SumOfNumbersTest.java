package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumOfNumbersTest {
	SumOfNumbers sumOfNumbers= new SumOfNumbers();

	@Test
	public void testSumOfEvenNumbers() {
		//case 1:sum of positive numbers
		int actual=sumOfNumbers.sumOfOddNumbers(1,10);
		int expected=25;
		assertEquals(actual,expected);
		//case 2:Sum of negative numbers
		 actual=sumOfNumbers.sumOfOddNumbers(-10,-1);
		 expected=-25;
		assertEquals(actual,expected);
		//case 3:Sum of positive and negative numbers
		 actual=sumOfNumbers.sumOfOddNumbers(-10,8);
		 expected=-9;
		assertEquals(actual,expected);
	}

	@Test
	public void testSumOfOddNumbers() {
		//case !:sum of positive numbers
		int actual=sumOfNumbers.sumOfEvenNumbers(1,10);
		int expected=30;
		assertEquals(actual,expected);
		//case 2:Sum of negative numbers
		 actual=sumOfNumbers.sumOfEvenNumbers(-10,-1);
		 expected=-30;
		assertEquals(actual,expected);
		//case 3:Sum of positive and negative numbers
		 actual=sumOfNumbers.sumOfEvenNumbers(-10,8);
		 expected=-10;
		assertEquals(actual,expected);
		
	}

}
