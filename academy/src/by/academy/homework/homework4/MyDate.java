package by.academy.homework.homework4;

import java.time.LocalDate;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyDate {

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
		m = new Month(1);
		d = new Day(1);
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
			System.out.println("Invailid date");
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
			System.out.println("Invailid date");
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
				System.out.println("Invailid date");
				return false;
			}

			if (leapYear(Integer.parseInt(matcher.group(5)))) {
				if (Integer.parseInt(matcher.group(3)) == 2 && Integer.parseInt(matcher.group(1)) > 29) {
					System.out.println("Invailid date");
					return false;
				}
			} else if (Integer.parseInt(matcher.group(3)) == 2 && Integer.parseInt(matcher.group(1)) > 28) {
				System.out.println("Invailid date");
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
		if (date1.date.equals(date2.date)) {
			return 0;
		}
		int diffDate = 0;
		int minYear = date1.y.getYear();
		int maxYear = date2.y.getYear();
		if (date1.y.getYear() > date2.y.getYear()) {
			minYear = date2.y.getYear();
			maxYear = date1.y.getYear();
		}
		for (; minYear < maxYear; minYear++) {
			if (leapYear(minYear)) {
				diffDate += 366;
			} else {
				diffDate += 365;
			}
		}
		if (date1.getDayOfYear(date1) < date2.getDayOfYear(date2)) {
			return (diffDate + (date1.getDayOfYear(date1) - date2.getDayOfYear(date2))) * (-1);
		}
		return (diffDate + (date2.getDayOfYear(date2) - date1.getDayOfYear(date1))) * (-1);
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

	public int getDayOfWeek() {
		LocalDate dayOfWeek = LocalDate.of(y.getYear(), m.getMonth(), d.getDay());
		for (DayOfWeek day : DayOfWeek.values()) {
			if (dayOfWeek.getDayOfWeek().getValue() == day.getDaysIndex()) {
				return day.getDaysIndex();
			}
		}
		return 0;
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

	@Override
	public int hashCode() {
		return Objects.hash(d, date, m, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDate other = (MyDate) obj;
		return Objects.equals(d, other.d) && Objects.equals(date, other.date) && Objects.equals(m, other.m)
				&& Objects.equals(y, other.y);
	}

}
