package assignment.java.practice;

public class Palindrome_sequence {

	public static void main(String[] args) {
		String name = "malayalam";
		String  rev = "";
		for(int i = name.length()-1;i>=0;i--) {
			rev = rev + name.charAt(i);
			
		}
		System.out.println(rev);
	}

}
