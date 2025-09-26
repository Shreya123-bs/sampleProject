package com.java.learn;

interface Drivable {
	int a = 10;
	String b="vehicle";
	boolean c = true;
	
	void start();
	void drive();
	void stop();
}

class Carr implements Drivable{
	@Override
	public void start() {
		System.out.println("car is starting " + b);
	}
	@Override
	public void drive() {
		System.out.println("car is driving" + c);
	}
	@Override
	public void stop() {
		System.out.println("Car has stopped");
	}
	
public class InterfaceEx {
	public static void main(String[] args) {
		//we can use the drivable interface reference to refer to any drivable object
		
		Drivable myCar=new Carr();
		//these methods 
		myCar.start();
		myCar.drive();
		myCar.stop();

	}

}
}
