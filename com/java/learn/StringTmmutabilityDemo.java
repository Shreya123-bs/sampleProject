package com.java.learn;

public class StringTmmutabilityDemo{

	public static void main(String[] args) {
		String original="hello";
		String upper=original.toUpperCase();
		String lower=original.toLowerCase();
		int length=original.length();
		
		System.out.println("Original: "+original);
		System.out.println("uppercase: " +upper);
		System.out.println("lowecase: "+lower);
		System.out.println("length: "+length);
		
		//example to show immutability:
		
		original.concat("world");
		System.out.println("after concat(without assignment): "+ original);
		original=original.concat(" world");
		System.out.println("after concat(with assignment): "+ original);
		
	}

}
