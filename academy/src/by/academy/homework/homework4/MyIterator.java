package by.academy.homework.homework4;

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
}
