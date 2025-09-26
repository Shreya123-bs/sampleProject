package java.Array.Practice;
import java.util.Arrays;

public class ArrayMethodExample {

	public static void main(String[] args) {
		int[] number2= {50,10,40,20,30};
		
		//1.toString():convert array to string and print
		System.out.println("Original Array: " + Arrays.toString(number2));
		
		//sort()-arrays in ascending
		Arrays.sort(number2);
		System.out.println("Sorted Array: " + Arrays.toString(number2));

		
		//copyof()-create new array with same value
		int[] copyArray=Arrays.copyOf(number2, number2.length);
		System.out.println("xopied Array: " + Arrays.toString(copyArray));

		//fill()-fill entire value with one value
		int[] filledArray=new int[5];
		Arrays.fill(filledArray,99);
		System.out.println("Filled Array: " + Arrays.toString(filledArray));

		//equals()-compare two arrays
		boolean isEquals = Arrays.equals(number2,copyArray);
		System.out.println("number2 == copyArray ?"+ isEquals);

		
		
		
		
		
	}

}
