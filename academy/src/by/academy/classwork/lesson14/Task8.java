package by.academy.classwork.lesson14;

import java.util.Random;
import java.util.function.Supplier;

public class Task8 {

	public static void main(String[] args) {
		// Написать лямбда выражение, которое возвращает случайное число от 0 до 10.
		// Используем функциональный интерфейс Supplier.
		Random rand = new Random();
		Supplier<Integer> sup = () -> rand.nextInt(10);
		System.out.println(sup.get());
	}

}
