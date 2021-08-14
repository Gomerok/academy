package by.academy.classwork.lesson10.exceptions;

public class WrongPasswordException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5549798746238275122L;
	
	public WrongPasswordException() {
		super();
	}

	public WrongPasswordException(String message) {
		super(message);
	}
}
