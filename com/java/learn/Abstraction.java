package com.java.learn;


//it provides partial abstraction by defining both abstract and concrete methods
abstract class Vehicle {
	abstract void move();
	
	void start() {
		System.out.println("vehicle is starting");
	}
}
class Bicycle extends Vehicle{
	
	//providing specific implementation for the abstract move() method
	@Override
	void move() {
		System.out.println("bicycle pedals forward");
	}
	void stop() {
		System.out.println("bicycle stopped");
	}
}

//another subclass providing its own implementation
class Car extends Vehicle{
	@Override
	void move() {
		System.out.println("car drives forward");
	}
}

public class Abstraction{
	public static void main(String[] args) {
		Vehicle bike=new Bicycle();
		
		
		bike.start();
		bike.move();
		
		Vehicle car = new Car();
		car.start();
		car.move();
		
	}
}









