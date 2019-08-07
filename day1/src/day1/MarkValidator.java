package day1;

public class MarkValidator {

	public boolean isPass(int mark)
	{
		if(mark>=40)
			return true;
		else 
			return false;
	}
	public String markGrade(int mark) 
	{
		String grade;
		if(mark>90)
			grade="A";
		else if(mark>75)
			grade="B";
		else if(mark>60)
			grade="C";
		else
			grade="D";
		return grade;
	}
	public static void main(String[] args) {
		MarkValidator markValidator= new MarkValidator();
		if(markValidator.isPass(90))
		{
			System.out.print(markValidator.markGrade(90));
		}
		else
			System.out.print("Failed");
		

	}

}
