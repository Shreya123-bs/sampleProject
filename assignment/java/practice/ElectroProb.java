package assignment.java.practice;


abstract class Appliance {
	
abstract void turnOn();

abstract void turnOff();
}
	class Fan extends Appliance {
	@Override
	void turnOn() {
	     System.out.println("Fan is now running");
	}
	 
	@Override
	void turnOff() {
	     System.out.println("Fan  stopped");
	}
	}
	 
	class Light extends Appliance {
	@Override
	void turnOn() {
	     System.out.println("Light  glowing");
	}
	 
	@Override
	void turnOff() {
	     System.out.println("Light  offed");
	}
	}
	 
	public class ElectroProb {
	    public static void main(String[] args) {
	        Appliance fan = new Fan();
	        Appliance light = new Light();
	 
	        fan.turnOn();
	        fan.turnOff();
	 
	        light.turnOn();
	        light.turnOff();
	    }
	}
	 

