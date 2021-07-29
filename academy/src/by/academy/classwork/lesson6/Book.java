package by.academy.classwork.lesson6;

public class Book implements Printable {

	String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void print() {
		System.out.println("Book");
	}
	
	/*
	 * public static void printBook(Printable printable[]) { for(Printable o :
	 * printable) { if(o instansof )
	 * 
	 * }
	 * 
	 * 
	 * }
	 */
	

}
