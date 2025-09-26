package com.java.learn;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter full Name: ");
		String fullName=sc.nextLine();
		
		System.out.print("enter Age: ");
		int age=sc.nextInt();
		
		System.out.print("enter gender(male/female): ");
		String gender=sc.next();
		
		System.out.print("enter gpa: ");
		double gpa=sc.nextDouble();
		
		System.out.print("enter height in cm: ");
		float height = sc.nextFloat();
		
		System.out.print("enter phone number: ");
		long phone = sc.nextLong();
		
		System.out.print("are u an international student? (yes/no): ");
		boolean isInternational=sc.nextBoolean();
        System.out.println("---Student Details--");
        System.out.println("student fullName is:" + fullName);
        System.out.println("student age is:" + age);
        System.out.println("student gender is:" + gender);
        System.out.println("student gpa is:" + gpa);
        System.out.println("student height is:" + height);
        System.out.println("student phone is:" + phone);
        System.out.println("is international student ? :" + isInternational);	
	}
}
