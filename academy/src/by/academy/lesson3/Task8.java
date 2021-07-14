package by.academy.lesson3;

import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int pow=1;
		for(int i = 1;i<=n; i++) {
			pow *=i;
		}

		System.out.println(pow);

		scan.close();
	}

}