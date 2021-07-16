package by.academy.homework.homework0;

public class AnimalDemo {

	public static void main(String[] args) {
	
		Animal birds = new Animal();
		birds.setAge(14);
		birds.setNickname("Valera");
		Animal beer = new Animal(12,"Vity");
		Animal elephant = new Animal(3,"Mariya");
		System.out.println(birds.getAge() + "???" + birds.getNickname());
		System.out.println(beer.age + "&&&" + beer.nickname);
		System.out.println(elephant);

	}

}
