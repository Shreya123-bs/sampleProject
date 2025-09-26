package assignment.java.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Count {		 
	    public static void main(String[] args) {
	        int wordCount = 0;
	        try (BufferedReader br = new BufferedReader(new FileReader("ExampleOutput"))) {
	            String line;
	            while ((line = br.readLine()) != null) {
	                String[] words = line.split("\\s+");
	                wordCount += words.length;
	            }
	            System.out.println("Total Words: " + wordCount);
	        } catch (IOException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
}
 
