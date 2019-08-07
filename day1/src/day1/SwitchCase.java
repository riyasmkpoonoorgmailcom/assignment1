package day1;

public class SwitchCase {
	public boolean isPass(int mark)
	{
		if(mark>=40)
			return true;
		else 
			return false;
	}
	public String markGrade(int mark) 
	{
		mark=converter(mark);
		String grade;
		
		switch(mark)
		{
		case 1:
			grade="A";
			break;
		case 2:
			grade="B";
			break;
		case 3:
			grade="C";
			default:
				grade="D";
				break;
		}
		
		return grade;
	}
	public static int converter(int mark)
	{
		if(mark>90)
			return 1;
		else if(mark>75)
			return 2;
		else if(mark>60)
			return 3;
		else return 4;
	}

	public static void main(String[] args) {
		SwitchCase switchCase= new SwitchCase();
		if(switchCase.isPass(91))
		{
			
			System.out.printf("%s passed",switchCase.markGrade(91));
		}
		else
			System.out.print("Failed");
		

	}

}
