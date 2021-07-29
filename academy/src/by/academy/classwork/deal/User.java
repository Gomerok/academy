package by.academy.classwork.deal;

import java.util.Objects;

public class User {

	private String name;
	private int maney;
	private String number;
	private String email;
	private String dateOfBirth;

	public User(String name, int maney, String number, String email) {
		super();
		this.name = name;
		this.maney = maney;
		this.number = number;
		this.email = email;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

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

	public void getUserData() {
		System.out.println("Данные о пользователе:");
		System.out.println(getName());
		System.out.println(getNumber());
		System.out.println(getEmail());
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, maney, name, number);
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
		return Objects.equals(email, other.email) && maney == other.maney && Objects.equals(name, other.name)
				&& Objects.equals(number, other.number);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [name=");
		builder.append(name);
		builder.append(", maney=");
		builder.append(maney);
		builder.append(", number=");
		builder.append(number);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}

}
