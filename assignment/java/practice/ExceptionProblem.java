package assignment.java.practice;

public class ExceptionProblem {
 public static void main(String[] args) {
	
	 int[] productIDs= {10,20,30,40};
	 
	 try {
		 System.out.println(productIDs[5]);
	 }
	 catch(ArrayIndexOutOfBoundsException e) {
		 
		 System.out.println("Error: Not Accessible");
		 System.out.println("EcxeptionMessage: " + e.getMessage());
	 }
	 finally {
		 System.out.println("attempting gone wrogn");
	 }
}
}
