package by.academy.classwork.deal;

public class Bike extends Product {

	private String type;
	private int size;

//	public void setAffiliation(int size) {
//		if(size < 15) {
//			this.type = "Детский";
//		}else {
//			this.type = "Мужской/Женский";
//		}
//		
//	}

	public Bike() {
		super();
	}

	public Bike(String name, double price, int quantity,String type, int size) {
		super(name, price, quantity);
		this.type = type;
		this.size = size;
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
	
	@Override
	protected double discount(){
		if(price<500) {
			return 0.7;
		}
		return 0;
	}
}