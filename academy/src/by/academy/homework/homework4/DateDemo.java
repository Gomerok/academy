package by.academy.homework.homework4;

public class DateDemo {

	public static void main(String[] args) {
		Date date1 = new Date("12-12-2012");
		Date date2 = new Date();
		date2.setDate("10-05-2002");
		System.out.println(Date.differenceOfDays(date1, date2));
		System.out.println(date1.getDayOfWeek());
		System.out.println(Date.leapYear(date2.y.getYear()));
	}

}
