package by.academy.homework.homework4;

public class ArrayListDemo {

	public static void main(String[] args) {

		MyArrayList<String> arr = new MyArrayList<>(4);

		arr.add("Home");
		arr.add("Work");
		arr.add("3");
		arr.add("My");
		arr.add("Array");
		arr.add("List");
		arr.add("Demo");
		
		for(int i=0;i<arr.getIndexLastObj();i++) {
			System.out.println(arr.get(i));
		}
		System.out.println("///////////");
		System.out.println(arr.getFirst());
		System.out.println(arr.getLast());
		arr.remove(3);
		arr.remove("List");
		System.out.println(arr.getIndexLastObj());
		System.out.println(arr.getSize());
		for(int i=0;i<arr.getIndexLastObj();i++) {
			System.out.println(arr.get(i));
		}
	}

}
