package by.academy.classwork.lesson14;

import java.util.function.Function;

public class Task7 {

	public static void main(String[] args) {
//		Написать лямбда выражение, которое принимает на вход число и возвращает значение “Положительное число”,
//		“Отрицательное число” или  “Ноль”. Используем функциональный интерфейс Function.
		Function<Integer, String> func = (x) -> {
			if (x < 0) {
				return "Отрицательное число";
			}
			if (x > 0) {
				return "Положительное число";
			}
			return "Ноль";
		};
		System.out.println(func.apply(10));
	}

}
