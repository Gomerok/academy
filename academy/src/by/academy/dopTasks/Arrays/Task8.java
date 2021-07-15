package by.academy.dopTasks.Arrays;

import java.util.Random;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		int arr[] = new int[12];
		int maxs = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.print((arr[i] = rand.nextInt(30) - 15) + " ");
			if (maxs < arr[i]) {
				maxs = arr[i];
			}
		}
		System.out.println();
		System.out.println(maxs);

	}

}
