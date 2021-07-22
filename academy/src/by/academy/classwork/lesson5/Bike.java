package by.academy.classwork.lesson5;

public class Bike extends Product {

	private String type;
	private int size;

	public void setAffiliation(int size) {
		if(size < 15) {
			this.type = "Детский";
		}else {
			this.type = "Мужской/Женский";
		}
		
	}
}