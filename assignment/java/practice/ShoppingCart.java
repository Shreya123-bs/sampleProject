package assignment.java.practice;

import java.util.ArrayList;
import java.util.List;


	 
	 
	public class ShoppingCart{
	    public static void main(String[] args) {
	        
	        ArrayList<Integer> cart = new ArrayList<>();
	 
	       
	        for (int i = 1; i <= 10; i++) {
	            cart.add(i);
	        }
	 
	        System.out.println("Cart before removal: " + cart);
	 
	        
	        cart.remove(Integer.valueOf(5));
	 
	        
	        System.out.println("Cart after removal: " + cart);
	    }
	}
