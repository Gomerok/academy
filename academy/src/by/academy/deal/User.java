package by.academy.deal;

import java.time.LocalDate;
import java.util.Objects;

public class User {

	private String name;
	private String number;
	private String email;
	private LocalDate dateOfBirth;

	public User() {
		super();

	}

	public User(String name, String number, String email, LocalDate dateOfBirth) {
		super();
		this.name = name;
		this.number = number;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void getUserData() {
		if (getName() != null && getNumber() != null && getEmail() != null && getDateOfBirth() != null) {
			System.out.println("Данные о пользователе:");
			System.out.println("Имя: " + getName());
			System.out.println("Телефон: " + getNumber());
			System.out.println("Email: " + getEmail());
			System.out.println("День рождения: " + getDateOfBirth().getDayOfMonth() + "."
					+ getDateOfBirth().getMonthValue() + "." + getDateOfBirth().getYear());
		} else {
			System.out.println("Данные о пользователе ещё не введены!");
		}

	}

	@Override
	public int hashCode() {
		return Objects.hash(dateOfBirth, email, name, number);
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
		return Objects.equals(dateOfBirth, other.dateOfBirth) && Objects.equals(email, other.email)
				&& Objects.equals(name, other.name) && Objects.equals(number, other.number);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [name=");
		builder.append(name);
		builder.append(", number=");
		builder.append(number);
		builder.append(", email=");
		builder.append(email);
		builder.append(", dateOfBirth=");
		builder.append(dateOfBirth);
		builder.append("]");
		return builder.toString();
	}

}
