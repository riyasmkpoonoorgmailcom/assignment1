package day1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TemperatureUnitConversionTest {
	
	@Test
	public void testConvertToFarenheit() {
		//case 1:Positive temperature value
		double actual=TemperatureUnitConversion.convertToFarenheit(37);
		double expected=98.60;
		assertEquals(actual,expected,.02);
		//case 2:Negative temperature value
		 actual=TemperatureUnitConversion.convertToFarenheit(-37);
		 expected=-34.60;
		assertEquals(actual,expected,.02);
		
	}

	@Test
	public void testConvertToCelsius() {
		//case 1:Positive temperature value
		double actual=TemperatureUnitConversion.convertToCelsius(81);
		double expected=27.22;
		assertEquals(actual,expected,.02);
		//case 2:Negative temperature values
		 actual=TemperatureUnitConversion.convertToCelsius(-81);
		 expected=-62.77;
		assertEquals(actual,expected,.02);
				
	}

}
