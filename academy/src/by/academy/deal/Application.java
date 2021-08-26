package by.academy.deal;

public class Application {

	public static void main(String[] args) {

		Deal deal = new Deal();
		User seller = new User();
		User buyer = new User();
		Product products[] = new Product[4];

		products[0] = new Phone("IPhone12", 1000.0, 2, "red", "Apple");
		products[1] = new Bike("Norco", 2000.0, 1, "Mountainbike", 16);
		products[2] = new Bike("Gaint", 2400.0, 1, "Roadbike", 17);
		products[3] = new Milk("Молоко", 3.0, 1, "Савушкин продукт", 1.0, 10.0);

//<<<<<<< HEAD
////		deal.setBuyer(buyer);
////		deal.setSeller(seller);
//
//=======
//		deal.setBuyer(buyer);
//		deal.setSeller(seller);
//>>>>>>> branch 'master' of https://github.com/Gomerok/academy.git
//		deal.setProducts(products);
//
//		DealMenu menu = new DealMenu(deal);
//
//<<<<<<< HEAD
//		System.out.println(products[0].getPrice());
//		System.out.println(products[1].getPrice());
//		System.out.println(products[2].getPrice());
//=======
//		menu.dealMenu();
//
//>>>>>>> branch 'master' of https://github.com/Gomerok/academy.git
	}

}
