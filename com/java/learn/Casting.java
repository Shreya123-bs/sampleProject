package com.java.learn;

public class Casting {
	public static void main(String[] args) {
		//1.Implicit Casting(Widening)
		int experienceYears=5;
		double updatedsalary = 5000 + (experienceYears * 1200);
		System.out.println("implicit casting : Employee salary =$" + updatedsalary);
		
		
		//2.Explicit casting(Narrowing)
		double bonus=3456.78;
		int roundedBonus=(int)bonus;
		System.out.println("explicit casting: rounded bonus=$" + roundedBonus);
		
		//3.Another real example
		float productRating =4.8f;
		int rating=(int)productRating;
		System.out.println("explicit casting:product rating as integer ="+rating);
		
	}

}
