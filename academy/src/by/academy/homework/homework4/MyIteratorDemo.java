package by.academy.homework.homework4;

public class MyIteratorDemo {

	public static void main(String[] args) {
		Integer[] arr = { 1, 2, 3, 4, 5 };
		MyIterator<Integer> iterator = new MyIterator<>(arr);
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
