package by.academy.classwork.deal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.util.Calendar;

public class DataValidator implements Validator {

//	Написать класс, который проверял бы введенную дату на соответствие патерна: (использовать regexp)
//	   a) dd/MM/yyyy
//	   b) dd-MM-yyyy 
//
//	С помощью SimpleDateFormat пропарсить данные, введеные с консоли, в зависимости от паттерна, к которому дата подходит.
//	Вывести строку в следующем формате:
//		День: <Day>
//		Месяц: <Month>
//		Year: <Year>

	private static Pattern datePattern1 = Pattern
			.compile("(0[1-9]|[12][0-9]|3[01])[\\/](0[1-9]|1[012])[\\/](19\\d\\d|20\\d\\d)");
	private static Pattern datePattern2 = Pattern
			.compile("(0[1-9]|[12][0-9]|3[01])[\\-](0[1-9]|1[012])[\\-](19\\d\\d|20\\d\\d)");
	Calendar calendar = Calendar.getInstance();

	@Override
	public boolean validate(String date) throws ParseException {
		if (date == null) {
			System.out.println("Вы ничего не ввели");
			return false;
		}
		if (date.charAt(2) == '/') {
			Matcher matcher1 = datePattern1.matcher(date);
			matcher1.find();
			Date dateSDF = new SimpleDateFormat("dd/MM/yyyy").parse(matcher1.group());
			if (matcher1.matches()) {
				System.out.println("Дата введена правильно");
				calendar.setTime(dateSDF);
				System.out.println("Day: <" + calendar.get(Calendar.DAY_OF_MONTH) + "> ");
				System.out.println("Month: <" + (calendar.get(Calendar.MONTH) + 1) + "> ");
				System.out.println("Year: <" + calendar.get(Calendar.YEAR) + "> ");
//				День: <Day>
//				Месяц: <Month>
//				Year: <Year>
				return true;
			}
		}
		if (date.charAt(2) == '-') {
			Matcher matcher = datePattern2.matcher(date);
			if (matcher.matches()) {
				System.out.println("Дата введена правильно");
//				День: <Day>
//				Месяц: <Month>
//				Year: <Year>
				return true;
			}
		}
		System.out.println("Дата введена некорректно");
		return false;

	}

}
