package by.academy.homework1;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat valera = new Cat();
		Cat vitek = new Cat("Vitek");

		vitek.eat();
		vitek.sleep();
		vitek.walk();
		vitek.setInitials(vitek.nickname);
		System.out.println(vitek.getInitials());
		valera.grow();
		valera.grow();
		valera.grow();
		System.out.println(valera.getNickname() + " is " + valera.age + " years old");
	}

}
