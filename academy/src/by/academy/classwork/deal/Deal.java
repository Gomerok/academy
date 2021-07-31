package by.academy.classwork.deal;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class Deal {

	private Product products[];
	private User seller = new User();
	private User buyer = new User();
	private LocalDate deadlineDate;
	private final LocalDate date = LocalDate.now();
	private static Scanner scan = new Scanner(System.in);
	private static Scanner scan2 = new Scanner(System.in);

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

	public void enterDateOfBirth() {
		System.out.println("Введите дату в формате dd/MM/yyyy или dd-MM-yyyy:");
		String dataTemp;
		DataValidator dataValidate = new DataValidator();

		do {
			dataTemp = scan2.nextLine();
		} while (dataValidate.validate(dataTemp) == false);
		getBuyer().setDateOfBirth(dataValidate.getDate());

	}

	public void initializationUser(User user) {
		System.out.println("Введите свои данные:\n" + "Имя:");
		user.setName(scan2.nextLine());
		System.out.println(user.getName());
		enterDateOfBirth();
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
				user.setNumber(userField);
				break;
			case 2:
				System.out.println("Введите ,белорусский номер номер (+375..-...-..-..):");
				BelarusPhoneValidator validateBelarusPhone = new BelarusPhoneValidator();
				do {
					userField = scan2.nextLine();
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
			userField = scan2.nextLine();
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
		Product[] removeProd = new Product[products.length - 1];
		for (Product p : getProducts()) {
			System.out.println(p.getName() + " price: " + p.calcPrice());
		}
		
		System.out.println("Введите название продукта из списка который вы хотите удалить:");
		
		String nameProduct = scan2.nextLine();
		
		for (int i=0, j=0;j<products.length;j++) {
			if(products[j].name.equals(nameProduct)!=true) {
				removeProd[i]=products[j];
				i++;
			}
		
		}
		products=removeProd;
	}

	public Product createProducts() {
		  Product product;
		  product =new Phone("Apple7", 100.0, 1, "bluy", "Apple");
		  return product;
	}

	public LocalDate getDeadlineDate() {
		return deadlineDate;
	}

	public void setDeadlineDate(LocalDate deadlineDate) {
		this.deadlineDate = deadlineDate;
	}

	public void deal() {
		int choiceMenu = 0;
		do {
			System.out.println("Меню:\n" + "Для ввода своих данных введите 0\n"
					+ "Для просмотра списка возможных продуктов введите 1\n" + "Для добавления продукта введите 2\n"
					+ "Для удаления продукта введите 3\n" + "Для просмотра продуктов введите 4\n"
					+ "Для просмотра deadline введите 5\n" + "Для просмотра информации о клиенте введите 6\n"
					+ "Для вывода чека введите 7\n" + "Чтобы выйти введите 8\n");
			choiceMenu = scan.nextInt();
			switch (choiceMenu) {
			case 0:
				initializationUser(buyer);
				break;
			case 1:
				break;
			case 2:
				addProduct(createProducts());
				break;
			case 3:
				removeProducts();
				break;
			case 4:
				break;
			case 5:
				printdeadlineDate();
				break;
			case 6:
				getBuyer().getUserData();
				break;
			case 7:
				System.out.println(date.getDayOfMonth() + "." + date.getMonthValue() + "." + date.getYear());
				System.out.println("Bill:");
				for (Product p : getProducts()) {
					System.out.println(p.getName() + " price: " + p.calcPrice());
				}

				System.out.println("-------------------------");
				System.out.println(calcFullPrice());

				break;
			}
		} while (choiceMenu != 8);

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
