package by.academy.classwork.lesson17;

import java.util.Arrays;

public class ThreadRun3 implements Runnable{

	private Integer[] array;

	public ThreadRun3(Integer[] array) {
		this.array = array;
	}

	@Override
	public void run() {
		Arrays.stream(array).min(Integer::compareTo);
	}

}
