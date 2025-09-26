package assignment.java.practice;

	import java.io.FileWriter;
	import java.io.IOException;
	 
	public class PracticeExcep {
	    public static void main(String[] args) {
	        try {
	            FileWriter writer = new FileWriter("WelComeMsg.txt");
	            writer.write("Hello Java File Handling!\n");
	            writer.write(".");
	            writer.close();
	            System.out.println("Creating Done.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}

