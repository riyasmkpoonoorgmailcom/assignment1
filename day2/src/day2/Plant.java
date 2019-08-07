package day2;

public class Plant {
	float height=0;
	int numberOfLeaves=0;
	int fruit=0;
	
	
	void grow()
	{
		height+=1;
		numberOfLeaves+=1;
		
	}
	void incrFruit()
	{
		fruit+=1;
	}
	void decrFruit()
	{
		fruit-=1;
	}
	void printStates()
	{
		System.out.println("height :"+height+"\n"+"leaves :"+numberOfLeaves+"\n"+"fruits :"+fruit);
	}

}
