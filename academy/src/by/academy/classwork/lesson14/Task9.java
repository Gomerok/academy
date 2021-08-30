package by.academy.classwork.lesson14;

public class Task9 {

	// Переделать класс использующий Printable используя ссылку на статический
	// метод.

	public static void main(String[] args) {
		String str = "Java";
		Printable print = System.out::println;
		print.print(str);
	}
}
