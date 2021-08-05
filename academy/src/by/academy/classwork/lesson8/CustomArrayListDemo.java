package by.academy.classwork.lesson8;

import java.util.Arrays;

public class CustomArrayListDemo {

	public static void main(String[] args) {
		Integer[] arrInt = {1,2,3};
		CustomArrayList<Integer> arrList = new CustomArrayList<>(arrInt);
		arrList.add(4);
		arrList.add(5);
		arrList.add(7);
		System.out.println(Arrays.toString(arrList.getItems()));
		arrList.remove(3);
		System.out.println(Arrays.toString(arrList.getItems()));
		arrList.remove(6);
		arrList.remove(2);
		System.out.println(Arrays.toString(arrList.getItems()));
		
	}

}
