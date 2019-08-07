package day2;

public class Demo {

	public static void main(String[] args) {
		Fan fan=new Fan();//object of fan
		Fan fan1=new Fan();//object of fan
		Door door=new Door();//object of door
		Door door1=new Door();//object of door
		Plant plant=new Plant();//object of plant
		Plant plant1=new Plant();//object of plant
		System.out.println("Fan1");//fan
		fan.switchOn();
		fan.incrSpeed(10);
		fan.decrSpeed(5);
		fan.printStates();
		System.out.println("Fan2");//fan
		fan1.switchOn();
		fan1.incrSpeed(14);
		fan1.decrSpeed(5);
		fan1.printStates();
		System.out.println("Door1");//Door
		door.closeDoor();
		door.lockDoor();
		door.printStates();
		System.out.println("Door2");//Door
		door1.openDoor();
		door1.unlockDoor();
		door1.printStates();
		System.out.println("Plant1");//Plant
		plant.grow();
		plant.incrFruit();
		plant.printStates();
		System.out.println("Plant2");//Plant
		plant1.grow();
		plant1.incrFruit();
		plant1.incrFruit();
		plant1.printStates();


	}

}
