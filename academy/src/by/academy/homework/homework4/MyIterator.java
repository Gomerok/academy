package by.academy.homework.homework4;

class MyIterator<T> {
	T[] arr;
	int current = 0;

	public MyIterator(T[] arr) {
		super();
		this.arr = arr;
	}

	public boolean hasNext() {
		if (current == 0) {
			return arr.length != 0 && arr[current] != null;
		}
		return current != arr.length && arr[current] != null;
	}

	public T next() {
		return arr[current++];
	}
}
