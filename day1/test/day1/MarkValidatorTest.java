package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class MarkValidatorTest {
	MarkValidator markValidator= new MarkValidator();
	@Test
	public void testIsPass() {
		//case 1:passes
		boolean actual= markValidator.isPass(45);
		assertEquals(actual,true);
		//case 2:fails
		 actual= markValidator.isPass(35);
		assertEquals(actual,false);
		
	}

	@Test
	public void testMarkGrade() {
		//case 1:grade=B
		String actual= markValidator.markGrade(90);
		String expected="B";
		assertEquals(actual,expected);
		//case 2:grade=D
		 actual= markValidator.markGrade(45);
		 expected="D";
		assertEquals(actual,expected);
	}

}
