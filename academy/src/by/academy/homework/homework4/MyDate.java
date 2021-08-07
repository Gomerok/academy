package by.academy.homework.homework4;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyDate {

//	Создать объект класса Date, используя вложенные классы Год, Месяц, День. 
//	Методы: задать дату, вывести на консоль день недели по заданной дате. 
//	День недели представить в виде перечисления. 
//	Рассчитать количество дней, в заданном временном промежутке.
//	Один из конструкторов - строка в формате dd-mm-yyyy, добавить валидацию для этой строки. 
//	После валидации в конструкторе создаем объекты класса Year, Month, Day.
//	Добавить метод, который проверяет высокосный ли год или нет.

	private String date;
	private static Pattern datePattern = Pattern
			.compile("(0[1-9]|[12][0-9]|3[01])([\\-])(0[1-9]|1[012])([\\-])(19\\d\\d|20\\d\\d)");
	Year y;
	Month m;
	Day d;

	class Year {
		private int year;

		public Year() {
			super();
		}

		public Year(int year) {
			super();
			this.year = year;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

	}

	class Month {
		private int month;

		public Month() {
			super();
		}

		public Month(int month) {
			super();
			this.month = month;
		}

		public int getMonth() {
			return month;
		}

		public void setMonth(int month) {
			this.month = month;
		}

	}

	class Day {
		private int day;

		public Day() {
			super();
		}

		public Day(int day) {
			super();
			this.day = day;
		}

		public int getDay() {
			return day;
		}

		public void setDay(int day) {
			this.day = day;
		}

	}

	public MyDate() {
		super();
		y = new Year(0);
		m = new Month(0);
		d = new Day(0);
	}

	public MyDate(String date) {
		super();
		if (validator(date)) {
			this.date = date;
			String ymd[] = date.split("-");
			y = new Year(Integer.parseInt(ymd[2]));
			m = new Month(Integer.parseInt(ymd[1]));
			d = new Day(Integer.parseInt(ymd[0]));
		} else {
			System.out.println("Дата введена некорректно");
		}
	}

	public void setDate(String date) {
		if (validator(date)) {
			this.date = date;
			String ymd[] = date.split("-");
			y.setYear(Integer.parseInt(ymd[2]));
			m.setMonth(Integer.parseInt(ymd[1]));
			d.setDay(Integer.parseInt(ymd[0]));
		} else {
			System.out.println("Дата введена некорректно");
		}
	}

	public String getDate() {
		return date;
	}

	private boolean validator(String date) {
		Matcher matcher = datePattern.matcher(date);
		if (matcher.matches()) {
			if ((Integer.parseInt(matcher.group(1)) == 31 && (Integer.parseInt(matcher.group(3))) == 4)
					|| (Integer.parseInt(matcher.group(1)) == 31 && (Integer.parseInt(matcher.group(3))) == 6)
					|| (Integer.parseInt(matcher.group(1)) == 31 && (Integer.parseInt(matcher.group(3))) == 9)
					|| (Integer.parseInt(matcher.group(1)) == 31 && (Integer.parseInt(matcher.group(3))) == 11)) {
				System.out.println("Дата введена некорректно");
				return false;
			}

			if (leapYear(Integer.parseInt(matcher.group(5)))) {
				if (Integer.parseInt(matcher.group(3)) == 2 && Integer.parseInt(matcher.group(1)) > 29) {
					System.out.println("Дата введена некорректно");
					return false;
				}
			} else if (Integer.parseInt(matcher.group(3)) == 2 && Integer.parseInt(matcher.group(1)) > 28) {
				System.out.println("Дата введена некорректно");
				return false;
			}
		}

		return true;
	}

	public static boolean leapYear(int year) {
		if ((year % 400) == 0 || (year % 4 == 0 && (year % 100) != 0)) {
			return true;
		}
		return false;
	}

	public boolean leapYear() {
		if ((y.getYear() % 400) == 0 || (y.getYear() % 4 == 0 && (y.getYear() % 100) != 0)) {
			return true;
		}
		return false;
	}

	public static int differenceOfDays(MyDate date1, MyDate date2) {
		int diffdate = 0;
		int i = date1.y.getYear();
		if (date1.y.getYear() < date1.y.getYear()) {
			i = date2.y.getYear();
		}
		for (; i < date2.y.getYear(); i++) {
			if (leapYear(date1.y.getYear())) {
				diffdate += 366;
			} else {
				diffdate += 365;
			}
		}
		diffdate += date1.getDayOfYear(date1) - date2.getDayOfYear(date2);
		return diffdate;
	}

	private int getDayOfYear(MyDate date) {
		int sumDays = 0;
		for (int i = 1; i < date.m.getMonth(); i++) {

			if (i == 4 || i == 6 || i == 9 || i == 11) {
				sumDays += 30;
				continue;
			}
			if (leapYear(date.y.getYear()) && i == 2) {
				sumDays += 29;
				continue;
			} else if (i == 2) {
				sumDays += 28;
				continue;
			}
			sumDays += 31;
		}
		sumDays += date.d.getDay();
		return sumDays;

	}

	public int getDayOfYear() {
		int sumDays = 0;
		for (int i = 1; i < m.getMonth(); i++) {

			if (i == 4 || i == 6 || i == 9 || i == 11) {
				sumDays += 30;
				continue;
			}
			if (leapYear(y.getYear()) && i == 2) {
				sumDays += 29;
				continue;
			} else if (i == 2) {
				sumDays += 28;
				continue;
			}
			sumDays += 31;
		}
		return sumDays;
	}

	enum DayOfWeek {
		MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURTHDAY(4), FRIDAY(5), SATURDAY(6), SUNDAY(7);

		private int daysIndex;

		DayOfWeek(int daysIndex) {
			this.daysIndex = daysIndex;
		}

		int getDaysIndex() {
			return daysIndex;
		}

	}

	public int getDayOfWeek() {
		LocalDate dayOfWeek = LocalDate.of(y.getYear(), m.getMonth(), d.getDay());
		for (DayOfWeek day : DayOfWeek.values()) {
			if (dayOfWeek.getDayOfWeek().equals(day)) {
				System.out.println(day);
				return 1;
			}

		}
		System.out.println(Arrays.toString(DayOfWeek.values()));
		return 0;
	}

}
