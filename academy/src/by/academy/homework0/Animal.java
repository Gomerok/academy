package by.academy.task1_animal;

public class Animal {

	int age;
	String nickname;

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
	
	public Animal() {
		
	}
	
	public Animal(int age, String nickname) {
		super();
		this.age = age;
		this.nickname = nickname;
	}

	@Override
	public String toString() {
		return this.nickname +" [age=" + age + ", nickname=" + nickname + "]";
	}

	
}
