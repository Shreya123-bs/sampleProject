package assignment.java.practice;

public class CountEvenAndOddNum {

	public static void main(String[] args) {
		int[] numbers = {10, 25, 19, 26, 15, 40, 33};
        int evenCount = 0;
        int oddCount = 0;

        for (int num : numbers) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
        
	}

}
