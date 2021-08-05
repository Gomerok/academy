package by.academy.classwork.lesson8;

public class CustomLincedList<T> {

	private Node<T> head;
	private Node<T> tail;

	private Integer size = 0;

	public void add(T item) {

	}

	public void remove(int index) {

	}

	public void set(T item) {

	}

	public T get(int index) {
		return null;
	}

	class Node<T> {
		Node<T> next;
		Node<T> prev;
		T value;

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("Node [next=");
			builder.append(next);
			builder.append(", prev=");
			builder.append(prev);
			builder.append(", value=");
			builder.append(value);
			builder.append("]");
			return builder.toString();
		}

	}

}
