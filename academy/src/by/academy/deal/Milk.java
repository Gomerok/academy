package by.academy.deal;

import java.util.Objects;

public class Milk extends Product {

	private String manufacturer;
	private double volume;
	private double fatContent;

	public Milk() {
		super();
	}

	public Milk(String name, double price, int quantity, String manufacturer, double volume, double fatContent) {
		super(name, price, quantity);
		this.manufacturer = manufacturer;
		this.volume = volume;
		this.fatContent = fatContent;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getFatContent() {
		return fatContent;
	}

	public void setFatContent(double fatContent) {
		this.fatContent = fatContent;
	}

	@Override
	protected double discount() {
		if (volume > 3) {
			return 0.15;
		}
		return 0;
	}

	@Override
	protected String[] getParameters() {
		String parameters[] = new String[3];

		parameters[0] = Double.toString(fatContent);
		parameters[1] = manufacturer;
		parameters[2] = Double.toString(volume);
		return parameters;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(fatContent, manufacturer, volume);
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
		Milk other = (Milk) obj;
		return Double.doubleToLongBits(fatContent) == Double.doubleToLongBits(other.fatContent)
				&& Objects.equals(manufacturer, other.manufacturer)
				&& Double.doubleToLongBits(volume) == Double.doubleToLongBits(other.volume);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Milk [manufacturer=");
		builder.append(manufacturer);
		builder.append(", volume=");
		builder.append(volume);
		builder.append(", fatContent=");
		builder.append(fatContent);
		builder.append("]");
		return builder.toString();
	}

}
