package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void testGetMessage() {
		HelloWorld helloWorld= new HelloWorld();
		String actual=helloWorld.getMessage();
		String expected="Hello World";
		assertEquals(actual,expected);
	}

}
