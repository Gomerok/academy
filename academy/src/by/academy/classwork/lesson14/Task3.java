package by.academy.classwork.lesson14;

import java.util.function.Predicate;

public class Task3 {
	public static void main(String[] args) {
		// Создать лямбда выражение, которое возвращает значение true, если строка не
		// null, используя функциональный интерфейс Predicate.
		String str = "d";
		Predicate<String> pred = (s) -> s != "";
		System.out.println(pred.test(str));
	}
}
