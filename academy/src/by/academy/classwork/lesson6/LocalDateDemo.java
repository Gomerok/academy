package by.academy.classwork.lesson6;

import java.time.LocalDate;

public class LocalDateDemo {

	public static void main(String[] args) {
		LocalDate birthd = LocalDate.of(2000, 7, 5);
		System.out.println(birthd.getYear() + "-" + birthd.getMonthValue() + "-" + birthd.getDayOfYear());
		
		LocalDate dataNow = LocalDate.now();
		
		System.out.println(dataNow.isAfter(birthd));
		System.out.println(dataNow.isBefore(birthd));
	}

}
