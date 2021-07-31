package by.academy.classwork.deal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataValidator implements Validator {

	private static Pattern datePattern1 = Pattern
			.compile("(0[1-9]|[12][0-9]|3[01])([\\/])(0[1-9]|1[012])([\\/])(19\\d\\d|20\\d\\d)");
	private static Pattern datePattern2 = Pattern
			.compile("(0[1-9]|[12][0-9]|3[01])([\\-])(0[1-9]|1[012])([\\-])(19\\d\\d|20\\d\\d)");

	DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	LocalDate date;

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public boolean validate(String input) {
		Matcher matcher1 = datePattern1.matcher(input);
		Matcher matcher2 = datePattern2.matcher(input);
		matcher1.find();
		matcher2.find();
		if (input.equals(null)) {
			System.out.println("Вы ничего не ввели");
			return false;
		}

		if (input.charAt(2) == '/' && input.charAt(5) == '/') {
			if ((Integer.parseInt(matcher1.group(5)) % 400 == 0) || ((Integer.parseInt(matcher1.group(5)) % 4 == 0)
					&& (Integer.parseInt(matcher1.group(5)) % 100 != 0))) {
				if (Integer.parseInt(matcher1.group(3)) == 2 && Integer.parseInt(matcher1.group(1)) > 29) {
					System.out.println("Дата введена некорректно, введите заново");
					return false;
				}
			} else if (Integer.parseInt(matcher1.group(1)) == 2 && Integer.parseInt(matcher1.group(1)) > 28) {
				System.out.println("Дата введена некорректно, введите заново");
				return false;
			}
			if (matcher1.matches()) {
				date = LocalDate.parse(input, formatter1);
				System.out.println("Дата введена правильно");
				System.out.println("Day: <" + date.getDayOfMonth() + "> ");
				System.out.println("Month: <" + date.getMonthValue() + "> ");
				System.out.println("Year: <" + date.getYear() + "> ");
				return true;
			}
		}
		if (input.charAt(2) == '-' && input.charAt(5) == '-') {
			if ((Integer.parseInt(matcher2.group(5)) % 400 == 0) || ((Integer.parseInt(matcher2.group(5)) % 4 == 0)
					&& (Integer.parseInt(matcher2.group(5)) % 100 != 0))) {
				if (Integer.parseInt(matcher2.group(3)) == 2 && Integer.parseInt(matcher2.group(1)) > 29) {
					System.out.println("Дата введена некорректно, введите заново");
					return false;
				}
			} else if (Integer.parseInt(matcher2.group(1)) == 2 && Integer.parseInt(matcher2.group(1)) > 28) {
				System.out.println("Дата введена некорректно, введите заново");
				return false;
			}

			if (matcher2.matches()) {
				date = LocalDate.parse(input, formatter2);
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
