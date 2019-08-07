package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class SwitchCaseTest 
{
	SwitchCase switchCase= new SwitchCase();


	@Test
	public void testIsPass() {
		//case 1:passes
		boolean actual=switchCase.isPass(45);
		assertEquals(actual,true);
		//case 2:fails
		 actual= switchCase.isPass(35);
		assertEquals(actual,false);
	}
		

	@Test
	public void testMarkGrade() {
		//case 2:grade B
		String actual=switchCase.markGrade(90);
		String expected="B";
		assertEquals(actual,expected);
		//case 2:grade=D
		 actual= switchCase.markGrade(45);
		 expected="D";
		assertEquals(actual,expected);
	}
	@Test
	public void testconverter() {
		//case 1
		int actual=SwitchCase.converter(91);
		assertEquals(actual,1);
		//case 2
		 actual= SwitchCase.converter(55);
		assertEquals(actual,4);
	}

}
