package by.academy.classwork.lesson14;

import java.util.function.Predicate;

public class Task2 {

	public static void main(String[] args) {
		// Создать лямбда выражение, которое возвращает значение true, если строка не
		// null, используя функциональный интерфейс Predicate.
		String str = "";
		Predicate<String> pred = (s) -> s != null;
		System.out.println(pred.test(str));
	}

}
