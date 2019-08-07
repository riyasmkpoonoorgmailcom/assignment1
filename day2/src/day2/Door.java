package day2;

public class Door {
	String state="closed";
	String lock="locked";
	void openDoor()
	{
		state="opened";
	}
	void closeDoor()
	{
		state="closed";
	}
	void lockDoor()
	{
		lock="locked";
	}
	void unlockDoor()
	{
		lock="unlocked";
	}
	void printStates()
	{
		System.out.println("state :"+state+"\n"+"lock :"+lock);
	}

}
