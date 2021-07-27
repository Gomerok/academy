package by.academy.classwork.deal;

import java.util.Objects;

public class Phone extends Product {
	
	private String color;
	private String brend;
	
	public Phone() {
		super();
	}

	public Phone(String name, double price, int quantity,String color, String brend) {
		super(name, price, quantity);
		this.color = color;
		this.brend = brend;
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(brend, color);
		return result;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Phone other = (Phone) obj;
		return Objects.equals(brend, other.brend) && Objects.equals(color, other.color);
	}

	
	@Override
	protected double discount() {
		if(quantity>3) {
			return 0.25;
		}
		return 0;
	}

}
