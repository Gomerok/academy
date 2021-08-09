package by.academy.homework.homework4;

import java.util.Arrays;
import java.util.Objects;

class MyIterator<T> {
	private T[] items;
	private int current = 0;

	public MyIterator(T[] arr) {
		super();
		this.items = arr;
	}

	public boolean hasNext() {
		if (current == 0) {
			return items.length != 0 && items[current] != null;
		}
		return current != items.length && items[current] != null;
	}

	public T next() {
		return items[current++];
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(items);
		result = prime * result + Objects.hash(current);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyIterator other = (MyIterator) obj;
		return current == other.current && Arrays.deepEquals(items, other.items);
	}

}
