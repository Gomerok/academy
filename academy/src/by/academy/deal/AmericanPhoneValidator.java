package by.academy.deal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator {

	private static Pattern americanPhonePattern = Pattern.compile("\\+\\d\\-\\d{3}-\\d{3}-\\d{4}");

	public static Pattern getAmericanPhonePattern() {
		return americanPhonePattern;
	}

	public static void setAmericanPhonePattern(Pattern americanPhonePattern) {
		AmericanPhoneValidator.americanPhonePattern = americanPhonePattern;
	}

	@Override
	public boolean validate(String number) {

		if (number == null) {
			System.out.println("Вы ничего не ввели, введите номер:");
			return false;
		}
		Matcher matcher = americanPhonePattern.matcher(number);
		if (matcher.matches()) {
			System.out.println("Номер введён правильно");
			return true;
		} else {
			System.out.println("Номер введён некорректно, введите заново:");
			return false;
		}
	}
}
