package by.academy.classwork.deal;

import java.util.Objects;

public class Bike extends Product {

	private String type;
	private int size;

	public Bike() {
		super();
	}

	public Bike(String name, double price, int quantity, String type, int size) {
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
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(size, type);
		return result;
	}

	@Override
	protected double discount() {
		if (size < 15) {
			return 0.3;
		}
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bike other = (Bike) obj;
		return size == other.size && Objects.equals(type, other.type);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bike [type=");
		builder.append(type);
		builder.append(", size=");
		builder.append(size);
		builder.append("]");
		return builder.toString();
	}

}