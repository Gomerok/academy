package by.academy.classwork.deal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;
import java.util.Calendar;

//import java.util.*;
//import java.text.*;

public class DataValidator implements Validator {

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
		if (date.charAt(2) == '/' && date.charAt(5) == '/') {
			Matcher matcher1 = datePattern1.matcher(date);
			matcher1.find();
			Date dateSDF = new SimpleDateFormat("dd/MM/yyyy").parse(matcher1.group());
			// Date dateNow = new Date();
		    //  SimpleDateFormat dateSDF = new SimpleDateFormat("\"Day: <dd>\nMonth: </MM/yyyy");
			if (matcher1.matches()) {
				System.out.println("Дата введена правильно");
				//System.out.println("Текущая дата " + dateSDF.format(date));
				calendar.setTime(dateSDF);
				System.out.println("Day: <" + calendar.get(Calendar.DAY_OF_MONTH) + "> ");
				System.out.println("Month: <" + (calendar.get(Calendar.MONTH)) + "> ");
				System.out.println("Year: <" + calendar.get(Calendar.YEAR) + "> ");
				return true;
			}
		}
		if (date.charAt(2) == '-' && date.charAt(5) == '-') {
			Matcher matcher2 = datePattern2.matcher(date);
			matcher2.find();
			Date dateSDF = new SimpleDateFormat("dd-MM-yyyy").parse(matcher2.group());
			if (matcher2.matches()) {
				System.out.println("Дата введена правильно");
				calendar.setTime(dateSDF);
				System.out.println("Day: <" + calendar.get(Calendar.DAY_OF_MONTH) + "> ");
				System.out.println("Month: <" + (calendar.get(Calendar.MONTH) + 1) + "> ");
				System.out.println("Year: <" + calendar.get(Calendar.YEAR) + "> ");
				return true;
			}
		}
		System.out.println("Дата введена некорректно, введите заново");
		return false;

	}

}
