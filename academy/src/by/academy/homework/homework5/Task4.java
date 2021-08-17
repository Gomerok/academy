package by.academy.homework.homework5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Task4 {
	private static Random rand = new Random();

	public static <T> void addRaiting(List<Integer> list) {
		for (int i = 0; i < 25; i++) {
			list.add(rand.nextInt(10));
		}
	}

	public static void main(String[] args) {

		ArrayList<Integer> raiting = new ArrayList<>();
		addRaiting(raiting);
		System.out.println(raiting.toString());
		int value, max = raiting.get(0);

		Iterator<Integer> iterator = raiting.iterator();
		while (iterator.hasNext()) {
			value = iterator.next();
			if (value >= max) {
				max = value;
			}
		}
		System.out.println("Максимальная оценка: " + max);
	}

}
