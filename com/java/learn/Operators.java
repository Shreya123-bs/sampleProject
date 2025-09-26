package com.java.learn;

public class Operators {

	public static void main(String[] args) {

int applePrice=10, mangoPrice=5;
int  appleQty=3, mangoQty=2;


//Arithmatic Operators
System.out.println("--Arithmatic operators--");
int totalApples=applePrice + appleQty;
int totalMangoes=mangoPrice+mangoQty;
int totalBill=totalApples+totalMangoes;

 
 System.out.println(totalBill);
 
 //Bitwise operator
 int discountCode1=10; //1010
 int discountCode2=5; //0101
 System.out.println("discount AND Check: " +(discountCode1 & discountCode2));
 System.out.println("discount OR Check: " +(discountCode1 | discountCode2));
 System.out.println("discount XOR Check: " +(discountCode1 ^ discountCode2));
 System.out.println("REVERSE DISCOUNT CODE1: " +(~discountCode1));
 System.out.println("DOUBLE DISCOUNECODE1: " +(discountCode1 <<1));
 System.out.println("HALF DISCOUNECODE1: " +(discountCode1 >>1));

 
 //Logical Operator
 boolean hasCoupon=true;
 boolean hasMembership=false;
 System.out.println("Eligible for discount(coupon AND Membership)? "+(hasCoupon && hasMembership));
 System.out.println("Eligible for discount(coupon AND Membership)? "+(hasCoupon || hasMembership));
 System.out.println("not having coupon: "+(!hasCoupon));

 //Assignment Operator
 
int walletBalance=100;
System.out.println("starting wallet balance: "+ walletBalance);
walletBalance -= totalBill; //it will deduct value
System.out.println("After Shopping wallet balance: "+walletBalance);
walletBalance += 20; //cashback added
System.out.println("After cashback,wallet Balance: " +walletBalance);


//unary operator
int cartItems=5;
System.out.println("items in cart: " + cartItems);
System.out.println("add one more item(++cartItems):" +(++cartItems));
System.out.println("proceed to billing(cartItems++):" +(cartItems++));
System.out.println("items after billing : " +cartItems);
System.out.println("remove one item(--cartitems) : " +(--cartItems));
System.out.println("cancel one more(cartitems--) : " +(cartItems--));
System.out.println("items after cancellation : " +cartItems);
System.out.println("negating cart items(-cartitems) : " +(-cartItems));

//Ternary operator

int maxPrice =(applePrice>mangoPrice)?applePrice:mangoPrice;
System.out.println("most expensive item price is: " +maxPrice);
} 

	}


