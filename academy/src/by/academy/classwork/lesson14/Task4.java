package by.academy.classwork.lesson14;

import java.util.function.Predicate;

public class Task4 {

	public static void main(String[] args) {
		//Написать программу проверяющую, что строка не null и не пуста, используя метод and() функционального интерфейса Predicate.
		String str = null;
		Predicate<String> pred1 = (s) -> s != "";
		Predicate<String> pred2 = (s) -> s != null;
		
		System.out.println(pred1.and(pred2).test(str));
	}

}
