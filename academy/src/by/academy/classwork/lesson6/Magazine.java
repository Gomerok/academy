package by.academy.classwork.lesson6;

public class Magazine implements Printable {

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void print() {
		System.out.println("Magazine");
	}

}
