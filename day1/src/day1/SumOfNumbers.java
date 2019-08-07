package day1;

public class SumOfNumbers {
	
	public int sumOfEvenNumbers(int start, int end)
	{
		int sum=0;
		for(int i=start;i<=end;i++)
		{
			if(i%2==0)
			{
				sum+=i;
			}
		}
		return sum;
	}
	public int sumOfOddNumbers(int start, int end)
	{
		int sum=0;
		for(int i=start;i<=end;i++)
		{
			if(i%2!=0)
			{
				sum+=i;
			}
		}
		return sum;
	}
	

	public static void main(String[] args) {
		SumOfNumbers sumOfNumbers=new SumOfNumbers();
		System.out.println(sumOfNumbers.sumOfOddNumbers(1,10));
		System.out.println(sumOfNumbers.sumOfEvenNumbers(1,10));
		
		

	}

}
