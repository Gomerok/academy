package by.academy.lesson3;

import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int poloz = 0;
		int otr = 0;
		int nul = 0;
		
		for(;;) {
			
		if(n>0) {
			poloz++;
		}
		if(n<0) {
			otr++;
		}
		if(n==0) {
			nul++;
		}
		n = scan.nextInt();
		if(n==100) {
			
			scan.close();
			break;
		}
		}
		
		System.out.println(poloz);
		System.out.println(otr);
		System.out.println(nul);
		


	}

}
