package java.Array.Practice;

public class OneDArray {
	public static void main(String[] args) {
		
//sum
		int[] numbers = {10,20,30,40};
		int sum=0;
		for(int i=0;i<numbers.length;i++) {
			sum=sum+numbers[i];
		}
		System.out.println(sum);
	
		
		
//max
		int [] numbers1= {1,2,4,9,7,6};
		int max=numbers1[0];
		for(int i=0;i<numbers1.length;i++) {
			if(numbers1[i]>max) {
				max=numbers1[i];
			}}
				System.out.println(max);
			
//min		
				int [] numbers2= {1,2,4,9,7,6};
				int min=numbers1[0];
				for(int i=0;i<numbers1.length;i++) {
					if(numbers1[i]<min) {
						min=numbers1[i];
					}}
						System.out.println(min);	
							
		}
				
}
