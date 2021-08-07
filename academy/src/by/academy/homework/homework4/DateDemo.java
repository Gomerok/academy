package by.academy.homework.homework4;

public class DateDemo {

	public static void main(String[] args) {
		MyDate date1 = new MyDate("12-12-2012");
		MyDate date2 = new MyDate();
		date2.setDate("10-05-2002");
		System.out.println(MyDate.differenceOfDays(date1, date2));
		System.out.println(date1.getDayOfWeek());
		System.out.println(MyDate.leapYear(date2.y.getYear()));
		System.out.println(date1.getDayOfWeek());
	}

}
