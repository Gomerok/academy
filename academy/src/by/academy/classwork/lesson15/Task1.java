package by.academy.classwork.lesson15;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {

	public static void main(String[] args) {

		List<String> list = Stream.generate(() -> new Random().nextInt(1000)).limit(1000).skip(50)
				.filter(i -> i % 2 == 0).sorted().distinct().map(i -> "Число " + i).limit(200)
				.collect(Collectors.toList());
		System.out.println(list);
	}
//	Найти min/max 
//	использовать map  

}
