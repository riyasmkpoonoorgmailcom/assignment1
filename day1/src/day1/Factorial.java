package day1;

public class Factorial {

	public int calculateFactorial(int number)
	{
		int factorial;
		if(number==0)
			return 1;
		factorial= number * calculateFactorial(number-1);
		return factorial;
		
	}
	public static void main(String[] args) {
	
		Factorial factorial= new Factorial();
		System.out.println(factorial.calculateFactorial(5));
	}

}
