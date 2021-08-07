package by.academy.homework.homework4;

public class DateDemo {

	public static void main(String[] args) {
		MyDate date2 = new MyDate("8-10-2016");
		MyDate date1 = new MyDate();
		date1.setDate("16-12-2016");

		System.out.println(MyDate.differenceOfDays(date1, date2));
		System.out.println(MyDate.leapYear(2011));
		System.out.println(date1.leapYear());
		System.out.println(date2.getDayOfWeek());
	}

}
