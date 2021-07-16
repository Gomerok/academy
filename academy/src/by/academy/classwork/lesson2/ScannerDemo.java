package by.academy.classwork.lesson2;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//for(int i=0;scan.nextLine()=="")
		String str = scan.nextLine();
		System.out.println(str);
		scan.close();

	}

}
