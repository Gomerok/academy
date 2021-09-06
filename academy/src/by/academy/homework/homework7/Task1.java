package by.academy.homework.homework7;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {

	public static void main(String[] args) {

		List<Integer> list = Stream.generate(() -> new Random().nextInt(100)).limit(100)
				.peek(i -> i = (int) (i * Math.PI) - 20).filter(i -> i < 100).sorted().skip(3)
				.collect(Collectors.toList());
		Map<Integer, String> map = list.stream().collect(Collectors.toMap(i -> i, s -> "Number: " + s, (i, s) -> i));
		System.out.println(map);

	}

}
