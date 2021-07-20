package by.academy.homework.homework1;

public class Task1_4 {

	public static void main(String[] args) {

		int n = 2;
		for (int i = 0;; i++) {
			if (n << i >= 1_000_000) {
				break;
			}
			System.out.println(n << i);
		}

	}

}
