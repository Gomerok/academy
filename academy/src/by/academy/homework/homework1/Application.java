package by.academy.homework.homework1;

public class Application {

	public static void main(String[] args) {

		Cat valera = new Cat();
		Cat vitek = new Cat("Vitek");
		System.out.println(vitek.getInitials());
		vitek.eat();
		vitek.sleep();
		vitek.walk();
		vitek.setInitials(vitek.getNickname());
		System.out.println(vitek.getInitials());
		valera.grow();
		valera.grow();
		valera.grow();
		System.out.println(valera.getNickname() + " is " + valera.getAge() + " years old");
	}

}
