package ch05.sec12;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		System.out.println(array.length);
		System.out.println(array[2].length);
		System.out.println("---------------------------");
		
		
	
		int[] array2 = { 1, 5, 3, 8, 2 };
		int max = array2[0]; //초기화
		int min = array2[0]; //초기화
		
		for(int i = 0; i < array2.length; i++) {
			if (array2[i] > max) {
				max = array2[i];
			}
			if (array2[i] < min) {
				min = array2[i];
			}
		}
		System.out.println("min: " + min + ", max: " + max);
		System.out.println("---------------------------");
		

		int[][] array3 = {
				{96, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int total = 0;
		int totalCount = 0;
		
		for(int i = 0; i < array3.length; i++ ) {
			
			for(int j = 0; j < array3[i].length; j++) {
				total += array3[i][j];
				totalCount ++;
			};
		};
		
		double average = (double) total / totalCount;
		
		System.out.println("total: " + total + ", average: " + average);
		
		
	}

}
