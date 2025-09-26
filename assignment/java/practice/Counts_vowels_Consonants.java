package assignment.java.practice;

public class Counts_vowels_Consonants {

	public static void main(String[] args) {
		String str = "shreya";
		int count = 0;
		str = str.toLowerCase();
 
		for (int i = 0; i < str.length(); i++) {
		    char ch = str.charAt(i);
		    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
		        count++;
		    }
		}
 
		System.out.println(count);
	}

}
