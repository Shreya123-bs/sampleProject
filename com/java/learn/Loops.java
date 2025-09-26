package com.java.learn;

public class Loops {
	public static void main(String[]args) {
		//1.for loop:dispLaying product ids
		System.out.println("for Loop: list of product ids in the store:");
		for(int productid=101;productid<=105;productid++) {
			System.out.println(productid+" "); 
		}
		System.out.println();
		
		//2.while loop:dislplaying remaining stock of a product
		System.out.println("while loop: renamining stock for a product:");
		int stock =5;
		while(stock>0) {
			System.out.print(stock+" ");
			stock--;
		}
		System.out.println();
		
		//3.do-while loop:displaying loyalty points earned by a customer
		System.out.println("do-while: loop:loyalty points earned per purchase:");
		int points=1;
		do {
			System.out.print(points+" ");//points per purchases
			points++;
		}
		while(points <=5);//customer makes 5 purchases
		System.out.println();
		
		//4.for-each (enhanced for loops)
		String[] products = {"laptop","phone","headphones","mouse"};
		
		System.out.println("products available in the store:");
		for (String product : products) {
			System.out.println(product);
		}
		
		}
		
	

}
