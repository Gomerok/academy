package by.academy.homework.homework5;

public class Task3 {

	public static void main(String[] args) {

		Integer[][] arr1 = { { 1, 2, 3, 4 }, { 5, 7, null }, { 8, 9 } };
		Task3MyIterator<Integer> iterator = new Task3MyIterator<>(arr1);

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
