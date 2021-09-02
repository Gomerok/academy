package by.academy.classwork.lesson16;

public class Tiger extends Cat {

	public int age;
	private String name;
	protected double sped;

	public Tiger() {
		super();
		this.sped = 20;
	}

	public Tiger(int caunt, String country, String type) {
		super(caunt, country, type);
	}

	public Tiger(int age, String name, double sped) {
		this.age = age;
		this.name = name;
		this.sped = sped;
	}

	private int getAge() {
		return age;
	}

	private void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSped() {
		return sped;
	}

	public void setSped(double sped) {
		this.sped = sped;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(sped);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Tiger other = (Tiger) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(sped) != Double.doubleToLongBits(other.sped))
			return false;
		return true;
	}

}
