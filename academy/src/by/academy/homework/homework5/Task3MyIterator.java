package by.academy.homework.homework5;

import java.util.Iterator;

public class Task3MyIterator<T> implements Iterator<T> {

	private T[][] arr;
	private int currenti = 0;
	private int currentj = 0;

	public Task3MyIterator(T[][] arr) {
		super();
		this.arr = arr;
	}

	@Override
	public boolean hasNext() {
		if (currenti < arr.length && currentj < arr[currenti].length) {
			return true;
		}
		currenti = 0;
		currentj = 0;
		return false;
	}

	@Override
	public T next() {
		T next = arr[currenti][currentj++];
		if (currentj >= arr[currenti].length) {
			currenti++;
			currentj = 0;
		}
		return next;
	}

}
