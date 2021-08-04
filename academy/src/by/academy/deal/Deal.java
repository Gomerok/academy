package by.academy.classwork.deal;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Deal {

	private Product products[];
	private User seller = new User();
	private User buyer = new User();
	private LocalDate deadlineDate;
	private final LocalDate date = LocalDate.now();
	private static Scanner scanStr = new Scanner(System.in);
	private static Pattern patternInt = Pattern.compile("[+]?\\d+");
	private static Pattern patternDouble = Pattern.compile("(-|\\+)?[0-9]+(\\.[0-9]{1,2})");

	public Deal() {
		super();
	}

	public Deal(Product[] products, User seller, User buyer, LocalDate date) {
		super();
		this.products = products;
		this.seller = seller;
		this.buyer = buyer;
	}

	public Product[] getProducts() {
		return products;
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

	public LocalDate getDate() {
		return date;
	}

	public void printdeadlineDate() {
		setDeadlineDate(date.plusDays(10));
		System.out.println(getDeadlineDate());
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

	public void enterDateOfBirth(User user) {
		System.out.println("Введите дату в формате dd/MM/yyyy или dd-MM-yyyy:");
		String dataTemp;
		DataValidator dataValidate = new DataValidator();

		do {
			dataTemp = scanStr.nextLine();
		} while (dataValidate.validate(dataTemp) == false);
		user.setDateOfBirth(DataValidator.getDate());

	}

	public void initializationUser(User user) {
		System.out.println("Введите данные:\n" + "Имя:");
		user.setName(scanStr.nextLine());
		enterDateOfBirth(user);
		System.out.println(
				"У вас американский или белорусский номер?\n" + "Если американский введите 1, если белорусский 2");
		String userField;
		int choicePhone;
		do {
			choicePhone = intValidate();
			while (choicePhone > 2 || choicePhone <= 0) {
				System.out.println("1 или 2");
				choicePhone = intValidate();
			}

			switch (choicePhone) {
			case 1:
				System.out.println("Введите американский номер (+1-...-...-....):");
				AmericanPhoneValidator validateAmericanPhone = new AmericanPhoneValidator();
				do {
					userField = scanStr.nextLine();
				} while (validateAmericanPhone.validate(userField) == false);
				user.setNumber(userField);
				break;
			case 2:
				System.out.println("Введите ,белорусский номер номер (+375..-...-..-..):");
				BelarusPhoneValidator validateBelarusPhone = new BelarusPhoneValidator();
				do {
					userField = scanStr.nextLine();
				} while (validateBelarusPhone.validate(userField) == false);
				user.setNumber(userField);
				break;
			default:
				System.out.println("Введите 1 или 2:");
			}

		} while (user.getNumber() == null);

		System.out.println("Введите email:");
		EmailValidator validateEmail = new EmailValidator();
		do {
			userField = scanStr.nextLine();
			if (validateEmail.validate(userField) == true) {
				user.setEmail(userField);
			}
		} while (user.getEmail() == null);
	}

	public void addProduct(Product product) {
		Product[] addProd = new Product[products.length + 1];
		for (int i = 0; i < products.length; i++) {
			addProd[i] = products[i];
		}
		addProd[products.length] = product;
		products = addProd;
	}

	public void removeProducts() {

		showProducts();
		Product[] removeProd = new Product[products.length - 1];

		System.out.println("Введите номер продукта в списке который вы хотите удалить:");

		int productIndex = intValidate();
		while (productIndex > products.length || productIndex < 0) {
			System.out.println("Введите существующий номер!");
			productIndex = intValidate();
		}

		for (int i = 0, j = 0; j < products.length; j++) {
			if (products[j].equals(products[productIndex]) != true) {
				removeProd[i] = products[j];
				i++;
			}

		}
		products = removeProd;
	}

	public Product createProducts() {
		Product product;
		System.out.println(
				"Какой продукт вы хотиде добавить ?\n" + "1) Milk\n" + "2) Phone\n" + "3) Bike\n" + "Введите номер:");

		int productIndex = intValidate();
		while (productIndex > 3 || productIndex < 1) {
			System.out.println("Введите существующий номер!");
			productIndex = intValidate();
		}

		System.out.println("Введите название:");
		String name = scanStr.nextLine();
		System.out.println("Введите цену рубли и копейки через точку цифрами (р.к) :");
		double price = doubleValidate();
		System.out.println("Введите количество:");
		int quantity = intValidate();

		if (productIndex == 1) {
			System.out.println("Введите название производителя:");
			String manufacturer = scanStr.nextLine();
			System.out.println("Введите объём:");
			double volume = doubleValidate();
			System.out.println("Введите жирность:");
			double fatContent = doubleValidate();
			product = new Milk(name, price, quantity, manufacturer, volume, fatContent);
		}
		if (productIndex == 2) {
			System.out.println("Введите цвет:");
			String color = scanStr.nextLine();
			System.out.println("Введите название производителя:");
			String brend = scanStr.nextLine();
			product = new Phone(name, price, quantity, color, brend);
		} else {
			String type = scanStr.nextLine();
			int size = intValidate();
			product = new Bike(name, price, quantity, type, size);
		}
		return product;
	}

	public int intValidate() {
		String str = scanStr.nextLine();
		Matcher matcherInt = patternInt.matcher(str);
		while (matcherInt.matches() == false) {
			System.out.println("Введите число!");
			str = scanStr.nextLine();
			matcherInt = patternInt.matcher(str);
		}
		return Integer.parseInt(str);
	}

	public double doubleValidate() {
		String str = scanStr.nextLine();
		Matcher matcherDouble = patternDouble.matcher(str);
		while (matcherDouble.matches() == false) {
			System.out.println("Введите число с плавающей точкой!");
			str = scanStr.nextLine();
			matcherDouble = patternDouble.matcher(str);
		}

		return Double.parseDouble(str);
	}

	public void showProducts() {
		int i = 0;
		System.out.println("Продукты в корзине:");
		for (Product p : getProducts()) {
			System.out.println(i + ")" + p.getName() + " количество: " + p.quantity + " цена: " + p.calcPrice());
			i++;
		}
	}

	public LocalDate getDeadlineDate() {
		return deadlineDate;
	}

	public void setDeadlineDate(LocalDate deadlineDate) {
		this.deadlineDate = deadlineDate;
	}

	public void deal() {

		int choiceMenu;
		do {
			System.out.println("Меню:\n" + "Для ввода данных buyer введите 1\n" + "Для ввода данных seller введите 2\n"
					+ "Для добавления продукта введите 3\n" + "Для удаления продукта введите 4\n"
					+ "Для просмотра выбранных продуктов введите 5\n" + "Для просмотра дедлайна сделки введите 6\n"
					+ "Для просмотра информации о seller и buyer введите 7\n" + "Для вывода чека введите 8\n"
					+ "Чтобы выйти введите 9\n");
			choiceMenu = intValidate();
			switch (choiceMenu) {
			case 1:
				initializationUser(buyer);
				break;
			case 2:
				initializationUser(seller);
				break;
			case 3:
				addProduct(createProducts());
				break;
			case 4:
				removeProducts();
				break;
			case 5:
				showProducts();
				break;
			case 6:
				printdeadlineDate();
				break;
			case 7:
				System.out.println("Buyer: ");
				buyer.getUserData();
				System.out.println("Seller: ");
				seller.getUserData();
				break;
			case 8:
				System.out.println(date.getDayOfMonth() + "." + date.getMonthValue() + "." + date.getYear());
				System.out.println("Bill:");
				for (Product p : getProducts()) {
					System.out.println(p.getName() + " price: " + p.calcPrice());
				}

				System.out.println("-------------------------");
				System.out.println(calcFullPrice());

				break;
			}
		} while (choiceMenu != 9);

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
