package assignment.java.practice;

public class PasswordValidation {
	      public static void validatePassword(String password) throws Exception {
	          if (password.length() < 6) {
	            
	              throw new Exception("Password should be 6 characters");
	          } else {
	              System.out.println("Password is valid.");
	          }
	      }
	   
	      public static void main(String[] args) {
	          String password = "shreya&*2";
	   
	          try {
	              validatePassword(password);
	          } catch (Exception e) {
	              
	              System.out.println("Password failed: "+ e.getMessage());
	          }
	      }   
	}
	


