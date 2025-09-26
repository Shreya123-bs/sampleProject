package assignment.java.practice;

	 
interface Vehiclee {
	
void start();

void stop();
	}
	 
	class Carr implements Vehiclee {
	@Override
	public void start() {
	     System.out.println("Car  started");
	}
	 
	@Override
	public void stop() {
	     System.out.println("Car  stopping");
	}
	}
	 
	class Bike implements Vehiclee {
	@Override
	public void start() {
	     System.out.println("Bike  starting");
	}
	 
	@Override
	public void stop() {
	     System.out.println("Bike  stopping");
	}
	}
	 
	public class PracticePRoblm {
	    public static void main(String[] args) {
	        Vehiclee car = new Carr();
	        Vehiclee bike = new Bike();
	 
	        car.start();
	        car.stop();
	 
	        bike.start();
	        bike.stop();
	    }
	}
	 

