package by.academy.classwork.lesson16;

public class Cat {

	public int caunt;
	private String country;
	protected String type;
	public Cat() {
		super();
		this.country = "Belarus";
	}
	public Cat(int caunt, String country, String type) {
		this.caunt = caunt;
		this.country = country;
		this.type = type;
	}
	
	private int getCaunt() {
		return caunt;
	}
	private void setCaunt(int caunt) {
		this.caunt = caunt;
	}

	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + caunt;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cat other = (Cat) obj;
		if (caunt != other.caunt)
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
	
	
}
