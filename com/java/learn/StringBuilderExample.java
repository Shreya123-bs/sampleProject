package com.java.learn;

public class StringBuilderExample {

	public static void main(String[] args) {
//		StringBuilder sb=new StringBuilder("hello");
		StringBuffer sb=new StringBuffer("hello");
		sb.append(" shreya");
		sb.insert(6,  "sathish ");
		sb.replace(0,  5, "see you");
		sb.reverse();
//		
		System.out.println("StringBuilder output: " + sb);
 //hello sathish shreya
	}

}

//builder and buffer both are same in terms of result but they both are differ in threadsafe  that is sbuffer is not thread safe wheas stringbuilder is threadsafe




