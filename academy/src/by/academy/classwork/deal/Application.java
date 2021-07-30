package by.academy.classwork.deal;

public class Application {

	public static void main(String[] args) {
//		Имя: sddds
//		Телефон: +37544-794-32-59
//		Email: dg.dsdf@gmail.com
//		День рождения: 2021-12-12
		
//		Проверка на високосные даты в dateValidator.И подправить сам валидатор.
//		Добавить ещё 1 продукт.
//		Добавить в Deal меню, которое позволяет добавить продукт, удалить продукт из массива по названию продукта.
//		Разобраться с scanner
		
		Deal deal = new Deal();
		User seller = new User();
		User buyer = new User();
		Product products[] = new Product[3];

		products[0] = new Phone("Apple12", 200.0, 2, "red", "Apple");
		products[1] = new Bike("Norco", 200.0, 1, "Mountainbike", 16);
		products[2] = new Bike("Gaint", 200.0, 1, "Roadbike", 17);

		deal.setBuyer(buyer);
		deal.setSeller(seller);

		deal.setProducts(products);
		
		deal.deal();

	}

}
