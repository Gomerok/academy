package by.academy.homework.homework1;

public class Cat {

	int age;
	String nickname;
	int money;
	char initials;
	boolean isHomeAnimal;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}
	
	public char getInitials() {
		return initials;
	}
	
	public void setInitials(String nickname) {
		this.initials = nickname.charAt(0);
	}
	
	public boolean getIsHomeAnimal() {
		return isHomeAnimal;
	}
	
	public void setIsHomeAnimal(boolean isHomeAnimal) {
		this.isHomeAnimal = isHomeAnimal;
	}
	
	public Cat() {
		super();
	}

	public Cat(String nickname) {
		super();
		this.nickname = nickname;
	}

	public void grow() {
		this.age++;
	}

	public void sleep() {
		System.out.println("Cat " + this.nickname + " sleep");
	}

	public void eat() {
		System.out.println("Cat " + this.nickname + " eat");
	}

	public void walk() {
		System.out.println("Cat " + this.nickname + " walk");
	}

	
	@Override
	public String toString() {
		return "Cat [age=" + age + ", nickname=" + nickname + ", money=" + money + ", initials=" + initials
				+ ", isHomeAnimal=" + isHomeAnimal + "]";
	}

	
}
