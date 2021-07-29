package by.academy.classwork.deal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements Validator {

	private static Pattern emailPattern = Pattern.compile("([\\w\\-\\.]+)@([\\w\\-]+\\.)([a-zA-Z]{2,4})");

	public static Pattern getEmailPattern() {
		return emailPattern;
	}

	public static void setEmailPattern(Pattern emailPattern) {
		EmailValidator.emailPattern = emailPattern;
	}

	@Override
	public boolean validate(String number) {
		if (number == null) {
			System.out.println("Вы ничего не ввели, введите email:");
			return false;
		}
		Matcher matcher = emailPattern.matcher(number);
		if (matcher.matches()) {
			System.out.println("Emailе введён правильно");
			return true;
		} else {
			System.out.println("Email введён некорректно, введите заново:");
			return false;
		}
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EmailValidator [getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}

}
