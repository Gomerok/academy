package by.academy.classwork.lesson10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.academy.classwork.lesson10.exceptions.WrongLoginException;
import by.academy.classwork.lesson10.exceptions.WrongPasswordException;

public class LoginIn {

	public static Pattern loginInPattern = Pattern.compile("[a-zA-Z0-9_]{1,20}");

	public static boolean isValidate(String login, String password, String confirmPassword)
			throws WrongLoginException, WrongPasswordException {

		if (login == null) {
			System.out.println("Login null");
			throw new WrongLoginException("Login пуст");
		}
		if (password == null) {
			System.out.println("Password null");
			throw new WrongPasswordException("Password пуст");
		}
		if (confirmPassword == null) {
			System.out.println("confPassword null");
			throw new WrongPasswordException("confPassword пуст");
		}

		Matcher matchLog = loginInPattern.matcher(password);
		Matcher matchPass = loginInPattern.matcher(password);
		if (!matchLog.matches()) {
			throw new WrongLoginException("Login false");
		}
		if (!matchPass.matches()) {
			throw new WrongPasswordException("Password false");
		} else if (!password.equals(confirmPassword)) {
			throw new WrongPasswordException("Password false");
		}

		return true;
	}

	public static void main(String[] args) {

		String login = "sdf";
		String pass = "asdsd";
		String confPass = "asdsd";
		boolean conf;
		try {
			conf = isValidate(login, pass, confPass);
			System.out.println(conf);
		} catch (WrongLoginException | WrongPasswordException e) {
			System.out.println(e.getMessage());
		}
	}

}
