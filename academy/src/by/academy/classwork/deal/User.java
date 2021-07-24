package by.academy.classwork.deal;

public class User {

	private String name;
	private int maney;

	public User() {
		super();

	}

	public User(String name, int maney) {
		super();
		this.name = name;
		this.maney = maney;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getManey() {
		return maney;
	}

	public void setManey(int maney) {
		this.maney = maney;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + maney;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		User other = (User) obj;
		if (maney != other.maney)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [name=");
		builder.append(name);
		builder.append(", maney=");
		builder.append(maney);
		builder.append("]");
		return builder.toString();
	}

}
