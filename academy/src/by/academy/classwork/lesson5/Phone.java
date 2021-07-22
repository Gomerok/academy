package by.academy.classwork.lesson5;

public class Phone extends Product {
	
	private String color;
	private String brend;
	private String country;
	
	public String getCountry(String brend) {
		
		if(brend == "Apple") {
			country = "USA";
		}
		if(brend == "Xiaomi") {
			country = "China";
		}
		
		return country;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrend() {
		return brend;
	}

	public void setBrend(String brend) {
		this.brend = brend;
	}

}
