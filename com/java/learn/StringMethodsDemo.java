package com.java.learn;

public class StringMethodsDemo {

	public static void main(String[] args) {
		String sentence = "Java,Python,JavaScript,Ruby";
		
		//use split() to divide the sentence into an array of languages
		String[] languages=sentence.split(",");
//		System.out.println(sentence);
		
		//print each language and its length
		for(String lang:languages) {
			System.out.println(lang + " has length: "+lang.length());
		}
		
		//compare two strings using equals()
		String lang1=languages[0];
		String lang2="Java";
		String lang3 = "java";
		
		
		System.out.println("\ncomparision:");
		System.out.println(lang1 +" equals "+lang2+":"+lang1.equals(lang2));
		System.out.println(lang1 +" equals "+lang3+":"+lang1.equals(lang3));

		//extract a substring from one language name
		String sub=lang1.substring(1,4);//from index 1 to 4(exclusive)
		System.out.println("\nSubstring of " +  lang1 + " from index 1 to 4 is: " + sub);
		
		//contains
		String cont="ahana";
		boolean conto=cont.contains("a");
		System.out.println(conto);

		
		
	}

}





