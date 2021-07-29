package by.academy.classwork.deal;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Deal {

	private Product products[];
	private User seller = new User();
	private User buyer = new User();
	private Date date;
	private static Scanner scan = new Scanner(System.in);
	private static Scanner scan2 = new Scanner(System.in);

	public Deal() {
		super();
	}

	public Deal(Product[] products, User seller, User buyer, Date date) {
		super();
		this.products = products;
		this.seller = seller;
		this.buyer = buyer;
		this.date = date;
	}

	public Product[] getProducts() {
		return products;
	}

	public static Scanner getScan() {
		return scan;
	}

	public void setProducts(Product[] products) {
		this.products = products;
	}

	public User getSeller() {
		return seller;
	}

	public void setSeller(User seller) {
		this.seller = seller;
	}

	public User getBuyer() {
		return buyer;
	}

	public void setBuyer(User buyer) {
		this.buyer = buyer;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double calcFullPrice() {
		double fullPrice = 0;

		if (products != null) {
			for (Product p : products) {
				fullPrice += p.calcPrice();
			}
		}
		return fullPrice;
	}

	public void initializationUser() {
		System.out.println("Введите свои данные:\n" + "Имя:");
		getBuyer().setName(scan.nextLine());
		System.out.println(
				"У вас американский или белорусский номер?\n" + "Если американский введите 1, если белорусский 2");
		String userField;
		int choicePhone;
		do {
			choicePhone = scan.nextInt();
			switch (choicePhone) {
			case 1:
				System.out.println("Введите американский номер (+1-...-...-....):");
				AmericanPhoneValidator validateAmericanPhone = new AmericanPhoneValidator();
				do {
					userField = scan2.nextLine();
				} while (validateAmericanPhone.validate(userField) == false);
				getBuyer().setNumber(userField);
				break;
			case 2:
				System.out.println("Введите ,белорусский номер номер (+375..-...-..-..):");
				BelarusPhoneValidator validateBelarusPhone = new BelarusPhoneValidator();
				do {
					userField = scan2.nextLine();
				} while (validateBelarusPhone.validate(userField) == false);
				getBuyer().setNumber(userField);
				break;
			default:
				System.out.println("Введите 1 или 2:");
			}

		} while (getBuyer().getNumber() == null);

		System.out.println("Введите email:");
		EmailValidator validateEmail = new EmailValidator();
		do {
			userField = scan2.nextLine();
			if (validateEmail.validate(userField) == true) {
				getBuyer().setEmail(userField);
			}
		} while (getBuyer().getEmail() == null);
	}

	public void addProducts() {

	}

	public void removeProducts() {

	}

	public void createProducts() {
	}
	
	public void deal() {
//		+37544-794-32-59
//		danila.gomerov@gmail.com
		initializationUser();
		int choiceMenu = 0;
		do {
			System.out.println("Меню:\n" + "Для просмотра списка возможных продуктов введите 1\n"
					+ "Для добавления продукта введите 2\n" + "Для удаления продукта введите 3\n"
					+ "Для просмотра продуктов введите 4\n" + "Для просмотра информации о клиенте введите 5\n"
					+ "Для вывода чека введите 6\n" + "Чтобы выйти введите 7\n");
			choiceMenu = getScan().nextInt();
			switch (choiceMenu) {
			case 1:
				break;
			case 2:
				addProducts();
				break;
			case 3:
				removeProducts();
				break;
			case 4:
				
				break;
			case 5:
				getBuyer().getUserData();
				break;
			case 6:
				System.out.println("Bill:");
				for (Product p : getProducts()) {
					System.out.println(p.getName() + " price: " + p.calcPrice());
				}

				System.out.println("-------------------------");
				System.out.println(calcFullPrice());
				break;
			}
		} while (choiceMenu != 7);

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((buyer == null) ? 0 : buyer.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + Arrays.hashCode(products);
		result = prime * result + ((seller == null) ? 0 : seller.hashCode());
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
		Deal other = (Deal) obj;
		if (buyer == null) {
			if (other.buyer != null)
				return false;
		} else if (!buyer.equals(other.buyer))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (!Arrays.equals(products, other.products))
			return false;
		if (seller == null) {
			if (other.seller != null)
				return false;
		} else if (!seller.equals(other.seller))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Deal [products=");
		builder.append(Arrays.toString(products));
		builder.append(", seller=");
		builder.append(seller);
		builder.append(", buyer=");
		builder.append(buyer);
		builder.append(", date=");
		builder.append(date);
		builder.append("]");
		return builder.toString();
	}

}
