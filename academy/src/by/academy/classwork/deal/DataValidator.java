package by.academy.classwork.deal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataValidator implements Validator {

	private static Pattern datePattern1 = Pattern
			.compile("(0[1-9]|[12][0-9]|3[01])[\\/](0[1-9]|1[012])[\\/](19\\d\\d|20\\d\\d)");
	private static Pattern datePattern2 = Pattern
			.compile("(0[1-9]|[12][0-9]|3[01])[\\-](0[1-9]|1[012])[\\-](19\\d\\d|20\\d\\d)");

	DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	LocalDate date ;
	
	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public boolean validate(String input) {
		if (input.equals(null)) {
			System.out.println("Вы ничего не ввели");
			return false;
		}
		if (input.charAt(2) == '/' && input.charAt(5) == '/') {
			Matcher matcher1 = datePattern1.matcher(input);
			matcher1.find();
			date = LocalDate.parse(input, formatter1);
			if (matcher1.matches()) {
				System.out.println("Дата введена правильно");
				System.out.println("Day: <" + date.getDayOfMonth() + "> ");
				System.out.println("Month: <" + date.getMonthValue() + "> ");
				System.out.println("Year: <" + date.getYear() + "> ");
				return true;
			}
		}
		if (input.charAt(2) == '-' && input.charAt(5) == '-') {
			Matcher matcher2 = datePattern2.matcher(input);
			matcher2.find();
			date = LocalDate.parse(input, formatter1);
			if (matcher2.matches()) {
				System.out.println("Дата введена правильно");
				System.out.println("Day: <" + date.getDayOfMonth() + "> ");
				System.out.println("Month: <" + date.getMonthValue() + "> ");
				System.out.println("Year: <" + date.getYear() + "> ");
				return true;
			}
		}
		System.out.println("Дата введена некорректно, введите заново");
		return false;

	}

}
