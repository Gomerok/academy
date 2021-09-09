package by.academy.classwork.lesson17;

import java.util.Arrays;

public class ThreadRun2 implements Runnable {

	private Integer[] array;

	public ThreadRun2(Integer[] array) {
		this.array = array;
	}

	@Override
	public void run() {
		Arrays.stream(array).max(Integer::compareTo);
	}

}
