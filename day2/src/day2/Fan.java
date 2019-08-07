package day2;

public class Fan {
int speed=0;
String state="Off";
void incrSpeed(int increment)
{
speed+=increment;
}
void decrSpeed(int decrement)
{
	speed-=decrement;
}
void switchOn()
{
	state="On";
}
void switchOff()
{
	state="Off";
}
void printStates()
{
	System.out.println("speed :"+speed+"\n"+"state:"+state);
}

}
