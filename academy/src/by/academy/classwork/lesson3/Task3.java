package by.academy.classwork.lesson3;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();

		if (a % 2 == 0) {
			System.out.println("׸����");
		} else if (a % 2 < 0 && a % 2 >0) {
			System.out.println("�� ׸����");
		}else {System.out.println("������� �������� �����");}
		
		scan.close();
	}

}

