package by.academy.classwork.deal;

public class Phone extends Product {
	
	private String color;
	private String brend;
	//private String country;
	
	public Phone() {
		super();
	}

	
	public Phone(String name, double price, int quantity,String color, String brend) {
		super(name, price, quantity);
		this.color = color;
		this.brend = brend;
		//this.country = country;
	}

//	public String getCountry() {
//		return country;
//	}
//
//	public void setCountry(String country) {
//		this.country = country;
//	}

//	public String getCountry(String brend) {
//		
//		if(brend == "Apple") {
//			country = "USA";
//		}
//		if(brend == "Xiaomi") {
//			country = "China";
//		}
//		
//		return country;
//	}

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


	@Override
	protected double discount() {
		if(price<500) {
			return 0.7;
		}
		return 0;
	}

}
