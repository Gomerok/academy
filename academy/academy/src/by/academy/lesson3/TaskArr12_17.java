package by.academy.lesson3;

import java.util.Arrays;
import java.util.Random;


public class TaskArr12_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[6][7];

		Random rand = new Random();
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; i < arr[i].length; j++) {
				arr[i][j] = rand.nextInt(10);
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			sort(arr[i]);
		}
		System.out.println(Arrays.deepToString(arr));
 
	}

		public static int[] sort(int[] arr) {
			
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; i < arr.length; j++) {
					int temp = 0;
					if(arr[i] > arr[j]) {
						temp = arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						
						
					}
				}
			}
			
			return arr;
		}
}
