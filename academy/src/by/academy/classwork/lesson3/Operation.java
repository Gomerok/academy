package by.academy.classwork.lesson3;

import java.util.Scanner;

public class Operation {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String month = scan.nextLine();

		switch (month) {
		case ("������"):
			System.out.println("1");
			break;
		case ("�������"):
			System.out.println("2");
			break;
		case ("����"):
			System.out.println("3");
			break;
		case ("������"):
			System.out.println("4");
			break;
		case ("���"):
			System.out.println("5");
			break;
		case ("����"):
			System.out.println("6");
			break;
		case ("����"):
			System.out.println("7");
			break;
		case ("������"):
			System.out.println("8");
			break;
		case ("��������"):
			System.out.println("9");
			break;
		case ("�������"):
			System.out.println("10");
			break;
		case ("������"):
			System.out.println("11");
			break;
		case ("�������"):
			System.out.println("12");
			break;
		default: System.out.println("����� ����� �����������");

		}

		scan.close();
		
//		// TODO Auto-generated method stub
//		int i = 2;
//		int j = 3;
//		int k = j + j;
//		System.out.println(i + "+" + j + "=" + k);

	}

}

