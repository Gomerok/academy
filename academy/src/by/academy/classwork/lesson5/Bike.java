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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}