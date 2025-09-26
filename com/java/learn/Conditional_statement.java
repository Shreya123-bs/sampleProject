package com.java.learn;

public class Conditional_statement {
	public static void main(String args[]) {
	double cartValue=1200;
	//example 1
	if(cartValue>1000) {
		System.out.println("simple if: You are eligible for a free gift!");
		
		
	}
	//example 2
	boolean isPremiumMember = true;
	if(isPremiumMember) {
		System.out.println("if-else: you get 20% discount");}
	else {
		System.out.println("if-else: you get 5% discount");

		
	}
	
	//example 3
	int points = 850;
	if(points<200) {
		System.out.println("if-else ladder: bronze member");
		}
	else if(points<500) {
		System.out.println("if-else ladder: silver member");
		}
	else if(points<1000) {
		System.out.println("if-else ladder: gold member");
		}
	else {
		System.out.println("if-else ladder: platinum member");
	}
//exaple 4: traditional switch statement
	
	int paymentMethod=2;
	switch(paymentMethod) {
	case 1 :
		System.out.println("Switch: payment by credit card");
		break;
	case 2:
		System.out.println("Switch: payment by  upi");

	case 3:
		System.out.println("Switch: payment by wallet");
		break;
	default:
		System.out.println("Switch:payment method is not recognized");
	}


	int deliveryDay=6;
	String deliveryType = switch(deliveryDay) {
	case 1,2,3,4,5 ->"Weekly Delivery - Standard Shipping";
	case 6,7->"Weekend Delivery-Extra charges apply";
	default -> "invalid day selected for delivery";

	};
	System.out.println("enhanced switch: " + deliveryType);
	}
	}


