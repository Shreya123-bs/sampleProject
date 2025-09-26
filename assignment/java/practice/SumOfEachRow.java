package assignment.java.practice;

public class SumOfEachRow {

	public static void main(String[] args) {
		  int[][] matrix2 = {
                  {1, 2, 3},
                  {4, 5, 6},
                  {7, 8, 9}
              };

              
              for (int i = 0; i < matrix2.length; i++) {
              	
              	int rowSum = 0;
                      for (int j = 0; j < matrix2[i].length; j++) {
                      	rowSum =rowSum+ matrix2[i][j];
                    }
                      System.out.println("Sum of row " + (i + 1) + ": " + rowSum);
                  
              }
	}

}
