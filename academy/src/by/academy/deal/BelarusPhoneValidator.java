package by.academy.deal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator {

	private static Pattern belarusPhonePattern = Pattern.compile("(\\+375)(17|29|44|33|25)(-\\d{3}-\\d{2}-\\d{2})");

	public static Pattern getBelarusPhonePattern() {
		return belarusPhonePattern;
	}

	public static void setBelarusPhonePattern(Pattern belarusPhonePattern) {
		BelarusPhoneValidator.belarusPhonePattern = belarusPhonePattern;
	}

	@Override
	public boolean validate(String number) {
		if (number == null) {
			System.out.println("Вы ничего не ввели, введите номер:");
			return false;
		}
		Matcher matcher = belarusPhonePattern.matcher(number);
		if (matcher.matches()) {
			System.out.println("Номер введён правильно");
			return true;
		} else {
			System.out.println("Номер введён некорректно, введите заново:");
			return false;
		}
	}
}
