package by.academy.classwork.lesson14;

import java.util.function.Predicate;

public class Task5 {

	public static void main(String[] args) {
		//Написать программу, которая проверяет, что строка начинается буквой “J”или “N” и заканчивается “A”.
		//Используем функциональный интерфейс Predicate.
		String str = "Jkk";
		Predicate<String> predJ = (s) -> s.startsWith("J");
		Predicate<String> predN = (s) -> s.startsWith("N");
		Predicate<String> predA = (s) -> s.endsWith("A");
		
		System.out.println(predJ.or(predN).and(predA).test(str));
	}

}
