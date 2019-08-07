package day1;

public class TemperatureUnitConversion {
	public static double convertToFarenheit(double celsius)
	{
		double farenheit = 9*celsius/5 + 32;
		return farenheit;
	}
	public static double convertToCelsius(double farenheit)
	{
		double celsius=5/9.0 * (farenheit-32);
		return celsius;
	}

	public static void main(String[] args) {
		
		System.out.printf("%.2f\n",convertToFarenheit(37));
		System.out.printf("%.2f",convertToCelsius(81));
		
	}

}
