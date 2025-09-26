package assignment.java.practice;

public class TransposeExample {

	public static void main(String[] args) {
		int [][] matrix = {
				{1,2},
				{3,4}
		};
		int[][]matrix1=new int[2][2];
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				matrix1[i][j]=matrix[j][i];
				
				System.out.print(matrix1[i][j]+" ");
				
			}
			System.out.println();
		}
	}

}
