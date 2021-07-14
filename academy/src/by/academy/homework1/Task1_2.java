package by.academy.homework1;

import java.util.Scanner;

public class Task1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter type: ");
		String type = scan.nextLine();

		switch (type) {
		case ("int"):
			int div = scan.nextInt();
			System.out.println(div % 2);
			break;
		case ("double"):
			double per = scan.nextDouble();
			System.out.println(per * 0.2);
			break;
		case ("float"):
			float sqrt = scan.nextFloat();
			System.out.println(sqrt * sqrt);
			break;
		case ("char"):
			String sim = scan.next();
			System.out.println((int) sim.charAt(0));
			break;
		case ("string"):
			String str = scan.nextLine();
			System.out.println("Hello" + str);
			break;
		default:
			System.out.println("Unsupported type");
		}

		scan.close();
	}

}